package com.example.qcommerce.dtos;

import lombok.Data;

@Data
public class BuildBatchedTaskRouteRequestDto {
    private long batchedTaskId;

	public long getBatchedTaskId() {
		return batchedTaskId;
	}

	public void setBatchedTaskId(long batchedTaskId) {
		this.batchedTaskId = batchedTaskId;
	}
}
