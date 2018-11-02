package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:shop-oenhjw.xml"})
@MapperScan("com.jk.dao")
public class ShopOenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopOenApplication.class, args);
    }
}
