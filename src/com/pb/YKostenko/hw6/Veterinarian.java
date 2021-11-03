package com.pb.YKostenko.hw6;

public class Veterinarian {
    void treatAnimal(Animal animal){
        System.out.println("Ест " + animal.getFood() + " Водится в " + animal.getLocation());
    }
}
