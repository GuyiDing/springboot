package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(basePackages = "com.atguigu.springboot.mapper")
@SpringBootApplication
@EnableTransactionManagement//启用声明式事务在实现类中重写的方法上加上@Transactional
class SpringbootSsmXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSsmXmlApplication.class, args);
    }

}
