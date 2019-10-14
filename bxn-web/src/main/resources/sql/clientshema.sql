create table forum_user
(
    uid        int not null auto_increment primary key,
    name       varchar(20),
    password   varchar(50),
    favicon    varchar(20),
    remaining  double,
    point      long,
    createtime datetime,
    updatetime datetime
);

create table forum_post
(
    pid        int         not null auto_increment primary key,
    name       varchar(50) not null,
    category   varchar(100),
    label      varchar(100),
    content    varchar(1000),
    picpath    varchar(100),
    watchnum   long,
    commentnum long,
    createtime datetime,
    updatetime datetime
);

create table forum_comment
(
    cid        int not null auto_increment primary key,
    userid     long,
    postid     long,
    likenum    long,
    unlike     long,
    content    varchar(200),
    createtime datetime,
    updatetime datetime
)