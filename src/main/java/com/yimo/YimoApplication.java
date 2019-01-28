package com.yimo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//扫描数据库映射
@MapperScan("com.yimo.Dao")
//redis-启用spring-data-cache相关注解
@EnableCaching
public class YimoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YimoApplication.class, args);
    }

}

