package com.pb.YKostenko.hw5;

public class Book {
    private String bookName;
    private String autorBook;
    private int yearBook;



    public String getBookName() {
        return bookName;
    }

    public String getAutorBook() {
        return autorBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public String getInfo() {
        return bookName + "(" + autorBook + " " + yearBook + ")";
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAutorBook(String autorBook) {
        this.autorBook = autorBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
