package com.scaler.parking_lot.respositories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.scaler.parking_lot.models.Vehicle;

public class InMemoryVehicleRepositoryImpl implements VehicleRepository {

	private Map<Long, Vehicle> vehicleMap;
	private static long id = 0;

	public InMemoryVehicleRepositoryImpl() {
		this.vehicleMap = new HashMap<>();
	}

	public Optional<Vehicle> getVehicleByRegistrationNumber(String registrationNumber) {
		return this.vehicleMap.values().stream()
				.filter(vehicle -> vehicle.getRegistrationNumber().equals(registrationNumber)).findFirst();
	}

	@Override
	public Vehicle save(Vehicle vehicle) {
		if (vehicle.getId() == 0) {
			vehicle.setId(id++);
		}
		this.vehicleMap.put(vehicle.getId(), vehicle);
		return vehicle;
	}
}
