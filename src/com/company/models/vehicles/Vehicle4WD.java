package com.company.models.vehicles;

import com.company.models.vehicles.Vehicle;

public class Vehicle4WD extends Vehicle {
    private boolean is4WDEnabled;

    public Vehicle4WD(String name, int maxNumberOfPassengers, float maxSpeed, int numberOfWheels, boolean is4WDEnabled) {
        super(name, maxNumberOfPassengers, maxSpeed, numberOfWheels);
        this.is4WDEnabled = is4WDEnabled;
    }

    public boolean isIs4WDEnabled() {
        return is4WDEnabled;
    }
    public void setIs4WDEnabled(boolean is4WDEnabled) {
        this.is4WDEnabled = is4WDEnabled;
    }
}
