package com.company.models.vehicles;

public class VehicleFactory implements  IVehicleFactory{

    public Vehicle build(VehicleType vehicleType){
        switch (vehicleType) {
            case PICKUP:
                return new PickUpTruck("Pickup truck", 5, 130, 4, 10000);
            case MOTORCYCLE:
                return new Motorcycle("All terrain Motorcycle",1,100,2);
            case VEHICLE4WD:
                return new Vehicle4WD("Car 4WD",8,150,4, false);
            default: return null;
        }
    }

    public enum VehicleType{
        PICKUP,MOTORCYCLE,VEHICLE4WD
    }
}
