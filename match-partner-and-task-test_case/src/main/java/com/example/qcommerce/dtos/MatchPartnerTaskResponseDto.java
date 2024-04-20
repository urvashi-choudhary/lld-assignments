package com.example.qcommerce.dtos;

import com.example.qcommerce.models.PartnerTaskMapping;
import lombok.Data;

import java.util.List;

@Data
public class MatchPartnerTaskResponseDto {
    private List<PartnerTaskMapping> partnerTaskMappings;
    private ResponseStatus responseStatus;
	public List<PartnerTaskMapping> getPartnerTaskMappings() {
		return partnerTaskMappings;
	}
	public void setPartnerTaskMappings(List<PartnerTaskMapping> partnerTaskMappings) {
		this.partnerTaskMappings = partnerTaskMappings;
	}
	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
}
