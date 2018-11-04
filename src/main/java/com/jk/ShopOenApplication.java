package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.jk.dao")
@ImportResource(value = {"classpath:shop-oen.xml"})
public class ShopOenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopOenApplication.class, args);
    }
}
