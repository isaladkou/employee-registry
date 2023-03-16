-- liquibase formatted sql

-- changeset isaladkou:1
CREATE SCHEMA employees_schema;
CREATE TABLE employees_schema.employee
(
    id         serial PRIMARY KEY,
    first_name varchar(50),
    last_name  varchar(50),
    position   varchar(50)
)
INSERT INTO employees_schema.employee (first_name, last_name, position) VALUES
('Ivan','Saladkou','Junior java developer'),
('Ivan', 'Parkhomenka', 'Middle java developer');