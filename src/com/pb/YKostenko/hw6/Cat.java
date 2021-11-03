package com.pb.YKostenko.hw6;

import java.util.Objects;

public class Cat extends Animal{
    private String color;

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                "food='" + getFood() + '\'' +
                "location='" + getLocation() + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object c){
        if (this == c) {
            return true;
        }
        if (c == null || getClass() != c.getClass()) {
            return false;
        }
        Cat cat = (Cat) c;
        return this.getFood().equals(cat.getFood())
                    && this.getLocation().equals(cat.getLocation())
                    && this.color.equals(cat.color);
    }

    public int hashCode() {
        return Objects.hash(color, getLocation(), getFood());
    }

}
