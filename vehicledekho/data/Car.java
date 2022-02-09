package com.vehicledekho.data;

public class Car{
	int id;
	String brand;
	String category;
	int mileage;
	int price;

	public Car(int id, String brand, String category, int mileage,int price) {
        this.id = id;
        this.brand = brand;
        this.category = category;
        this.mileage = mileage;
        this.price = price;
    }

	
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getMileage() {
		return this.mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
	
	
	
	
}
