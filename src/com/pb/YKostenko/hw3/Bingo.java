package com.pb.YKostenko.hw3;

import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int rand1 = random.nextInt(101), num1, count = 0;
        String ex;

        for (;;){
            count++;
            if (count%5 == 0) {
                System.out.println ("For end game enter e:");
                scan.nextLine();
                ex = scan.nextLine();
                if (ex.equals("e")){
                    break;
                }
            }

            System.out.println ("Enter number for 0 to 100:");
            num1 = scan.nextInt();
            if (rand1 == num1){
                System.out.println ("You WIN!!! Count is " + count);
                break;
            }
            if (rand1 > num1){
                System.out.println ("Your number " + num1 + " < right number");
            }
            else {
                System.out.println ("Your number " + num1 + " > right number");
            }
        }
        System.out.println ("Game Over");
    }
}
