package org.codingcase.interfaces;

public interface ElectricMotor {
    static double getMilesPerGallonEquivalent(double milesPerKilowattHour) {
        return milesPerKilowattHour * 33.705;
    }
}
