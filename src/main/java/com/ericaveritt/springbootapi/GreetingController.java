package com.ericaveritt.springbootapi;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ericaveritt.springbootapi.factory.Car;
import com.ericaveritt.springbootapi.factory.CarFactory;
import com.ericaveritt.springbootapi.factory.MotorVehicle;
import com.ericaveritt.springbootapi.factory.MotorVehicleFactory;
import com.ericaveritt.springbootapi.factory.MotorcycleFactory;

@RestController
public class GreetingController {
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final CarFactory toyota = new CarFactory();
    private final MotorcycleFactory suzuki = new MotorcycleFactory();
    

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        MotorVehicle mv = toyota.create();
        MotorVehicle mv2 = suzuki.create();
        return new Greeting(counter.incrementAndGet(), mv.build() + String.format(template, name) + mv2.build());
    }
}
