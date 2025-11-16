package dev.erikestr.beans;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class Vehicle {
    String name;

    public String getName() {
        return name;
    }

    @PostConstruct
    public void init() {
        this.name = "default-5";
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle defaultVehicle() {
        this.name = "default-4";
        return this;
    }
}