package com.example.ecom.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@Entity(name = "products")
public class Product extends BaseModel{
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String name;
    private String description;
    private double price;
}
