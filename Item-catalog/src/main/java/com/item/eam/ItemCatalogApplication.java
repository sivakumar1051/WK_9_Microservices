package com.item.eam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.item.eam")
@ComponentScan(basePackages = "com.item.eam")
public class ItemCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemCatalogApplication.class, args);
    }
}




