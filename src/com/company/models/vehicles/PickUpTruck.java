package com.company.models.vehicles;

public class PickUpTruck extends Vehicle {

    int maxLoad = 5000;
    int currentLoad = 0;

    //CONSTRUCTOR
    public PickUpTruck(String name, int maxNumberOfPassengers, float maxSpeed, int numberOfWheels, int maxLoad) {
        super(name, maxNumberOfPassengers, maxSpeed, numberOfWheels);
        this.maxLoad = maxLoad;
    }
    public PickUpTruck(String name, int maxNumberOfPassengers, float maxSpeed, int numberOfWheels) {
        super(name, maxNumberOfPassengers, maxSpeed,numberOfWheels);
    }

    //GETTERS & SETTERS
    public int getMaxLoad() {
        return maxLoad;
    }
    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    //PUBLIC METHODS
    public void load(int quantity){
        if((currentLoad+quantity) > maxLoad){
            System.out.println("Max load overpassed");
        }else{
            currentLoad+=quantity;
        }
    }
    public void unLoad(int quantity){
        if((currentLoad-quantity) < 0){
            System.out.println("Insufficient load");
        }else{
            currentLoad-=quantity;
        }
    }
}
