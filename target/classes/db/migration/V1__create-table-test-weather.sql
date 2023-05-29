create table if not exists weathers (
    id bigint not null auto_increment,
    city_name varchar(255) not null,
    city_country varchar(255) not null,
    main varchar(255) not null,
    description varchar(255) not null,
    timer varchar(50) not null,
    primary key (id)
);