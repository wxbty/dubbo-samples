if ! ls /tmp/jmh_result*.json -1q &> /dev/null; then
    echo "No file matching /tmp/jmh_result*.json exists. Exiting..."
    exit 0
fi

needTrace=$2

if [ "$needTrace" = "1" ]; then
    if ! ls /tmp/jmh_trace*.json -1q &> /dev/null; then
        echo "No file matching /tmp/jmh_trace*.json exists. Exiting..."
        exit 0
    fi
fi

git clone --depth 1 https://github.com/${RESULTS_REPO_OWNER}/${RESULTS_REPO_NAME}.git jmh_result
cd jmh_result
git config user.email ${PUSH_EMAIL}
git config user.name ${RESULTS_REPO_OWNER}

WORK_DIR="$(pwd)"
echo "WorkDir: $WORK_DIR"

DIRECTORY_PATH="$WORK_DIR/test-results/$1"
if [ ! -d ${DIRECTORY_PATH} ]; then
    mkdir -p $DIRECTORY_PATH
fi

current_timestamp=$(date +%s%N | cut -b1-13)

for file in /tmp/jmh_result*.json; do
    new_file="${DIRECTORY_PATH}/jmh_result_$(date +%Y%m%d_%H%M%S_%N).json"
    jq --arg timestamp "$current_timestamp" --arg commitId "$GITHUB_SHA" 'map(.params.time = $timestamp | . + {commitId: $commitId})' "$file" > "$new_file"
done

cd $DIRECTORY_PATH
if [ $? -eq 0 ]; then
    num=`ls $DIRECTORY_PATH -l | grep '^-' | wc -l`;
    if [ $num -gt 50 ]; then
      num=`expr $num - 50`
      ls -l $DIRECTORY_PATH | awk '{print $9}' | sort | head -$num | xargs -i -n1 rm {}
    fi
fi

merged_file="merged_results.json"

json_array=()
for file in $(ls -t1 "$DIRECTORY_PATH"/jmh_result*.json); do
    if [ -f "$file" ]; then
      json_array+=( "$(cat "$file")" )
    fi
done

merged_json=$(echo "${json_array[@]}" | jq -s add)
echo "$merged_json" > "$DIRECTORY_PATH/$merged_file"

if [ "$needTrace" = "1" ]; then
    TRACE_PATH="$DIRECTORY_PATH/trace"
    if [ ! -d ${TRACE_PATH} ]; then
        mkdir -p $TRACE_PATH; else
        rm $TRACE_PATH/*
    fi

    cp /tmp/jmh_trace*.json "$TRACE_PATH"

    merged_trace_file="merged_traces.json"

    json_array=()
    for file in $(ls -t1 "$TRACE_PATH"/jmh_trace*.json); do
    if [ -f "$file" ]; then
      json_array+=( "$(cat "$file")" )
    fi
    done

    merged_json=$(echo "${json_array[@]}" | jq -s add)
    echo "$merged_json" > "$TRACE_PATH/$merged_trace_file"
fi

git add $DIRECTORY_PATH
git commit -m "Add test results 1 from $(date +'%Y-%m-%d %H:%M:%S')"
git pull --rebase
git push https://${GITHUB_TOKEN}@github.com/${RESULTS_REPO_OWNER}/${RESULTS_REPO_NAME}.git ${RESULTS_REPO_BRANCH}
