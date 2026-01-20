package com.inditex.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Bootstrap class for the Inditex Architecture Lab Spring Boot application.
 * Starts the embedded server and initializes the Spring context.
 *
 * @author dmf.api@gmail.com
 * @version 1.0
 * @since 21
 */
@SpringBootApplication
public class InditexArchitectureLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(InditexArchitectureLabApplication.class, args);
    }
}
