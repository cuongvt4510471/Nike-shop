package com.example.nikeshop.Model;

public class sneaker {
    int hinh;
    String name;
    String ghichu;
    Double price;

    public sneaker(int hinh, String name, String ghichu, Double price) {
        this.hinh = hinh;
        this.name = name;
        this.ghichu = ghichu;
        this.price = price;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
