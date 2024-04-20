package com.scaler.parking_lot.services;

import java.util.List;

import com.scaler.parking_lot.exceptions.AdditionalServiceNotSupportedByVehicle;
import com.scaler.parking_lot.exceptions.InvalidGateException;
import com.scaler.parking_lot.exceptions.InvalidParkingLotException;
import com.scaler.parking_lot.exceptions.ParkingSpotNotAvailableException;
import com.scaler.parking_lot.exceptions.UnsupportedAdditionalService;
import com.scaler.parking_lot.models.Ticket;

public interface TicketService {
	// Do not modify the method signatures, feel free to add new methods
	public Ticket generateTicket(long gateId, String registrationNumber, String vehicleType,
			List<String> additionalServices) throws InvalidGateException, InvalidParkingLotException,
			ParkingSpotNotAvailableException, UnsupportedAdditionalService, AdditionalServiceNotSupportedByVehicle;
}
