package com.scaler.parking_lot.models;

public class Vehicle extends BaseModel{

    private String registrationNumber;
    private VehicleType vehicleType;

    public Vehicle(long id, String registrationNumber, VehicleType vehicleType) {
        super(id);
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	


    
}
