package dev.erikestr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.erikestr.beans.Vehicle;
import dev.erikestr.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        System.out.println("Beans!");

        System.out.println("Example 1");

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Car");
        System.out.println("Called from non-spring context: " + vehicle.getName());

        try {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            Vehicle ctxVehicle = context.getBean(Vehicle.class);
            System.out.println("Vehicle from Spring Context: " + ctxVehicle.getName());

            String ctxString = context.getBean(String.class);
            System.out.println("String from Spring Context: " + ctxString);

            Integer ctxInteger = context.getBean(Integer.class);
            System.out.println("Integer from Spring Context: " + ctxInteger);
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }
}