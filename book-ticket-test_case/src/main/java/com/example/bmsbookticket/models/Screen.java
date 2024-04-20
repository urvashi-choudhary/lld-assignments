package com.example.bmsbookticket.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "screens")
public class Screen extends BaseModel {
	private String name;
	@OneToMany(mappedBy = "screen")
	private List<Seat> seats;

	private ScreenStatus status;
	@ElementCollection
	@Enumerated(value = EnumType.ORDINAL)
	private List<Feature> features;

	@ManyToOne
	private Theatre theatre;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public ScreenStatus getStatus() {
		return status;
	}

	public void setStatus(ScreenStatus status) {
		this.status = status;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
}
