--CREATE SCHEMA IF NOT EXISTS security_app_schema;

CREATE TABLE users
(
    id        BIGSERIAL PRIMARY KEY,        -- Auto-incrementing primary key
    username  VARCHAR(255) UNIQUE NOT NULL, -- Unique username
    password  VARCHAR(100)        NOT NULL,
    enabled   BOOLEAN             NOT NULL,
    authority VARCHAR(20)         NOT NULL,
    role      VARCHAR(20)         NOT NULL

);

CREATE TABLE authorities
(
    username  VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    FOREIGN KEY (username) REFERENCES users (username)
);