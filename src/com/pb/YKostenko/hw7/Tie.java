package com.pb.YKostenko.hw7;

public class Tie extends Clothes implements ManClothes{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void dressMan() {
        System.out.println("Название: " + name + " Размер: "+ getSize() + " Цена: " + getPrice() + " Цвет: " + getColor());
    }

    public Tie (String name, Size size, float price, String color){
        this.name = name;
        this.setSize(size);
        this.setPrice(price);
        this.setColor(color);
    }
}
