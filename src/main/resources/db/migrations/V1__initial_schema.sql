create sequence if not exists public.hibernate_sequence start 1 increment 1;

create table users(
    id integer not null,
    name varchar(255) not null,
    age integer not null,
    constraint user_pkey primary key (id)
);