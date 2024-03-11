package com.example.migrationexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MigrationExampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(MigrationExampleApplication.class, args);
    }

}
//$ mvn flyway:info -Dflyway.configFiles=myFlywayConfig.conf