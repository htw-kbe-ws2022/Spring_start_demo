# for Docker
docker run --name myPostgresDb -p 5455:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=db -d postgres

# Datenbank stoppen:
docker stop myPostgresDb
# Datenbank starten:
docker start myPostgresDb
# Datenbank löschen:
docker delete myPostgresDb

# Anwendung  bauen :
docker build --build-arg JAR_FILE=target/*.jar -t jpl/backend_fruits .
docker run -p 8080:8080 jpl/backend_fruits