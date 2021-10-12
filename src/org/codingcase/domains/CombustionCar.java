package org.codingcase.domains;

import org.codingcase.interfaces.Wheels;

public class CombustionCar extends CombustionVehicle implements Wheels {
    private final int wheels;

    public CombustionCar(int id, String buyer, String brand, String model, int year, String trim, String propulsionSystem,
                         int cylinders, double milesPerGallonCity, double milesPerGallonHighway, int wheels) {
        super(id, buyer, brand, model, year, trim, propulsionSystem, cylinders, milesPerGallonCity, milesPerGallonHighway);
        this.wheels = wheels;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

}
