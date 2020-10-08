insert into domain values(1, "Engineering");
insert into domain values(2, "Marketing");
insert into domain values(3, "Sales");
insert into domain values(4, "HR");

insert into role(id, name, experience) values(1, "Intern", 0);
insert into role(id, name, experience) values(2, "SDE-1", 2);
insert into role(id, name, experience) values(3, "SDE-2", 3);
insert into role(id, name, experience) values(4, "SDE-3", 5);
insert into role(id, name, experience) values(5, "Manager", 6);
insert into role(id, name, experience) values(6, "Senior Manager", 10);
insert into role(id, name, experience) values(7, "Director", 15);

insert into team values(1, "Documentum");
insert into team values(2, "Archive Server");
insert into team values(3, "Info Archive");
insert into team values(4, "ECM");

insert into vacancy(id, domain_id, team_id, role_id, status) values(10000, 1, 1, 2, 'Open');
insert into vacancy(id, domain_id, team_id, role_id, status) values(20000, 1, 2, 5, 'Open');
insert into vacancy(id, domain_id, team_id, role_id, status) values(30000, 4, 4, 7, 'Open');
insert into vacancy(id, domain_id, team_id, role_id, status) values(40000, 2, 2, 5, 'Open');