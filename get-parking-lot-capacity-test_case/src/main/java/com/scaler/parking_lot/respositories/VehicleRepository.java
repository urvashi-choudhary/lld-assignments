package com.scaler.parking_lot.respositories;

import java.util.Optional;

import com.scaler.parking_lot.models.Vehicle;

public interface VehicleRepository {
	// Do not modify the method signatures, feel free to add new methods

	public Optional<Vehicle> getVehicleByRegistrationNumber(String registrationNumber);

	public Vehicle save(Vehicle vehicle);
}
