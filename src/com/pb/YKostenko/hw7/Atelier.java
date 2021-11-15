package com.pb.YKostenko.hw7;

public class Atelier {
    public static void main (String[] args){
        Clothes [] clothes = new Clothes[4];
        clothes [0] = new Pants("Брюки", Size.M, (float) 99.99,"Бежевые");
        clothes [1] = new Tshirt("Поло", Size.L, (float) 29.99, "Белая");
        clothes [2] = new Skirt("Юбка шотландка", Size.XS, (float) 75, "Красная");
        clothes [3] = new Tie ("Класический галстук", Size.M,(float) 9.99, "Синий");


        dressMan(clothes);
        dressWomen(clothes);
    }
    public static void dressMan (Clothes[] clothes){
        System.out.println("Мужская одежда:");
        for (Clothes clothe: clothes) {
            if (clothe instanceof ManClothes) {
                ((ManClothes) clothe).dressMan();
            }
        }
    }

    public static void dressWomen (Clothes[] clothes){
        System.out.println("Женская одежда:");
        for (Clothes clothe: clothes) {
            if (clothe instanceof WomenClothes) {
                ((WomenClothes) clothe).dressWomen();
            }
        }
    }
}
