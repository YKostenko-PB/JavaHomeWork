package com.pb.YKostenko.hw11;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Comparator;

public class main {
    public static void main(String[] args) throws Exception {
        File file = Paths.get("files/person.data").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<PhoneBook> phoneBookArray = new ArrayList<>();
        PhoneBook phoneBook = new PhoneBook("Ivan","Dnepr",LocalDate.of(2000, 2, 12),"0666646706");
        phoneBook.addPhone("098567812");
        phoneBookArray.add(phoneBook);
        phoneBookArray.add(new PhoneBook("Ivan","Kiev",LocalDate.of(1992, 5, 15),"0506686706"));
        phoneBookArray.add(new PhoneBook("Petr","Kiev",LocalDate.of(1989, 8, 20),"0506690706"));
        phoneBookArray.add(new PhoneBook("Semen","Dnepr",LocalDate.of(1990, 5, 15),"0676120706"));
        System.out.println("Начальный список:");
        System.out.println(phoneBookArray);
        System.out.println("Поиск по ФИО");
        phoneBookArray.forEach(new Consumer<PhoneBook>(){
            @Override
            public void accept(PhoneBook s){
                if (s.getName().equals("Ivan")){
                    System.out.println(s.toString());
                }
            }
        });
        System.out.println("Поиск по адресу");
        phoneBookArray.forEach(new Consumer<PhoneBook>(){
                    @Override
                    public void accept(PhoneBook s){

                        if (s.getAddress().equals("Kiev")){
                            System.out.println(s.toString());
                        }
                    }
                }
        );
        phoneBookArray.replaceAll( new UnaryOperator<PhoneBook>(){
            @Override
            public PhoneBook apply(PhoneBook s) {
                if (s.getName().equals("Ivan") && s.getAddress().equals("Dnepr")){
                    s.setName("Vano");
                    s.setAddress("Odessa");
                }
                return s;
            }
            }
        );
        phoneBookArray.removeIf(new Predicate<PhoneBook>() {
            @Override
            public boolean test(PhoneBook s) {
                return "Semen".equals(s.getName());
            }
        });
        System.out.println("Список после редактирования:");
        System.out.println(phoneBookArray);
        objectOutputStream.writeObject(phoneBookArray);
        objectOutputStream.close();
        ArrayList<PhoneBook> favorite = new ArrayList<>();
        phoneBookArray.clear();
        System.out.println("Список после очистки:");
        System.out.println(phoneBookArray);
       phoneBookArray = (List<PhoneBook>) objectInputStream.readObject();
        System.out.println("Список после загрузки из файла:");
       System.out.println(phoneBookArray);
    }
}
