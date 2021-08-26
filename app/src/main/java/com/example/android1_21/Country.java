package com.example.android1_21;

public class Country {
    private String name,city;
    private int flag;

    public Country(String name, String city, int flag) {
        this.name = name;
        this.city = city;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
