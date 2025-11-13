package dev.erikestr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.erikestr.beans.Vehicle;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("default-1");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("default-2");
        return vehicle;
    }


    @Bean
    public Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("default-3");
        return vehicle;
    }

}
