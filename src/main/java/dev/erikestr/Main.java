package dev.erikestr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.erikestr.beans.Vehicle;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle using XML definition: " + vehicle.getName());

        context.close();
    }
}