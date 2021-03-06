package com.pb.YKostenko.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth user = new Auth();
        System.out.println ("Для регистрации выполните следующие действия:");
        System.out.println ("Придумайте логин:");
        String login = enterString();
        System.out.println ("Придумайте пароль:");
        String password = enterString();
        System.out.println ("Подтвердите пароль:");
        String confirmPassword = enterString();
        try {
            user.signUp(login, password, confirmPassword);
        }
        catch (WrongLoginException e) {
            System.out.println("Login должен содержать только латинские буквы и цифры");
        }
        catch (WrongPasswordException i){
            System.out.println("Password должен содержать только латинские буквы и цифры");
        }
        System.out.println ("Для входа");
        System.out.println ("Введите логин:");
        login = enterString();
        System.out.println ("Введите пароль:");
        password = enterString();

        try {
            user.signIn(login, password);
        }
        catch (WrongLoginException f){
            System.out.println("Неверно введен логин или пароль.");
        }
    }

    static String enterString (){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }
}
