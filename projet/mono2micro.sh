#!/bin/sh

APP_NAME="petclinic"

#docker run -e LICENSE=accept --rm -it -v "$(pwd)/data/$APP_NAME/code:/var/application" ibmcom/mono2micro-bluejay /var/application/monolith out

#docker run --rm -it -v "$(pwd)/data/$APP_NAME/:/app/output" khalsell/flicker_python -a flicker_context.json

docker run -e LICENSE=accept --rm -it -v $(pwd)/data/$APP_NAME/mono2micro_input:/var/application ibmcom/mono2micro-aipl recommend
