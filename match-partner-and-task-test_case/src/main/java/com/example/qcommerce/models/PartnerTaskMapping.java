package com.example.qcommerce.models;

import lombok.Data;

@Data
public class PartnerTaskMapping extends BaseModel{
    private Partner partner;
    private Task task;
	public Partner getPartner() {
		return partner;
	}
	public void setPartner(Partner partner) {
		this.partner = partner;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
}
