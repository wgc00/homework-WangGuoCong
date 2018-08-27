package com.entity;

public class MobilePhone {

    private int id;
    private String name;
    private String brand;
    private float price;
    private String company;

    public MobilePhone(){

    }

    public MobilePhone(int id, String name, String brand, float price, String company) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}