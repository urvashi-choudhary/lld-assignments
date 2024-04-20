package com.example.qcommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class BatchedTask extends BaseModel {
    public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public Date getBatchedAt() {
		return batchedAt;
	}
	public void setBatchedAt(Date batchedAt) {
		this.batchedAt = batchedAt;
	}
	@OneToMany(fetch = FetchType.EAGER)
    private List<Task> tasks;
    private Date batchedAt;
}
