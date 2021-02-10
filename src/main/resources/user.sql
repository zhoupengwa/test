create table user
(
    id           bigint       not null auto_increment comment '用户ID',
    username     varchar(20)  not null comment '用户名称',
    age          int          not null comment '年龄',
    home_address varchar(128) not null default '未知地址' comment '家庭住址',

    primary key (id),
    key idx_username (username)
) comment '用户信息表';