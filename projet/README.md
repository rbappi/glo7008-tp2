# Pré-requis

- Docker
- Git CLI
- Python 3

# Contenu de repo


- "data/": Un dossier qui contient les données des applications:
    -  petclinic:
        - dossier du code source
        - "petclinic_monolith.json": liste des classes
    -  plants:
        - dossier du code source
        - "plants_monolith.json": liste des classes
- "scripts/": quelques fichiers qui aident à l'utilisation des approches.
- "docker-compose.yaml": fichier nécessaire pour lancer le plateforme d'évaluation


# Lancer l'outil d'évaluation:
```bash
docker compose up
```
Ensuite, le plateforme est accessible par http://localhost:3000


# Utilisation des approches
## MSExtractor


1. Choisir l'application à decomposer (par exemple petclinic). On suppose aussi que le chemin courant est ce répertoire:
    ```bash
    export CURAPP="petclinic"
    ```
2. Charger toutes les images docker nécessaires:
    ```bash
    docker pull dcalsel/decomp-java-analysis-service:lab
    docker pull dcalsel/decomp-parsing-service:lab
    docker pull dcalsel/msextractor:lab
    ```
3. Analyser le code source:
    ```bash
    mkdir ./data/$CURAPP/static_analysis
    docker run -it --rm -v ./data/$CURAPP/source_code/:/input/ -v ./data/$CURAPP/static_analysis/:/output/ dcalsel/decomp-java-analysis-service:lab analyze $CURAPP -p /input -o /output
    ```
4. Transformer les résultats d'analyse à des données intermédiaires:
    ```bash
    mkdir ./data/$CURAPP/parsing_results
    docker run -it --rm -v ./data/$CURAPP/static_analysis/$CURAPP:/input -v ./data/$CURAPP/parsing_results/:/output/ dcalsel/decomp-parsing-service:lab parse $CURAPP -f CSV -d /input/ -o /output/
    ```
5. Préparer les résultats pour MSextractor:
    ```bash
    docker run -it --rm -v ./data:/output -v ./data/$CURAPP/parsing_results/$CURAPP:/data/ -v ./scripts:/script/ --entrypoint python3 dcalsel/decomp-parsing-service:lab /script/to_msextractor.py $CURAPP
    ```
6. Exécuter MSExtractor:
    ```bash
    mkdir decompositions
    mkdir decompositions/msextractor
    docker run -it --rm -v ./decompositions/msextractor/:/output -v ./data:/data dcalsel/msextractor:lab $CURAPP --data /data --output /output 
    ```
    Vous pouvez voir comment personnaliser les hyper-paramètres de l'approche avec l'argument "--help"

7. Le résultat de la décomposition se trouve dans le répertoire "./decompositions/msextractor/petclinic". Chaque exécution de l'approche génére un nom unique pour le résultat et un dossier avec ce nom (par exemple "petclinic_202311262349"). La décomposition est specifié dans un fichier nommé "decomposition.json" dans ce dossier.



## TopicDecomp

1. Choisir l'application à decomposer (par exemple petclinic). On suppose aussi que le chemin courant est ce répertoire:
    ```bash
    export CURAPP="petclinic"
    ```
2. Charger tous les images docker nécessaires:
    ```bash
    docker pull dcalsel/topicdecomp:lab
    ```
3. Exécuter TopicDecomp:
    ```bash
    mkdir decompositions
    mkdir decompositions/topicdecomp
    docker run -it --rm -v ./decompositions/topicdecomp/:/outputs dcalsel/topicdecomp:lab $CURAPP
    ```
    Vous pouvez voir comment personnaliser les hyper-paramètres de l'approche avec l'argument "--help"
4. Le résultat de la décomposition se trouve dans le répertoire "./decompositions/msextractor/petclinic". Par défault, cette approche génére plusieurs résultats.


## Mono2micro

1. Suivre les étapes du laboratoire de Mono2micro pour générer la décomposition. Utiliser les applications de ce TP ainsi que leur code source. (Attention: l'application Petclinic du labo est différente de celle du TP) 
2. Afin de faciliter la construction des application monolithique aprés la modification avec BlueJay, on fournit un fichier de type Dockerfile pour chacune des applications. Plus de détails sont fournie dans la section de chaque application.
3. Utiliser Mono2micro afin de générer tous les résultats dans le dossier "mono2micro/mono2micro-output". Pour manipuler les hyper-paramètres de Mono2micro, il faut modifier le fichier "config.ini" dans le dossier "mono2micro_input". Ce fichier est généré automatiquement après la première utilisation de Mono2micro.
4. Trouver le fichier "final_graph.json" dans ce dossier.
5. Transformer ce fichier vers le format de décomposition specifié dans le TP:
    ```bash
    mkdir decompositions
    mkdir decompositions/mono2micro
    python ./scripts/mono2micro_parser.py $PATH_TO_GRAPH_FILE/graph.json ./decompositions/mono2micro
    ```



# Construction les applications monolithiques:
Il est possible de compiler et lancer les 2 applications avec 2 options: (Attention: utiliser le code source fourni avec ce répertoire)
## Avec Docker:
Supposons que le chemin courant est celui de ce répertoire et que le code source de l'application est dans la variable PATH_TO_SRC_CODE. On prends par exemple l'application "plants"
```bash
echo CURAPP="plants"
cp ./scripts/Dockerfile_$CURAPP $PATH_TO_SRC_CODE/Dockerfile
cd $PATH_TO_SRC_CODE
docker build --tag my_${CURAPP}_app_image .
```
Ensuite, pour lancer les applications:
- Pour plants: 
    ```bash
    docker run -it --rm -p 9080:9080 my_${CURAPP}_app_image
    ```
    L'application sera accessible par le lien http://localhost:9080/PlantsByWebSphere 

- Pour petclinic: 
    ```bash
    docker run -it --rm -p 8080:8080 my_${CURAPP}_app_image
    ```
    L'application sera accessible par le lien http://localhost:8080
## Sans Docker:
Dans ce cas, vous devez installer les dépendances de l'application et la construire dans votre machine hôte.
### Petclinic:
#### Dépendances:
- Java 8
- Maven 3.8.6
#### Installation:
Il suffit d'exécuter cette ligne pour contruire et lancer l'application.
```bash
./mvnw jetty:run-war
```
Ensuite, l'application sera accéssible à travers http://localhost:8080
### Plants:
#### Dépendances:
- Java 7
- Gradle 5.2.1
#### Installation:
Il suffit d'exécuter cette ligne pour contruire et lancer l'application.
```bash
./gradlew installApps copyServerLibs libertyRun --no-daemon
```
Ensuite, l'application sera accéssible à travers http://localhost:9080/PlantsByWebSphere








