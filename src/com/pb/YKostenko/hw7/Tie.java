package com.pb.YKostenko.hw7;

public class Tie extends Clothes implements WomenClothes{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void dressWomen() {
        System.out.println("Название: " + name + "Размер: "+ getSize() + " Цена: " + getPrice() + " Цвет: " + getColor());
    }

}
