package com.example.qcommerce.libraries.gmaps;

import lombok.Data;

@Data
public class GLocation {
    private double lat;
    private double lng;
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
}
