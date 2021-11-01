package com.pb.YKostenko.hw5;

public class Library {
    public static void main (String[] args){
        Book [] bookArray = new Book [3];
        Reader [] readerArray = new Reader [3];
        int i;
        int j = bookArray.length;
        String [] books = new String [j];

        bookArray[0] = new Book ();
        bookArray[0].setBookName("Приключения");
        bookArray[0].setAutorBook("Иванов И. И.");
        bookArray[0].setYearBook(2000);

        bookArray[1] = new Book ();
        bookArray[1].setBookName("Словарь");
        bookArray[1].setAutorBook("Сидоров А. В.");
        bookArray[1].setYearBook(1980);

        bookArray[2] = new Book ();
        bookArray[2].setBookName("Энциклопедия");
        bookArray[2].setAutorBook("Гусев К. В.");
        bookArray[2].setYearBook(2010);

        readerArray[0] = new Reader ();
        readerArray[0].setFio("Петров В. В.");
        readerArray[0].setBDate("02.02.1992");
        readerArray[0].setFaculty("Физтех");
        readerArray[0].setPhoneNumber("+38(066)456-78-25");
        readerArray[0].setTicketNumber(2514);

        readerArray[1] = new Reader ();
        readerArray[1].setFio("Иванов И. И.");
        readerArray[1].setBDate("12.05.1998");
        readerArray[1].setFaculty("Мехмат");
        readerArray[1].setPhoneNumber("+38(093)486-18-35");
        readerArray[1].setTicketNumber(2515);

        readerArray[2] = new Reader ();
        readerArray[2].setFio("Сидоров В. П.");
        readerArray[2].setBDate("20.07.1988");
        readerArray[2].setFaculty("Социология");
        readerArray[2].setPhoneNumber("+38(068)452-11-30");
        readerArray[2].setTicketNumber(2516);

        System.out.println("Список читателей:");
        for (i=0;i<readerArray.length;i++){
            System.out.println(readerArray[i].getInfo());
        }

        System.out.println();
        System.out.println("Список книг:");
        for (i=0;i<bookArray.length;i++){
            System.out.println(bookArray[i].getInfo());
        }

        System.out.println();
        System.out.println("Демострация работы метода takeBook()");
        readerArray[1].takeBook(3);
        for (i=0;i<bookArray.length;i++){
            books[i] = bookArray[i].getBookName();
        }
        readerArray[1].takeBook(books);
        readerArray[1].takeBook(bookArray);

        System.out.println();
        System.out.println();
        System.out.println("Демострация работы метода returnBook()");
        readerArray[1].returnBook(3);
        readerArray[1].returnBook(books);
        readerArray[1].returnBook(bookArray);

    }
}
