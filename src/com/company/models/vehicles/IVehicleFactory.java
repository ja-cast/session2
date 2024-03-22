package com.company.models.vehicles;

public interface IVehicleFactory {
    public Vehicle build(VehicleFactory.VehicleType vehicleType);
}
