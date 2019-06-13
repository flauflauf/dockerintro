# dockerintro

Code für Docker-Live-Demo mit einfachem Java Spring Boot Container und Redis-DB im Hintergrund

## Bauen

    docker build -t dockerintro .


## Starten

    docker run --rm -it -p 8080:8080 dockerintro

Endpunkte:

- http://localhost:8080/status
- http://localhost:8080/counter (erfordert Redis)


## Mit Redis starten (+ ggf. bauen)

    docker-compose up
