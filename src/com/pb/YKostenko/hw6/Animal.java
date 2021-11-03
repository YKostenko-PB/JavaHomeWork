package com.pb.YKostenko.hw6;

public class Animal {
    private String food;
    private String location;

    public void makeNoise (String animal){
        System.out.println(animal + " говорит гав");
    }
    public void eat (String animal){
        System.out.println(animal + " ест траву");
    }
    public void sleep (String animal){
        System.out.println(animal + " спит");
    }

    public String getFood(){
        return food;
    }

    public String getLocation(){
        return location;
    }
}
