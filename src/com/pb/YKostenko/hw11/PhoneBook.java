package com.pb.YKostenko.hw11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.io.Serializable;

public class PhoneBook implements Serializable{
    private final static long serialVersionUID = 42;
    private String name;
    private List <String> phone =  new ArrayList<>();
    private String address;
    private LocalDate dateOfBirth;
    private LocalDateTime timeOfChange;



    PhoneBook (String name, String address, LocalDate dateOfBirth, String phone){
       this.name = name;
       this.address = address;
       this.dateOfBirth = dateOfBirth;
      this.phone.add(phone);
      this.timeOfChange = LocalDateTime.now();
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
}

