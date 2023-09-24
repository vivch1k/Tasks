package ru.mirea.lab4_1.ex5;

public class Reader {
    String fullName;
    int numberRead;
    String faculty;
    String dataBirth;
    String number;


    Reader(String fullName, int numberRead, String faculty, String dataBirth, String number){
        this.fullName = fullName;
        this.numberRead = numberRead;
        this.faculty = faculty;
        this.dataBirth = dataBirth;
        this.number = number;
    }

    public void takeBook(int q){
        System.out.println(this.fullName + " взял " + q + " книги");
    }

    public void takeBook(String... books){
        System.out.print(this.fullName + " взял книги: ");
        for (String book : books)
            System.out.print(book + " ");
        System.out.println();
    }

    public void returBook(int q){
        System.out.println(this.fullName + " вернул " + q + " книги");
    }
    public void returBook(String... books){
        System.out.print(this.fullName + " вернул книги: ");
        for (String book : books)
            System.out.print(book + " ");
    }

}
