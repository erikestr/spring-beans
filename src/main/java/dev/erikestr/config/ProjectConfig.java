package dev.erikestr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.erikestr.beans.Vehicle;

@Configuration
public class ProjectConfig {

    @Bean(name="default1")
    public Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("default-1");
        return vehicle;
    }

    @Bean(name="default2")
    public Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("default-2");
        return vehicle;
    }


    @Bean(name="default3")
    public Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("default-3");
        return vehicle;
    }

}
