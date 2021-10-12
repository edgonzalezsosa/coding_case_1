package org.codingcase.domains;

import org.codingcase.interfaces.ElectricMotor;

public abstract class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int id, String buyer, String brand, String model, int year, String trim,
                           String propulsionSystem, double milesPerKwHCity, double milesPerKwHHighway, String color) {
        super(id, buyer, brand, model, year, trim, propulsionSystem,
                ElectricMotor.getMilesPerGallonEquivalent(milesPerKwHCity),
                ElectricMotor.getMilesPerGallonEquivalent(milesPerKwHHighway), color);
    }
}
