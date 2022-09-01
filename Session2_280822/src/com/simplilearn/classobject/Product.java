package com.simplilearn.classobject;

public class Product {
private int id;
private String name;
private float price;
private String description;
//wrap using getset
public int getId() {
	return id;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public void setId(int id) {
	this.id = id;
}
}

