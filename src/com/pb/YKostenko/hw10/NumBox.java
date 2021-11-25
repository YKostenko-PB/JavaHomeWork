package com.pb.YKostenko.hw10;

import java.util.Arrays;

public class NumBox <T extends Number>{
    private final T[] numbers;
    private int count = 0;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public void add(T num){
        try {
            this.numbers[count] = num;
            count++;
        }
        catch (Exception e){
            System.out.println("Массив заполнен, немогу добавить элемент!");
        }
    }

    public T get(int index){
        try {
            System.out.println("Выбранный элемент имеет значение: ");
            return this.numbers[index];
        }
        catch (Exception e){
            System.out.println("Указан некорректный индекс, возвращен  элемент с максимальным индексом");
            return this.numbers[count-1];
        }
    }

    public int length(){
        return count;
    }

    public double average(){
        double sum = 0;
        for (int i=0;i<count;i++){
            sum = sum + this.numbers[i].doubleValue();
        }
        if (sum == 0){
            return sum;
        }
        else {
            return sum / (count);
        }
    }

    public double sum(){
        double sum = 0;
        for (int i=0;i<count;i++){
            sum = sum + this.numbers[i].doubleValue();
        }
        return sum;
    }

    public T max() {
        int max = this.numbers[0].intValue();
        int maxIndex = 0;
        for (int i=1;i<count;i++){
            if (max<this.numbers[i].intValue()){
                max = this.numbers[i].intValue();
                maxIndex = i;
            }
        }
        return this.numbers[maxIndex];
    }
}
