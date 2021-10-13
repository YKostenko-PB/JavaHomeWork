package com.pb.YKostenko.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int operand1, operand2;
        String sign;
        System.out.print("Enter first number:");
        operand1 = scan.nextInt();
        System.out.print("Enter second number:");
        operand2 = scan.nextInt();
        System.out.print("Select operation +-*/:");
        scan.nextLine();
        sign = scan.nextLine();
        switch(sign){
            case "+":
                System.out.print(operand1+operand2);
                break;
            case "-":
                System.out.print(operand1-operand2);
                break;
            case "*":
                System.out.print(operand1*operand2);
                break;
            case "/":
                if (operand2 == 0)
                    System.out.print("Error: Division by 0");
                else System.out.print(operand1/operand2);

        }


    }
}
