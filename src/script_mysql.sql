create table user(
	id		int	auto_increment,
	name	varchar(50),
	age		int,
	CONSTRAINT u_pk primary key (id)
);

insert into user values(default, 'taotling0',35);
insert into user values(default, 'taotling1',36);
insert into user values(default, 'taotling2',36);
insert into user values(default, 'taotling3',34);
insert into user values(default, 'taotling4',34);