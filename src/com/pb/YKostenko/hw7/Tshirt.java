package com.pb.YKostenko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void dressMan() {
        System.out.println("Название: " + name + "Размер: "+ getSize() + " Цена: " + getPrice() + " Цвет: " + getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println("Название: " + name + "Размер: "+ getSize() + " Цена: " + getPrice() + " Цвет: " + getColor());
    }
}
