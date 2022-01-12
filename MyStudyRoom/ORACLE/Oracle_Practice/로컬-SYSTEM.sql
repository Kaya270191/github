create user sqlDB2 identified by 1234
default tablespace users
temporary tablespace temp;

grant connect, resource, dba to sqldb2;