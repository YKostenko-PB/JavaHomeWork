package com.pb.YKostenko.hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        List<PhoneBook> phoneBookArray = new ArrayList<>();
        PhoneBook phoneBook = new PhoneBook("Ivan","Dnepr",LocalDate.of(2000, 2, 12),"0666646706");
        phoneBook.addPhone("098567812");
        phoneBookArray.add(phoneBook);
        System.out.println(phoneBookArray);

        System.out.println(phoneBookArray.get(0).getName());
    }
}
