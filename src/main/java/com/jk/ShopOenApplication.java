package com.jk;

import org.eclipse.jdt.internal.compiler.batch.FileSystem;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:shop-oen.xml"})
@MapperScan(value = "com.jk.dao")
public class ShopOenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopOenApplication.class, args);
    }
}
