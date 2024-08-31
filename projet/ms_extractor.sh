#!/bin/sh

CURAPP="petclinic"

#docker run -it --rm -v $(pwd)/data/$CURAPP/code/monolith:/input/ -v $(pwd)/data/$CURAPP/static_analysis/:/output/ dcalsel/decomp-java-analysis-service:lab analyze $CURAPP -p /input -o /output

#docker run -it --rm -v $(pwd)/data/$CURAPP/static_analysis/$CURAPP:/input/ -v $(pwd)/data/$CURAPP/parsing_results/:/output/ dcalsel/decomp-parsing-service:lab parse $CURAPP -f CSV -d /input -o /output

#docker run -it --rm -v $(pwd)/data/:/output/ -v $(pwd)/data/$CURAPP/parsing_results/$CURAPP:/data -v $(pwd)/scripts:/script/ --entrypoint python3 dcalsel/decomp-parsing-service:lab /script/to_msextractor.py $CURAPP

docker run -it --rm -v $(pwd)/decompositions/msextractor/:/output -v $(pwd)/data:/data dcalsel/msextractor:lab $CURAPP --data /data --output /output
