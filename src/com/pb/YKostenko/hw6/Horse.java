package com.pb.YKostenko.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String lear;

    @Override
    public String toString() {
        return "Horse{" +
                "lear='" + lear + '\'' +
                "food='" + getFood() + '\'' +
                "location='" + getLocation() + '\'' +
                '}';
    }

    public void setLear(String lear) {
        this.lear = lear;
    }

    public boolean equals(Object h){
        if (this == h) {
            return true;
        }
        if (h == null || getClass() != h.getClass()) {
            return false;
        }
        Horse horse = (Horse) h;
        return this.getFood().equals(horse.getFood())
                    && this.getLocation().equals(horse.getLocation())
                    && this.lear.equals(horse.lear);
    }

    public int hashCode() {
        return Objects.hash(lear, getLocation(), getFood());
    }

}
