package com.pb.YKostenko.hw5;

public class Reader {
    private String fio;
    private int ticketNumber;
    private String faculty;
    private String bDate;
    private String phoneNumber;



    public void takeBook (int count){
        System.out.println (fio + " взял " + count + " книги");
    }

    public void takeBook (String [] books){
        System.out.print (fio + " взял книги: ");
        for (int i=0;i<books.length;i++ ) {
            System.out.print(books[i]);
            if (i<books.length-1){
                System.out.print(", ");
            }
        }
        }

    public void takeBook (Book [] bookArray){
        System.out.println();
        System.out.print(fio + " взял книги: ");
        for (int i=0;i<bookArray.length;i++ ) {
            System.out.print(bookArray[i].getInfo());
            if (i<bookArray.length-1){
                System.out.print(", ");
            }
        }
    }

    public void returnBook (int count){
        System.out.println (fio + " вернул " + count + " книги");
    }

    public void returnBook (String [] books){
        System.out.print (fio + " вернул книги: ");
        for (int i=0;i<books.length;i++ ) {
            System.out.print(books[i]);
            if (i<books.length-1){
                System.out.print(", ");
            }
        }
    }

    public void returnBook (Book [] bookArray){
        System.out.println();
        System.out.print(fio + " вернул книги: ");
        for (int i=0;i<bookArray.length;i++ ) {
            System.out.print(bookArray[i].getInfo());
            if (i<bookArray.length-1){
                System.out.print(", ");
            }
        }
    }
    public String getfio() {
        return fio;
    }
    public String getInfo(){
        return "ФИО: " + fio + " номер читательского билета: " + ticketNumber +
                " факультет: " + faculty + " дата рождения: " + bDate + " phoneNumber: " + phoneNumber;
    }
    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBDate() {
        return bDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setBDate(String bDate) {
        this.bDate = bDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
