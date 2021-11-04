package com.pb.YKostenko.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main (String[] args) throws Exception{
        Veterinarian doc = null;
        Animal [] animalArray = new Animal[3];
        animalArray [0] = new Dog();
        animalArray [1] = new Cat();
        animalArray [2] = new Horse();

        animalArray[0].setFood("Мясо");
        animalArray[0].setLocation("во дворе");
        animalArray[1].setFood("Рыбу");
        animalArray[1].setLocation("в доме");
        animalArray[2].setFood("Сено");
        animalArray[2].setLocation("на ферме");

        Class clazz = Class.forName("com.pb.YKostenko.hw6.Veterinarian");
        doc = (Veterinarian) clazz.newInstance();
        for (int i=0; i<animalArray.length; i++){
            doc.treatAnimal(animalArray[i]);
        }
    }
}
