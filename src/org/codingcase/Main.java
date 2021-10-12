package org.codingcase;

import org.codingcase.domains.ElectricCar;
import org.codingcase.domains.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    /*-----------DEALERSHIP-----------*/
    static final String DEALERSHIP = "Rodriguez Sin Chequeo de Credito!";
    /*-----------BRANDS-----------*/
    static final String CHEVROLET = "Chevrolet";
    /*-----------MODELS-----------*/
    static final String BOLT_EV = "Bolt EV";
    static final String BOLT_EUV = "Bolt EUV";
    /*-----------YEARS-----------*/
    static final int YEAR_2021 = 2021;
    static final int YEAR_2022 = 2022;
    /*-----------TRIMS-----------*/
    static final String LT = "LT";
    static final String PREMIER = "Premier";
    /*-----------PROPULSION SYSTEM-----------*/
    static final String ELECTRIC_MOTOR = "Electric Motor";
    static final String ICE = "Internal Combustion Engine";
    /*-----------WHEELS-----------*/
    static final int FOUR_WHEELS = 4;
    /*-----------RANGE-----------*/
    static final double BOLT_EV_MILES_PER_KWH_CITY_2021 = 3.77;
    static final double BOLT_EUV_MILES_PER_KWH_CITY_2022 = 3.70;
    static final double BOLT_EV_MILES_PER_KWH_HIGHWAY_2021 = 3.20;
    static final double BOLT_EUV_MILES_PER_KWH_HIGHWAY_2022 = 3.09;
    /*-----------COLOR-----------*/
    static final String BLUE = "Blue";
    static final String BLACK = "Black";
    static final String RED = "Red";

    static final List<Vehicle> vehicles = new ArrayList<>();

    public static void createVehicles() {
        List<ElectricCar> boltEVs = new ArrayList<>();
        boltEVs.add(new ElectricCar(1, DEALERSHIP, CHEVROLET, BOLT_EV, YEAR_2021, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EV_MILES_PER_KWH_CITY_2021, BOLT_EV_MILES_PER_KWH_HIGHWAY_2021, BLUE));
        boltEVs.add(new ElectricCar(2, DEALERSHIP, CHEVROLET, BOLT_EV, YEAR_2021, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EV_MILES_PER_KWH_CITY_2021, BOLT_EV_MILES_PER_KWH_HIGHWAY_2021, BLUE));
        boltEVs.add(new ElectricCar(3, DEALERSHIP, CHEVROLET, BOLT_EV, YEAR_2021, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EV_MILES_PER_KWH_CITY_2021, BOLT_EV_MILES_PER_KWH_HIGHWAY_2021, BLACK));
        boltEVs.add(new ElectricCar(4, DEALERSHIP, CHEVROLET, BOLT_EV, YEAR_2021, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EV_MILES_PER_KWH_CITY_2021, BOLT_EV_MILES_PER_KWH_HIGHWAY_2021, BLACK));
        boltEVs.add(new ElectricCar(5, DEALERSHIP, CHEVROLET, BOLT_EV, YEAR_2021, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EV_MILES_PER_KWH_CITY_2021, BOLT_EV_MILES_PER_KWH_HIGHWAY_2021, BLACK));
        boltEVs.add(new ElectricCar(6, DEALERSHIP, CHEVROLET, BOLT_EV, YEAR_2021, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EV_MILES_PER_KWH_CITY_2021, BOLT_EV_MILES_PER_KWH_HIGHWAY_2021, BLACK));
        boltEVs.add(new ElectricCar(7, DEALERSHIP, CHEVROLET, BOLT_EV, YEAR_2021, PREMIER, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EV_MILES_PER_KWH_CITY_2021, BOLT_EV_MILES_PER_KWH_HIGHWAY_2021, BLACK));
        boltEVs.add(new ElectricCar(8, DEALERSHIP, CHEVROLET, BOLT_EV, YEAR_2021, PREMIER, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EV_MILES_PER_KWH_CITY_2021, BOLT_EV_MILES_PER_KWH_HIGHWAY_2021, BLACK));
        boltEVs.add(new ElectricCar(9, DEALERSHIP, CHEVROLET, BOLT_EV, YEAR_2021, PREMIER, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EV_MILES_PER_KWH_CITY_2021, BOLT_EV_MILES_PER_KWH_HIGHWAY_2021, BLUE));
        boltEVs.add(new ElectricCar(10, DEALERSHIP, CHEVROLET, BOLT_EV, YEAR_2021, PREMIER, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EV_MILES_PER_KWH_CITY_2021, BOLT_EV_MILES_PER_KWH_HIGHWAY_2021, RED));

        List<ElectricCar> boltEUVs = new ArrayList<>();
        boltEUVs.add(new ElectricCar(11, DEALERSHIP, CHEVROLET, BOLT_EUV, YEAR_2022, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EUV_MILES_PER_KWH_CITY_2022, BOLT_EUV_MILES_PER_KWH_HIGHWAY_2022, BLUE));
        boltEUVs.add(new ElectricCar(12, DEALERSHIP, CHEVROLET, BOLT_EUV, YEAR_2022, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EUV_MILES_PER_KWH_CITY_2022, BOLT_EUV_MILES_PER_KWH_HIGHWAY_2022, BLUE));
        boltEUVs.add(new ElectricCar(13, DEALERSHIP, CHEVROLET, BOLT_EUV, YEAR_2022, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EUV_MILES_PER_KWH_CITY_2022, BOLT_EUV_MILES_PER_KWH_HIGHWAY_2022, BLACK));
        boltEUVs.add(new ElectricCar(14, DEALERSHIP, CHEVROLET, BOLT_EUV, YEAR_2022, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EUV_MILES_PER_KWH_CITY_2022, BOLT_EUV_MILES_PER_KWH_HIGHWAY_2022, BLACK));
        boltEUVs.add(new ElectricCar(15, DEALERSHIP, CHEVROLET, BOLT_EUV, YEAR_2022, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EUV_MILES_PER_KWH_CITY_2022, BOLT_EUV_MILES_PER_KWH_HIGHWAY_2022, BLACK));
        boltEUVs.add(new ElectricCar(16, DEALERSHIP, CHEVROLET, BOLT_EUV, YEAR_2022, LT, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EUV_MILES_PER_KWH_CITY_2022, BOLT_EUV_MILES_PER_KWH_HIGHWAY_2022, BLACK));
        boltEUVs.add(new ElectricCar(17, DEALERSHIP, CHEVROLET, BOLT_EUV, YEAR_2022, PREMIER, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EUV_MILES_PER_KWH_CITY_2022, BOLT_EUV_MILES_PER_KWH_HIGHWAY_2022, BLACK));
        boltEUVs.add(new ElectricCar(18, DEALERSHIP, CHEVROLET, BOLT_EUV, YEAR_2022, PREMIER, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EUV_MILES_PER_KWH_CITY_2022, BOLT_EUV_MILES_PER_KWH_HIGHWAY_2022, BLACK));
        boltEUVs.add(new ElectricCar(19, DEALERSHIP, CHEVROLET, BOLT_EUV, YEAR_2022, PREMIER, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EUV_MILES_PER_KWH_CITY_2022, BOLT_EUV_MILES_PER_KWH_HIGHWAY_2022, BLUE));
        boltEUVs.add(new ElectricCar(20, DEALERSHIP, CHEVROLET, BOLT_EUV, YEAR_2022, PREMIER, ELECTRIC_MOTOR, FOUR_WHEELS, BOLT_EUV_MILES_PER_KWH_CITY_2022, BOLT_EUV_MILES_PER_KWH_HIGHWAY_2022, RED));

        vehicles.addAll(boltEVs);
        vehicles.addAll(boltEUVs);
    }

    public static void printVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("ID: ".concat(Integer.toString(vehicle.getId())).
                    concat(", BRAND: ".concat(vehicle.getBrand())).
                    concat(", MODEL: ".concat(vehicle.getModel())).
                    concat(", YEAR: ".concat(Integer.toString(vehicle.getYear()))).
                    concat(", COLOR: ".concat(vehicle.getColor())));
        }
    }

    public static void printAllVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle:vehicles) {
            printVehicle(vehicle);
        }
    }

    public static void printAllBlueVehicles() {
        List<Vehicle> blueVehicles = new ArrayList<>();

        for (Vehicle vehicle: vehicles) {
            if (vehicle.getColor().equals(BLUE)) {
                blueVehicles.add(vehicle);
            }
        }

        printAllVehicles(blueVehicles);
    }

    public static void printAllRedVehicles() {
        printAllVehicles(vehicles.stream().filter(vehicle -> RED.equals(vehicle.getColor())).collect(Collectors.toList()));
    }

    public static void areAllElectricVehicles() {
        boolean result = true;

        for (Vehicle vehicle: vehicles) {
            if (ICE.equals(vehicle.getPropulsionSystem())) {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        createVehicles();
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String selection = "";

        do {
            System.out.println("===============================================");
            System.out.println("|              VEHICLE INVENTORY              |");
            System.out.println("===============================================");
            System.out.println("| MENU:                                       |");
            System.out.println("| 1. Print All Vehicles                 |");
            System.out.println("| 2. Print All Blue Vehicles            |");
            System.out.println("| 3. Print All Red Vehicles             |");
            System.out.println("| 4. Are all Vehicles in Inventory electric?");
            System.out.println("| 0. Exit                                     |");
            selection = scanner.nextLine();

            switch (selection) {
                case "1":
                    printAllVehicles(vehicles);
                    break;
                case "2":
                    printAllBlueVehicles();
                    break;
                case "3":
                    printAllRedVehicles();
                    break;
                case "4":
                    areAllElectricVehicles();
                    break;
            }
        } while (!selection.equals("0"));

        System.out.println("\n");
    }
}
