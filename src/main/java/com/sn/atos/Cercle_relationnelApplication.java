package com.sn.atos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableNeo4jRepositories("com.sn.atos.repositories")

public class Cercle_relationnelApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cercle_relationnelApplication.class, args);
    }
}