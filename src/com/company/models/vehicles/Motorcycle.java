package com.company.models.vehicles;

public class Motorcycle extends Vehicle {

    //CONSTRUCTORS
    public Motorcycle(String name,int maxNumberOfPassengers, float maxSpeed, int numberOfWheels) {
        super(name, maxNumberOfPassengers, maxSpeed, numberOfWheels);
    }

    //PUBLIC METHODS
    public void backFlip(){
        System.out.println("Back flip completed");
    }
    public void park(){
        System.out.println("Looking for a motorcycle parking spot. Vehicle parked");
    }

}
