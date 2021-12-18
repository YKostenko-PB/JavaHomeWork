package com.pb.YKostenko.hw11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.io.Serializable;
import java.util.Scanner;

public class PhoneBook implements Serializable, Comparable<PhoneBook>{
    private final static long serialVersionUID = 42;
     String name;
     List <String> phone =  new ArrayList<>();
     String address;
     LocalDate dateOfBirth;
     LocalDateTime timeOfChange;

    PhoneBook(){}

    //PhoneBook (String name, String address, LocalDate dateOfBirth, String phone){
      // this.name = name;
      // this.address = address;
      // this.dateOfBirth = dateOfBirth;
      //this.phone.add(phone);
      //this.timeOfChange = LocalDateTime.now();
   //}

    @Override
    public int compareTo(PhoneBook o) {
        return 0;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTimeOfChange() {
        return timeOfChange;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addPhone(String phone) {
        this.phone.add(phone);
        this.timeOfChange = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", timeOfChange=" + timeOfChange;
    }

    public PhoneBook addPerson (){
        Scanner scan = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook ();
        System.out.println("Введите имя");
        String option = scan.nextLine();
        phoneBook.setName(option);
        System.out.println("Введите адрес");
        option = scan.nextLine();
        phoneBook.setAddress(option);

        System.out.println("Введите дату рождения");
        System.out.println("Введите день");
        int day = scan.nextInt();
        System.out.println("Введите месяц");
        int month = scan.nextInt();
        System.out.println("Введите год");
        int year = scan.nextInt();
        phoneBook.setDateOfBirth(LocalDate.of(year,month,day));
        phoneBook.timeOfChange = LocalDateTime.now();
        System.out.println("Введите телефон");
        scan.nextLine();
        option = scan.nextLine();
        phoneBook.addPhone(option);
        int i = 1;
        while (i>0) {
            System.out.println("1 - Добавить еще один телефон:");
            System.out.println("2 - закончить ввод:");
            String option1 = scan.nextLine();
            switch (option1) {
                case "1":
                    System.out.println("Введите телефон");
                    option = scan.nextLine();
                    phoneBook.addPhone(option);
                    break;
                case "2":
                    i = 0;
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
        return phoneBook;
    };
}

