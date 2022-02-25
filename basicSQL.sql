create table bindrole
(
    bindId     int auto_increment
        primary key,
    userName   varchar(50)                        not null,
    roleName   varchar(50)                        not null,
    createTime datetime default CURRENT_TIMESTAMP null comment '插入时间',
    changeTime datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '修改时间'
);

create table role
(
    roleId     int               not null comment '角色ID'
        primary key,
    roleName   varchar(10)       not null comment '角色名',
    roleAuth   int(1)            not null comment '角色权限',
    roleStatus tinyint default 0 not null comment '角色状态',
    constraint role_roleId_uindex
        unique (roleId)
)
    comment '角色';

create table user
(
    id         int(10) auto_increment
        primary key,
    username   varchar(50)                          not null,
    password   varchar(50)                          not null,
    createtime datetime   default CURRENT_TIMESTAMP not null,
    role       int                                  not null,
    enable     tinyint(1) default 0                 not null
);


