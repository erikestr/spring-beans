package dev.erikestr.beans;

public class Vehicle {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle defaultVehicle() {
        this.name = "default-4";
        return this;
    }
}