package com.pb.YKostenko.hw7;

public class Skirt extends Clothes implements WomenClothes{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void dressWomen() {
        System.out.println("Название: " + name + " Размер: "+ getSize() + " Цена: " + getPrice() + " Цвет: " + getColor());
    }

    public Skirt (String name, Size size, float price, String color){
        this.name = name;
        this.setSize(size);
        this.setPrice(price);
        this.setColor(color);
    }
}
