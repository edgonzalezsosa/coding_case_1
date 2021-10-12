package com.gm.domains;

import com.gm.interfaces.CombustionEngine;

public class CombustionVehicle extends Vehicle implements CombustionEngine {
    private int cylinders;

    public CombustionVehicle(int id, String buyer, String brand, String model, int year, String trim,
                             String propulsionSystem, int cylinders,
                             double milesPerGallonCity, double milesPerGallonHighway) {
        super(id, buyer, brand, model, year, trim, propulsionSystem, milesPerGallonCity, milesPerGallonHighway, "");
        this.cylinders = cylinders;
    }

    @Override
    public int getCylinders() {
        return cylinders;
    }
}
