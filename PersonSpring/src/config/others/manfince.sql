CRATE DATABASE manfince;

USE DATABASE manfince;

create table t_user (
	user_id int (20) not null auto_increment,
	user_login_name varchar (50) default null comment '登陆用户名',
	user_password varchar (50) default null comment '用户密码',
	user_email varchar (50) default null comment '用户EMAIL',
	user_regdate datetime default null comment '注册日期',
    user_lastdate datetime default null comment '最近登录日期',
    user_last_ip varchar(50) default null comment'IP',
	primary key (USER_ID)
) engine = innodb default charset = utf8 comment '用户表';

insert into t_user(user_login_name,user_password,user_email,user_regdate,user_lastdate,user_last_ip) values('liutao','111111','liutao@test.com',now(),now(),'127.0.0.1');
insert into t_user(user_login_name,user_password,user_email,user_regdate,user_lastdate,user_last_ip) values('liutao2','111111','liutao2@test.com',now(),now(),'127.0.0.1');

#################################################################################################################

CREATE TABLE t_money_category (
	ID INT (20) NOT NULL AUTO_INCREMENT,
	category_type VARCHAR (100) DEFAULT NULL COMMENT '类型',
	name VARCHAR (100) DEFAULT NULL COMMENT '名称',
	base_id INT (20) DEFAULT NULL COMMENT '父类型ID',
    type_flag int(20) DEFAULT NULL COMMENT '标识父类型或子类型 0 父类型 1子类型',
	PRIMARY KEY (category_ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '类型表';

INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("收入","股票收入",0,0); 
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("收入","基金收入",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("收入","彩票收入",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("收入","其他收入",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("收入","工资",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("收入","奖金",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("收入","兼职",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("收入","利息",0,0);

INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","彩票投资",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","孝敬父母",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","其他杂项",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","金融保险",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","医疗保健",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","人情往来",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","学习进修",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","休闲娱乐",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","交流通讯",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","行车交通",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","居家物业",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","食品酒水",0,0);
INSERT INTO `manfince`.`t_money_category`(`category_type`,`name`,`base_id`,`type_flag`)VALUES ("支出","衣服饰品",0,0);
                                                                                                           

#################################################################################################################

CREATE TABLE t_money_debt (
	id INT (20) NOT NULL AUTO_INCREMENT,
	debt_type INT (20) DEFAULT NULL COMMENT '债务类型 0 借入 1借出',
	amount  FLOAT(9,2) DEFAULT NULL COMMENT '债务金额',
	dist_name VARCHAR (50) DEFAULT NULL COMMENT '债务人名称',
	create_date DATETIME DEFAULT NULL COMMENT '创建日期',
	remark VARCHAR (1024) DEFAULT NULL COMMENT '账户备注 ',
	PRIMARY KEY (debt_id) 
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '债务表';


INSERT INTO `manfince`.`t_money_debt`(`debt_type`,`amount`,`dist_name`,`create_date`,`remark`) VALUES (1,3000,"刘鹏",now(),'');
INSERT INTO `manfince`.`t_money_debt`(`debt_type`,`amount`,`dist_name`,`create_date`,`remark`) VALUES (1,3500,"刘晗",now(),'');
INSERT INTO `manfince`.`t_money_debt`(`debt_type`,`amount`,`dist_name`,`create_date`,`remark`) VALUES (1,4500,"刘斌",now(),'');
INSERT INTO `manfince`.`t_money_debt`(`debt_type`,`amount`,`dist_name`,`create_date`,`remark`) VALUES (1,10000,"陈亚丽",now(),'');

#################################################################################################################

CREATE TABLE t_money_income (
	id INT (20) NOT NULL AUTO_INCREMENT,
	income_type INT (20) DEFAULT NULL COMMENT '收入类型',
	amount  FLOAT(9,2) DEFAULT NULL COMMENT '收入金额',
	create_date DATETIME DEFAULT NULL COMMENT '创建日期',
	remark VARCHAR (1024) DEFAULT NULL COMMENT '备注 ',
	PRIMARY KEY (id) 
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '收入表';

INSERT INTO `manfince`.`t_money_income`(`income_type`,`amount`,`create_date`,`remark`)VALUES(2,20,now(),'');
INSERT INTO `manfince`.`t_money_income`(`income_type`,`amount`,`create_date`,`remark`)VALUES(3,30,now(),'');
INSERT INTO `manfince`.`t_money_income`(`income_type`,`amount`,`create_date`,`remark`)VALUES(4,22,now(),'');
INSERT INTO `manfince`.`t_money_income`(`income_type`,`amount`,`create_date`,`remark`)VALUES(1,33,now(),'');

#################################################################################################################

CREATE TABLE t_money_spend (
	id INT (20) NOT NULL AUTO_INCREMENT,
	spend_type INT (20) DEFAULT NULL COMMENT '支出类型',
	amount  FLOAT(9,2) DEFAULT NULL COMMENT '支出金额',
	create_date DATETIME DEFAULT NULL COMMENT '创建日期',
	remark VARCHAR (1024) DEFAULT NULL COMMENT '备注 ',
	PRIMARY KEY (id) 
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '支出表';

INSERT INTO `manfince`.`t_money_spend`(`spend_type`,`amount`,`create_date`,`remark`)VALUES(9,20,now(),'');
INSERT INTO `manfince`.`t_money_spend`(`spend_type`,`amount`,`create_date`,`remark`)VALUES(8,30,now(),'');
INSERT INTO `manfince`.`t_money_spend`(`spend_type`,`amount`,`create_date`,`remark`)VALUES(11,22,now(),'');
INSERT INTO `manfince`.`t_money_spend`(`spend_type`,`amount`,`create_date`,`remark`)VALUES(10,33,now(),'');

#################################################################################################################

CREATE TABLE t_money_regular (
	debt_id INT (20) NOT NULL AUTO_INCREMENT,
	debt_type INT (20) DEFAULT NULL COMMENT '债务类型 0 借入 1借出',
	debt_amount  FLOAT(9,2) DEFAULT NULL COMMENT '债务金额',
	debt_dist_name VARCHAR (50) DEFAULT NULL COMMENT '债务人名称',
	debt_create_date DATETIME DEFAULT NULL COMMENT '创建日期',
	debt_remark VARCHAR (1024) DEFAULT NULL COMMENT '账户备注 ',
	PRIMARY KEY (debt_id) 
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '债务表';

#################################################################################################################

CREATE TABLE t_money_invest (
	debt_id INT (20) NOT NULL AUTO_INCREMENT,
	debt_type INT (20) DEFAULT NULL COMMENT '债务类型 0 借入 1借出',
	debt_amount  FLOAT(9,2) DEFAULT NULL COMMENT '债务金额',
	debt_dist_name VARCHAR (50) DEFAULT NULL COMMENT '债务人名称',
	debt_create_date DATETIME DEFAULT NULL COMMENT '创建日期',
	debt_remark VARCHAR (1024) DEFAULT NULL COMMENT '账户备注 ',
	PRIMARY KEY (debt_id) 
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '债务表';

#################################################################################################################


CREATE TABLE t_money_report_balance (
	debt_id INT (20) NOT NULL AUTO_INCREMENT,
	debt_type INT (20) DEFAULT NULL COMMENT '债务类型 0 借入 1借出',
	debt_amount  FLOAT(9,2) DEFAULT NULL COMMENT '债务金额',
	debt_dist_name VARCHAR (50) DEFAULT NULL COMMENT '债务人名称',
	debt_create_date DATETIME DEFAULT NULL COMMENT '创建日期',
	debt_remark VARCHAR (1024) DEFAULT NULL COMMENT '账户备注 ',
	PRIMARY KEY (debt_id) 
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '债务表';

#################################################################################################################