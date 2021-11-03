package com.pb.YKostenko.hw6;

import java.util.Objects;

public class Dog extends Animal{
    private String breed;

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "food='" + getFood() + '\'' +
                "location='" + getLocation() + '\'' +
                '}';
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean equals(Object d){
        if (this == d) {
            return true;
        }
        if (d == null || getClass() != d.getClass()) {
            return false;
        }
        Dog dog = (Dog) d;
        return this.getFood().equals(dog.getFood())
                    && this.getLocation().equals(dog.getLocation())
                    && this.breed.equals(dog.breed);
    }

    public int hashCode() {
        return Objects.hash(breed, getLocation(), getFood());
    }

}
