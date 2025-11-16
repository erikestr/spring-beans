package dev.erikestr;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.erikestr.beans.Vehicle;
import dev.erikestr.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Supplier<Vehicle> vehicleSupplier1 = () -> {
            Vehicle vehicle = new Vehicle();
            vehicle.setName("default-1");
            return vehicle;
        };

        Supplier<Vehicle> vehicleSupplier2 = () -> {
            Vehicle vehicle = new Vehicle();
            vehicle.setName("default-2");
            return vehicle;
        };

        Random random = new Random();
        if (random.nextBoolean()) {
            context.registerBean("default1", Vehicle.class, vehicleSupplier1);
        } else {
            context.registerBean("default2", Vehicle.class, vehicleSupplier2);
        }

        try {   
            Vehicle def1 = context.getBean("default1", Vehicle.class);
            System.out.println("Vehicle using Bean Programmatic Registration: " + def1.getName());
        }
        catch (NoSuchBeanDefinitionException e) {
            System.out.println("Bean 'default1' not found in context.");
        }

        try {   
            Vehicle def2 = context.getBean("default2", Vehicle.class);
            System.out.println("Vehicle using Bean Programmatic Registration: " + def2.getName());
        }
        catch (NoSuchBeanDefinitionException e) {
            System.out.println("Bean 'default2' not found in context.");
        }

        context.close();
    }
}