package com.pb.YKostenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        System.out.print("Enter number:");
        num1 = scan.nextInt();
        if (num1 >= 0 && num1 <=14)
            System.out.print(num1 + " in Interval [0..14]");
        if (num1 >= 15 && num1 <=35)
            System.out.print(num1 + " in Interval [15..35]");
        if (num1 >= 36 && num1 <=50)
            System.out.print(num1 + " in Interval [36..50]");
        if (num1 >= 51 && num1 <=100)
            System.out.print(num1 + " in Interval [51..100]");
        if (num1 < 0 || num1 > 100)
            System.out.print(num1 + " not in Interval [0..100]");
    }
}
