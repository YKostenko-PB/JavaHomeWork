package com.pb.YKostenko.hw10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;

        while (i>0) {
            System.out.println("1. Создать целочисленный массив;");
            System.out.println("2. Создать массив натуральных чисел.");
            String option = scan.nextLine();

            switch (option) {
                case "1":
                    intArray();
                    i = 0;
                    break;
                case "2":
                    floatArray();
                    i = 0;
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }

    public static void floatArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите размерность массива");
        NumBox<Float> numbers = new NumBox<>(scan.nextInt());
        int i = 1;

        while (i>0) {
            System.out.println("1. Добавить элемент массива;");
            System.out.println("2. Закончить ввод.");
            scan.nextLine();
            String option = scan.nextLine();

            switch (option) {
                case "1":
                    numbers.add(scan.nextFloat());
                    break;
                case "2":
                    i = 0;
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
        System.out.println("Введите индекс элемента");
        System.out.println(numbers.get(scan.nextInt()).floatValue());
        System.out.println("Текущая длина массива: "+numbers.length());
        System.out.println("Среднее значение элементов массива: "+numbers.average());
        System.out.println("Сумма всех элементов массива: "+numbers.sum());
        System.out.println("Максимальное значение элемента массива: "+numbers.max().floatValue());
    }

    public static void intArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите размерность массива");
        NumBox<Integer> numbers = new NumBox<>(scan.nextInt());
        int i = 1;

        while (i>0) {
            System.out.println("1. Добавить элемент массива;");
            System.out.println("2. Закончить ввод.");
            scan.nextLine();
            String option = scan.nextLine();

            switch (option) {
                case "1":
                    numbers.add(scan.nextInt());
                    break;
                case "2":
                    i = 0;
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
        System.out.println("Введите индекс элемента");
        System.out.println(numbers.get(scan.nextInt()).intValue());
        System.out.println("Текущая длина массива: "+numbers.length());
        System.out.println("Среднее значение элементов массива: "+numbers.average());
        System.out.println("Сумма всех элементов массива: "+numbers.sum());
        System.out.println("Максимальное значение элемента массива: "+numbers.max().intValue());
    }
}


