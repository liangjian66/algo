# Java学习笔记

### Java中的异常处理 

* 在程序出错误的时候，Java支持异常，将错误信息封装起来，并让程序跳出正常的处理流程，交给异常处理部分去处理 

###  MYSQL
  ```
  CREATE TABLE product (
     id INT(4) UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  	 p_name VARCHAR(255),
  	 p_price INT DEFAULT 25 ,
  	 p_isHave boolean,
     date TIMESTAMP DEFAULT  NOW()
  )
  ```
