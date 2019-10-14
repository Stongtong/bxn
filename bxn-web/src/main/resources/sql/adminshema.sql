create table forum_admin
(
    aid        int not null auto_increment primary key,
    name       varchar(20),
    password   varchar(50),
    favicon    varchar(20),
    createtime datetime,
    updatetime datetime
);

create table forum_carousel
(
    cid         int not null auto_increment primary key,
    name        varchar(100),
    description varchar(200),
    path        varchar(100)
);

create table forum_category
(
    cid         int not null auto_increment primary key,
    name        varchar(20),
    category    varchar(20),
    description varchar(100)
)