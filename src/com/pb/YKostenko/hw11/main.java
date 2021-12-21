package com.pb.YKostenko.hw11;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
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
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<PhoneBook> phoneBookArray = new ArrayList<>();
        PhoneBook phoneBook = new PhoneBook();
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int count = 0;
        while (i > 0) {
            System.out.println("Телефонная книга");
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить запись;");
            System.out.println("2 - Удалить запись;");
            System.out.println("3 - Поиск записи;");
            System.out.println("4 - Сортировать записи и вывести на экран;");
            System.out.println("5 - Изменить запись;");
            System.out.println("6 - Сохранить записи в файл;");
            System.out.println("7 - Загрузить записи из файла;");
            System.out.println("0 - Завершить выполнение программы;");
            String option = scan.nextLine();
            switch (option) {
                case "1":
                    phoneBookArray.add(new PhoneBook());
                    phoneBookArray.set(count, phoneBook.addPerson());
                    count++;
                    break;
                case "2":
                    System.out.println("Введите имя эелемента, который нужно удалить:");
                    String option1 = scan.nextLine();

                    phoneBookArray.removeIf(new Predicate<PhoneBook>() {
                      @Override
                        public boolean test(PhoneBook s) {
                            return option1.equals(s.getName());
                        }
                    });
                    count--;
                    break;
                case "3":
                    System.out.println("Введите имя эелемента, который нужно найти:");
                    option1 = scan.nextLine();
                    phoneBookArray.stream().filter(x -> x.getName().equals(option1)).forEach(System.out::println);
                    break;
                case "4":
                    System.out.println("1 - Сортировать по имени;");
                    System.out.println("2 - Сортировать по адресу;");
                    option1 = scan.nextLine();
                    switch (option1) {
                        case "1":
                            phoneBookArray.stream().sorted(Comparator.comparing(PhoneBook ::getName)).forEach(System.out::println);
                            break;
                        case "2":
                            phoneBookArray.stream().sorted(Comparator.comparing(PhoneBook ::getAddress)).forEach(System.out::println);
                            break;
                        default:
                            System.out.println("Неверный ввод");
                    }
                    break;
                case "5":
                    System.out.println("Какое имя нужно заменить?");
                    option1 = scan.nextLine();
                    System.out.println("На какое имя заменить?");
                    String option2 = scan.nextLine();
                   // phoneBookArray = Stream.of(phoneBookArray).map(x -> {if (x.getName().equals(option1)){
                      //  x.setName(option2);});
                    //phoneBookArray.stream().filter(x -> x.getName().equals(option1)).r();
                    phoneBookArray.replaceAll(
                        new UnaryOperator<PhoneBook>() {
                            @Override
                            public PhoneBook apply(PhoneBook s) {
                                if (s.getName().equals(option1)){
                                    s.setName(option2);
                                }
                                return s;
                            }
                        }
                );
                    break;
                case "6":
                    FileOutputStream outputStream = new FileOutputStream(file);
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                    objectOutputStream.writeObject(phoneBookArray);
                    objectOutputStream.close();
                    System.out.println("Данные записаны в файл");
                    break;
                case "7":
                    phoneBookArray = (List<PhoneBook>) objectInputStream.readObject();
                    System.out.println("Данные считанные из файла.");
                    System.out.println("Список после загрузки из файла:");
                    System.out.println(phoneBookArray);
                    break;
                case "0":
                    i = 0;
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }

}
