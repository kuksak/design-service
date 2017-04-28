package com.example.webservice;

import com.example.webservice.domain.Design;
import com.example.webservice.domain.DesignBuilder;
import com.example.webservice.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

@SpringBootApplication
public class DesignServiceApplication {
    @Autowired
    private DesignRepository designRepository;

    @Bean
    CommandLineRunner init() {
        return (event) -> Arrays.asList("Sakshi", "Amit")
                .stream()
                .map(s -> DesignBuilder.aDesign()
                        .withAuthor(s)
                        .withDesignNum(UUID.randomUUID().toString()).build())
                .forEach(design -> designRepository.save(design));
    }


    public static void main(String[] args) {
        SpringApplication.run(DesignServiceApplication.class, args);
    }
}
