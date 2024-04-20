package com.scaler.parking_lot.models;

import java.util.Date;
import java.util.List;

public class Ticket extends BaseModel {
	private Vehicle vehicle;
	private Date entryTime;

	private ParkingSpot parkingSpot;
	private Gate gate;
	private ParkingAttendant parkingAttendant;
	private List<AdditionalService> additionalService;

	public Ticket(int id, Vehicle vehicle, Date entryTime, ParkingSpot parkingSpot, Gate gate,
			ParkingAttendant parkingAttendant) {
		super(id);
		this.vehicle = vehicle;
		this.entryTime = entryTime;
		this.parkingSpot = parkingSpot;
		this.gate = gate;
		this.parkingAttendant = parkingAttendant;
	}
	
	public Ticket() {
		
	}
	@Override
	public String toString() {
		return "Ticket{" + "vehicle=" + vehicle + ", entryTime=" + entryTime + ", parkingSpot=" + parkingSpot
				+ ", gate=" + gate + ", parkingAttendant=" + parkingAttendant + '}';
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	public Gate getGate() {
		return gate;
	}

	public void setGate(Gate gate) {
		this.gate = gate;
	}

	public ParkingAttendant getParkingAttendant() {
		return parkingAttendant;
	}

	public void setParkingAttendant(ParkingAttendant parkingAttendant) {
		this.parkingAttendant = parkingAttendant;
	}

	public List<AdditionalService> getAdditionalService() {
		return additionalService;
	}

	public void setAdditionalService(List<AdditionalService> additionalService) {
		this.additionalService = additionalService;
	}

}
