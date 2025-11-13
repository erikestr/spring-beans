package dev.erikestr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.erikestr.beans.Vehicle;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("default");
        return vehicle;
    }

    @Bean
    public String hello() {
        return "Hello World";
    }

    @Bean
    public Integer number() {
        return 16;
    }
}
