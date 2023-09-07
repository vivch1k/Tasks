package ru.mirea.lab2.ex7;

import java.util.ArrayList;

public class Bookshelf {
    public ArrayList<Book> arr = new ArrayList<Book>();
    private int quaBook = arr.size();

    public void pushBook(Book book) {
        arr.add(book);
    }

    public Book lateBookPublic() {
        int temp = 10000;
        Book res = null;
        for (int i = 0; i < arr.size(); i++) {
            if (temp < arr.get(i).getYear())
                res = arr.get(i);
        }
        return res;
    }

    public Book earlyBookPublic() {
        int temp = 0;
        Book res = null;
        for (int i = 0; i < arr.size(); i++) {
            if (temp < arr.get(i).getYear())
                res = arr.get(i);
        }
        return res;
    }

    public void sortByYear(){

    }

}
