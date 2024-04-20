package com.example.qcommerce.dtos;

import com.example.qcommerce.models.Location;
import lombok.Data;

import java.util.List;

@Data
public class BuildBatchedTaskRouteResponseDto {
    private List<Location> routeToBeTaken;

    public List<Location> getRouteToBeTaken() {
		return routeToBeTaken;
	}

	public void setRouteToBeTaken(List<Location> routeToBeTaken) {
		this.routeToBeTaken = routeToBeTaken;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	private ResponseStatus status;
}
