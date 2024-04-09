drop table if exists movies cascade;
drop table if exists rentals cascade;

create table horst (
    title text
)

-- id integer identity primary key

-- create table movies (
--     id serial primary key,
--     title text,
--     description text
-- )
-- ;
-- create table rentals (
--     id serial primary key,
--     movies bigint references movies(id),
--     duration text,
--     price integer
-- )
-- ;


-- create table movies (
--     id serial primary key,
--     title text,
--     description text
-- )
-- ;
-- create table rentals (
--     id serial primary key,
--     movies bigint references movies(id),
--     movies_key bigint,
--     duration text,
--     price integer
-- )
-- ;



-- select * from movies
-- left join rentals r on movies.id = r.movies
