package com.ericaveritt.springbootapi.factory;

public class MotorcycleFactory extends MotorVehicleFactory {

    @Override
    protected MotorVehicle createMotorVehicle() {
       return new Motorcycle();
    }
    
}
