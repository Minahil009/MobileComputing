package com.example.fragements;

public class Persons {
    private int id;
    private int imageUrl;
    private String name;
    private int dob;
    private String city;

    public Persons(int imageUrl, String name, int dob, String city) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.dob = dob;
        this.city = city;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
