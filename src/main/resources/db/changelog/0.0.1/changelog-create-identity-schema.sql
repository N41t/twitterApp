--liquibase formatted sql

--changeset MikhailBelozerov:create-identity-schema
--comment create new identity schema
create schema identity;
--rollback drop schema identity;


--changeset MikhailBelozerov:create-identity-user_accounts-table
--comment create table identity.user_accounts
create table identity.user_accounts
(
    id       serial primary key,
    username    varchar(32) unique not null,
    password varchar(128) not null
);
--rollback drop table identity.user_accounts;


--changeset MikhailBelozerov:create-identity-user_roles-table
--comment create table identity.user_roles
create table identity.user_accounts
(
    id        serial primary key,
    authority varchar(32) unique not null
);
--rollback drop table identity.user_roles;