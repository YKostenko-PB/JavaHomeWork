package com.pb.YKostenko.hw7;

public abstract class Clothes {
    private Size size;
    private float price;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
