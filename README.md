###How to build docker image
Run from project folder `docker build -t beer-store-app:latest .`

###How to run docker container from image
Run `docker run --publish 8080:8080 --name beer-store-app beer-store-app:latest`