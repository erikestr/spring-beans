package dev.erikestr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.erikestr.beans.Vehicle;
import dev.erikestr.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle ctxVehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle from Spring Context using @PostConstruct: " + ctxVehicle.getName());
        ctxVehicle.defaultVehicle();
        System.out.println("Vehicle from Spring Context after defaultVehicle() call: " + ctxVehicle.getName());
    }
}