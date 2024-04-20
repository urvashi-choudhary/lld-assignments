package com.example.qcommerce.dtos;

import lombok.Data;

import java.util.List;

@Data
public class MatchPartnerTaskRequestDto {
    private List<Long> partnerIds;
    public List<Long> getPartnerIds() {
		return partnerIds;
	}
	public void setPartnerIds(List<Long> partnerIds) {
		this.partnerIds = partnerIds;
	}
	public List<Long> getTaskIds() {
		return taskIds;
	}
	public void setTaskIds(List<Long> taskIds) {
		this.taskIds = taskIds;
	}
	private List<Long> taskIds;
}
