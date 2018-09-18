# Bauen

    docker build -t dockerintro .


# Starten

    docker run -d -p 8080:8080 dockerintro

Endpunkte:

- http://localhost:8080/status
- http://localhost:8080/counter (erfordert Redis)


# Mit Redis starten (+ ggf. bauen)

    docker-compose up -d
