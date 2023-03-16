FROM liquibase/liquibase
COPY . .
ENTRYPOINT liquibase --url=jdbc:postgresql://employee_postgres:5432/postgres --username=postgres --password=postgres --changelog-file=changelog.sql update