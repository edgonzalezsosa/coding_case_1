package com.gm.domains;

import com.gm.interfaces.Wheels;

public class ElectricCar extends ElectricVehicle implements Wheels {
    private final int wheels;

    public ElectricCar(int id, String buyer, String brand, String model, int year, String trim,
                       String propulsionSystem, int wheels, double milesPerKwHCity, double milesPerKwHHighway, String color) {
        super(id, buyer, brand, model, year, trim, propulsionSystem, milesPerKwHCity, milesPerKwHHighway, color);
        this.wheels = wheels;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

}
