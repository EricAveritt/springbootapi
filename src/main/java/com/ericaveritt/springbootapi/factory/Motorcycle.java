package com.ericaveritt.springbootapi.factory;

public class Motorcycle implements MotorVehicle {

    @Override
    public String build() {
        
        return "Build Motorcycle";
    }
    
}
