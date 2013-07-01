CRATE DATABASE PERSONSPRING;

USE DATABASE PERSONSPRING;

CREATE TABLE USER (
	USERID INT (20) NOT NULL AUTO_INCREMENT,
	USERNAME VARCHAR (50) DEFAULT NULL ,
	PASSWORD VARCHAR (50) DEFAULT NULL ,
	REALNAME VARCHAR(50) DEFAULT NULL ,
	PHONENUM VARCHAR(50) DEFAULT NULL ,
	BIRTHDAY DATETIME DEFAULT NULL ,
	REGISTERDATE DATETIME DEFAULT NULL ,
	LEVEL INT DEFAULT NULL,
	PRIMARY KEY(USERID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 ;

INSERT INTO USER(USERNAME,PASSWORD) VALUES('LILEI','111111');

CREATE TABLE T_LOGIN (
	LOGIN_ID INT (20) NOT NULL AUTO_INCREMENT,
	LOGIN_NAME VARCHAR (50) DEFAULT NULL UNIQUE COMMENT '注册登录名限制为EMAIL，唯一',
	LOGIN_EMAIL VARCHAR (50) DEFAULT NULL UNIQUE COMMENT '注册Email限制为EMAIL，唯一',
	LOGIN_PWD VARCHAR (50) DEFAULT NULL COMMENT '密码',
	LOGIN_LEVEL INT DEFAULT 0 COMMENT '0为游客，1为注册用户，2为管理员',
	LOGIN_IP VARCHAR(50) DEFAULT NULL COMMENT'IP',
	LOGIN_REGDATE DATETIME DEFAULT NULL COMMENT '注册日期',
	LOGIN_LASTDATE DATETIME DEFAULT NULL COMMENT '最近登录日期',
	PRIMARY KEY (LOGIN_ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '登录账户表';

CREATE TABLE T_USER (
	USER_ID INT (20) NOT NULL AUTO_INCREMENT,
	USER_LOGIN_ID INT (20) COMMENT '外键 LOGIN_ID',
	USER_FAMILY_ID INT (20) DEFAULT 0 COMMENT '家庭编号',
	USER_LEVEL INT(20) DEFAULT 0 COMMENT '用户级别',
	USER_NAME VARCHAR (50) DEFAULT NULL COMMENT '用户姓名',
	USER_EMAIL VARCHAR (50) DEFAULT NULL COMMENT '用户EMAIL,同T_LOGIN.LOGIN_NAME',
	USER_REGDATE DATETIME DEFAULT NULL COMMENT '注册日期，同T_LOGIN.LOGIN_REGDATE_DATETIME',
	PRIMARY KEY (USER_ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '用户表';

CREATE TABLE T_FAMILY (
	FAMILY_ID INT (20) NOT NULL AUTO_INCREMENT,
	FAMILY_NAME VARCHAR (50) DEFAULT NULL UNIQUE COMMENT '家庭账户名称',
	FAMILY_REGDATE DATETIME DEFAULT NULL COMMENT '家庭账户创建日期',
	PRIMARY KEY (FAMILY_ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '家庭账户表';

CREATE TABLE T_ACCOUNT (
	ACCT_ID INT (20) NOT NULL AUTO_INCREMENT,
	ACCT_USER_ID INT (20) DEFAULT NULL COMMENT '用户ID:T_USER.USER_ID',
	ACCT_NAME VARCHAR (50) DEFAULT NULL COMMENT '账户名称',
	ACCT_STATE VARCHAR (50) DEFAULT NULL COMMENT '账户状态：0未使用1在用',
	ACCT_CURRENCY_TYPE VARCHAR (50) DEFAULT NULL COMMENT '货币类型：1:RMB 2:DOLLAR',
	ACCT_MONEY FLOAT(9,2) DEFAULT NULL COMMENT '账户金额',
	ACCT_WARING_TYPE VARCHAR (50) DEFAULT NULL COMMENT '预警状态:0预警 1关闭',
	ACCT_WARING_MONEY FLOAT(9,2) DEFAULT NULL COMMENT '预警金额',
	ACCT_DEFAULT_FLAG  VARCHAR (50) DEFAULT NULL COMMENT '是否默认账户',
	ACCT_PARENT_ID INT (20) DEFAULT NULL COMMENT '所属父类记账类型ID',
	ACCT_CREATEDATE DATETIME DEFAULT NULL COMMENT '账户创建日期',
	ACCT_REMARK VARCHAR (1024) DEFAULT NULL COMMENT '账户备注 ',
	PRIMARY KEY (ACCT_ID) 
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '账户表';

CREATE TABLE T_ACCOUNT_TYPE (
	ACCT_TYPE_ID INT (20) NOT NULL AUTO_INCREMENT,
	ACCT_TYPE_CATEGORY VARCHAR (50) DEFAULT NULL COMMENT '所属类型 1.支出 2.收入',
	ACCT_TYPE_NAME VARCHAR (50) DEFAULT NULL COMMENT '记账类型名称',
	ACCT_TYPE_PARENT_ID INT (20) DEFAULT NULL COMMENT '所属父类记账类型ID',
	PRIMARY KEY (ACCT_TYPE_ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '记账类型表';

CREATE TABLE T_BOOK (
	BOOK_ID INT (20) NOT NULL AUTO_INCREMENT,
	BOOK_USER_ID INT (20) DEFAULT NULL COMMENT '用户ID:T_USER.USER_ID',
	BOOK_NAME VARCHAR (50) DEFAULT NULL COMMENT '账本名称',
	BOOK_MONEY FLOAT(9,2) DEFAULT NULL COMMENT '账本金额',
	BOOK_STARTTIME DATETIME DEFAULT NULL COMMENT '账本创建时间',
	BOOK_REMARK VARCHAR (1024) DEFAULT NULL COMMENT '账本备注 ',
	PRIMARY KEY (BOOK_ID),
	FOREIGN KEY (BOOK_USER_ID) REFERENCES T_USER (USER_ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '账本表';

CREATE TABLE T_RECORDS_DETAIL (
	RECORDS_DETAIL_ID INT (20) NOT NULL AUTO_INCREMENT,
	RECORDS_USER_ID INT (20) DEFAULT NULL COMMENT '用户ID',
	RECORDS_ACCT_TYPE_ID INT (20) DEFAULT NULL COMMENT '记账类别ID',
	RECORDS_BOOK_ID INT (20) DEFAULT NULL COMMENT '账本ID',
	RECORDS_ACCT_ID INT (20) DEFAULT NULL COMMENT '账户ID',
	RECORDS_MONEY FLOAT(9,2) DEFAULT NULL COMMENT '记账金额 收入为+，支出为-',
	RECORDS_DAY_PAY FLOAT(9,2) DEFAULT NULL COMMENT '当天支出',
	RECORDS_DAY_INCOME FLOAT(9,2) DEFAULT NULL COMMENT '当天收入',
	RECORDS_DATE DATETIME DEFAULT NULL COMMENT '记账日期 ',
	RECORDS_OCCUR_DATE DATETIME DEFAULT NULL COMMENT '发生日期 ',
	RECORDS_REMARK VARCHAR (255) DEFAULT NULL COMMENT '备注描述 ',
	PRIMARY KEY (RECORDS_DETAIL_ID) ,
	FOREIGN KEY (RECORDS_BOOK_ID) REFERENCES T_BOOK (BOOK_ID),
	FOREIGN KEY (RECORDS_USER_ID) REFERENCES T_USER (USER_ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT '账单明细表';