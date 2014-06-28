create table if not exists todos (
  id serial  primary key,
  creation_time timestamp not null default current_timestamp,
  description character varying(500),
  modification_time timestamp not null default current_timestamp,
  title character varying(100)
);