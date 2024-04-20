package com.example.shortenurl.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Entity(name = "users")
public class User extends BaseModel{
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserPlan getUserPlan() {
		return userPlan;
	}
	public void setUserPlan(UserPlan userPlan) {
		this.userPlan = userPlan;
	}
	private String name;
    private String email;
    @Enumerated(value = EnumType.ORDINAL)
    private UserPlan userPlan;
}
