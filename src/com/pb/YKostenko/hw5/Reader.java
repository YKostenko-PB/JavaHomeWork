package com.pb.YKostenko.hw5;

public class Reader {
    String fio;
    int ticketNumber;
    String faculty;
    String bDate;
    int phoneNumber;

    public void takeBook (int count){
        System.out.println(fio + " взял " + count + " книги");
    }
}
