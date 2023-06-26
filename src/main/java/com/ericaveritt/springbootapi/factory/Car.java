package com.ericaveritt.springbootapi.factory;

public class Car implements MotorVehicle {

    @Override
    public String build() {
       return "Build Car";
    }
    
}
