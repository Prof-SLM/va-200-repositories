drop table if exists persons;
drop table if exists companies;

create table if not exists companies (
    id      identity PRIMARY KEY,
    name    varchar2,
    updated timestamp,
    created timestamp
);

create table if not exists persons (
    id            identity PRIMARY KEY,
    first_name    varchar(30),
    last_name     varchar(30),
    date_of_birth date,
    updated       timestamp,
    created       timestamp,
    companies_key int,
    companies     bigint references companies (id)
);





-- drop table if exists persons;
-- drop table if exists companies;
--
-- create table companies (
--     id bigint IDENTITY PRIMARY KEY,
--     name varchar(40),
--     updated timestamp
-- --     version int
-- );
--
-- create table persons (
--     id bigint IDENTITY PRIMARY KEY,
--     first_name varchar(30),
--     last_name varchar(30),
--     date_of_birth date,
--     updated timestamp,
--     fk_company bigint references companies(id)
-- );