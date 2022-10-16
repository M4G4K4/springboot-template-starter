create sequence if not exists public.hibernate_sequence start 1 increment 1;

create table users(
    id varchar(255) not null,
    name varchar(255) not null,
    constraint user_pkey primary key (id)
);