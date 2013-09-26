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
	id INT (20) NOT NULL AUTO_INCREMENT,
	category_type VARCHAR (100) DEFAULT NULL COMMENT '类型',
	name VARCHAR (100) DEFAULT NULL COMMENT '名称',
	PRIMARY KEY (id)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '类型表';

INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("收入","股票收入");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("收入","基金收入");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("收入","彩票收入");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("收入","其他收入");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("收入","工资");      
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("收入","奖金");      
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("收入","兼职");      
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("收入","利息");      
                                                                                   
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","彩票投资");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","孝敬父母");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","其他杂项");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","金融保险");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","医疗保健");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","人情往来");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","学习进修");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","休闲娱乐");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","交流通讯");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","行车交通");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","居家物业");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","食品酒水");  
INSERT INTO `t_money_category`(`category_type`,`name`)VALUES ("支出","衣服饰品");  
                                                                                   



#################################################################################################################

CREATE TABLE t_money_debt (
	id INT (20) NOT NULL AUTO_INCREMENT,
	debt_type  VARCHAR (50) DEFAULT NULL COMMENT '借入，借出',
	amount  FLOAT(9,2) DEFAULT NULL COMMENT '债务金额',
	dist_name VARCHAR (50) DEFAULT NULL COMMENT '债务人名称',
	create_date DATETIME DEFAULT NULL COMMENT '创建日期',
	remark VARCHAR (1024) DEFAULT NULL COMMENT '账户备注 ',
	PRIMARY KEY (id) 
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '债务表';

INSERT INTO `t_money_debt`(`debt_type`,`amount`,`dist_name`,`create_date`,`remark`) VALUES ("借出",3000,"刘鹏",now(),'');   
INSERT INTO `t_money_debt`(`debt_type`,`amount`,`dist_name`,`create_date`,`remark`) VALUES ("借出",3500,"刘晗",now(),'');   
INSERT INTO `t_money_debt`(`debt_type`,`amount`,`dist_name`,`create_date`,`remark`) VALUES ("借出",4500,"刘斌",now(),'');   
INSERT INTO `t_money_debt`(`debt_type`,`amount`,`dist_name`,`create_date`,`remark`) VALUES ("借出",10000,"陈亚丽",now(),'');

#################################################################################################################

CREATE TABLE t_money_income (
	id INT (20) NOT NULL AUTO_INCREMENT,
	income_type INT (20) DEFAULT NULL COMMENT '收入类型',
	amount  FLOAT(9,2) DEFAULT NULL COMMENT '收入金额',
	create_date DATETIME DEFAULT NULL COMMENT '创建日期',
	remark VARCHAR (1024) DEFAULT NULL COMMENT '备注 ',
	PRIMARY KEY (id) 
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '收入表';

INSERT INTO `t_money_income`(`income_type`,`amount`,`create_date`,`remark`)VALUES(2,20,now(),'');
INSERT INTO `t_money_income`(`income_type`,`amount`,`create_date`,`remark`)VALUES(3,30,now(),'');
INSERT INTO `t_money_income`(`income_type`,`amount`,`create_date`,`remark`)VALUES(4,22,now(),'');
INSERT INTO `t_money_income`(`income_type`,`amount`,`create_date`,`remark`)VALUES(1,33,now(),'');


#################################################################################################################

CREATE TABLE t_money_spend (
	id INT (20) NOT NULL AUTO_INCREMENT,
	spend_type INT (20) DEFAULT NULL COMMENT '支出类型',
	amount  FLOAT(9,2) DEFAULT NULL COMMENT '支出金额',
	create_date DATETIME DEFAULT NULL COMMENT '创建日期',
	remark VARCHAR (1024) DEFAULT NULL COMMENT '备注 ',
	PRIMARY KEY (id) 
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '支出表';

INSERT INTO `t_money_spend`(`spend_type`,`amount`,`create_date`,`remark`)VALUES(9,20,now(),'');
INSERT INTO `t_money_spend`(`spend_type`,`amount`,`create_date`,`remark`)VALUES(8,30,now(),'');
INSERT INTO `t_money_spend`(`spend_type`,`amount`,`create_date`,`remark`)VALUES(11,22,now(),'');
INSERT INTO `t_money_spend`(`spend_type`,`amount`,`create_date`,`remark`)VALUES(10,33,now(),'');

#################################################################################################################

CREATE TABLE t_money_regular (
        id INT (20) NOT NULL AUTO_INCREMENT,
        regular_type INT (20) DEFAULT NULL COMMENT '类型',
        amount  FLOAT(9,2) DEFAULT NULL COMMENT '金额',
        cycle VARCHAR (50) DEFAULT NULL COMMENT '周期 每天，每周，每月，每年',
        start_date DATETIME DEFAULT NULL COMMENT '开始日期',
        last_date DATETIME DEFAULT NULL COMMENT '最后执行日期',
        exe_time INT (20) DEFAULT NULL COMMENT '执行次数',
        remark VARCHAR (1024) DEFAULT NULL COMMENT '备注 ',
        PRIMARY KEY (id) 
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '定期周期表';


INSERT INTO `t_money_regular`(`regular_type`,`amount`,`cycle`,`start_date`,`last_date`,`exe_time`,`remark`)VALUES(2,33.22,"每周",now(),now(),2,"");
INSERT INTO `t_money_regular`(`regular_type`,`amount`,`cycle`,`start_date`,`last_date`,`exe_time`,`remark`)VALUES(2,22.22,"每天",now(),now(),2,"");
INSERT INTO `t_money_regular`(`regular_type`,`amount`,`cycle`,`start_date`,`last_date`,`exe_time`,`remark`)VALUES(2,11.22,"每月",now(),now(),2,"");


#################################################################################################################

CREATE TABLE t_money_invest (
        id INT (20) NOT NULL AUTO_INCREMENT,
        invest_type VARCHAR (50) DEFAULT NULL COMMENT '类型',
        amount  FLOAT(9,2) DEFAULT NULL COMMENT '投资金额',
        create_date DATETIME DEFAULT NULL COMMENT '创建日期',
        invest_flag VARCHAR (50) DEFAULT NULL COMMENT '投资或者收益',
        remark VARCHAR (1024) DEFAULT NULL COMMENT '备注 ',
        PRIMARY KEY (id)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '投资表';

INSERT INTO `t_money_invest`(`invest_type`,`amount`,`create_date`,`invest_flag`,`remark`)VALUES("投资",22.22,now(),0,"");
INSERT INTO `t_money_invest`(`invest_type`,`amount`,`create_date`,`invest_flag`,`remark`)VALUES("投资",22.22,now(),0,"");
INSERT INTO `t_money_invest`(`invest_type`,`amount`,`create_date`,`invest_flag`,`remark`)VALUES("投资",22.22,now(),0,"");

#################################################################################################################

CREATE TABLE t_money_current_balance (
        id INT (20) NOT NULL AUTO_INCREMENT,
        income_amount  FLOAT(9,2) DEFAULT NULL COMMENT '收入',
        outcome_amount FLOAT(9,2) DEFAULT NULL COMMENT '支出',
        debt_amount FLOAT(9,2) DEFAULT NULL COMMENT '债务',
        invest_amount FLOAT(9,2) DEFAULT NULL COMMENT '投资',
        balance_amount FLOAT(9,2) DEFAULT NULL COMMENT '余额',
        remark VARCHAR (1024) DEFAULT NULL COMMENT '备注 ',
        PRIMARY KEY (id)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '余额表';

#################################################################################################################