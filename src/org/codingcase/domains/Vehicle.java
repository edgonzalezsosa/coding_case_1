package org.codingcase.domains;

public abstract class Vehicle {
    private final int id;
    private final String buyer;
    private final String brand;
    private final String model;
    private final int year;
    private final String trim;
    private final String color;
    private final String propulsionSystem;
    private final double milesPerGallonCity;
    private final double milesPerGallonHighway;

    public Vehicle(int id, String buyer, String brand, String model, int year,
                   String trim, String propulsionSystem, double milesPerGallonCity, double milesPerGallonHighway, String color) {
        this.id = id;
        this.buyer = buyer;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.trim = trim;
        this.propulsionSystem = propulsionSystem;
        this.milesPerGallonCity = milesPerGallonCity;
        this.milesPerGallonHighway = milesPerGallonHighway;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getBuyer() {
        return buyer;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getTrim() {
        return trim;
    }

    public String getPropulsionSystem() {
        return propulsionSystem;
    }

    public double getMilesPerGallonCity() {
        return milesPerGallonCity;
    }

    public double getMilesPerGallonHighway() {
        return milesPerGallonHighway;
    }

    public String getColor() {
        return color;
    }
}
