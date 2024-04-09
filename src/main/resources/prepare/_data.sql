
-- insert into persons(first_name, last_name, date_of_birth, version, updated, fk_company)  values ('Joe', 'Müller', '1979-03-23', 1, CURRENT_TIMESTAMP, 1);
-- insert into persons(first_name, last_name, date_of_birth, version, updated, fk_company)  values ('John', 'Rambo', '1989-03-23', 1, CURRENT_TIMESTAMP, 1);
-- insert into persons(first_name, last_name, date_of_birth, version, updated, fk_company)  values ('Icke', 'Die Klinge', '1971-03-23', 1, CURRENT_TIMESTAMP, 1);

insert into companies(id, name, updated) values (-1, 'SPG-Enterprises', CURRENT_TIMESTAMP);

insert into persons(id, first_name, last_name, date_of_birth, updated, companies_key, companies)  values
    (-1, 'Joe', 'Müller', '1979-03-23',      CURRENT_TIMESTAMP, 1, 1),
    (-2, 'John', 'Rambo', '1989-03-23',      CURRENT_TIMESTAMP, 1, 1),
    (-3, 'Icke', 'Die Klinge', '1971-03-23', CURRENT_TIMESTAMP, 1, 1)
;