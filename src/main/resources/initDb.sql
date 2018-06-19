DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq
  START 100;

CREATE TABLE users (
  id         integer   not null primary key default nextval('global_seq'),
  name       varchar   not null,
  isAdmin    boolean,
  createDate TIMESTAMP not null

)