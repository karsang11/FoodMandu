package com.karsang.foodmandu.Model;

public class Home {

    private int img1;
    private int img2;
    private String title;
    private String country;
    private String location;

    public Home (int img1, int img2, String title, String country, String location) {
        this.img1 = img1;
        this.img2 = img2;
        this.title = title;
        this.country = country;
        this.location = location;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
