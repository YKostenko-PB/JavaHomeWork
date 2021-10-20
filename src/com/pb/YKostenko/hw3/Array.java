package com.pb.YKostenko.hw3;

import java.util.Scanner;

public class Array {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int [] mas = new int [10];
        int i=0, sum=0, count=0, j=0;
        while(i<10){
            System.out.println ("Enter " + i + " array element:");
            mas [i]= scan.nextInt();
            i++;
        }
        i=0;
        System.out.println ("Array:");
        while(i<10){
            sum = sum+mas [i];
            if (mas [i]>0){
                count++;
            }
            System.out.print (mas [i] + " ");
            i++;
        }
        System.out.println();
        System.out.println("sum all array elements is " + sum);
        System.out.println("count all positive array elements is " + count);
        i=9;
        while(i>0){
            while(j<i){
                if (mas [j]> mas [j+1]){
                    sum=mas [j];
                    mas [j]=mas [j+1];
                    mas [j+1]=sum;
                }
                j++;
            }
            i--;
            j=0;
        }
        i=0;
        System.out.println ("Sorted array:");
        while(i<10){
            System.out.print (mas [i] + " ");
            i++;
        }
    }
}
