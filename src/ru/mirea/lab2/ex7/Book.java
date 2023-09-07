package ru.mirea.lab2.ex7;
public class Book {
    private String name;
    private int year;
    private int page;
    public Book(String name, int year, int page)
    {
        this.name = name;
        this.year = year;
        this.page = page;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString()
    {
        return "name " + this.name + ", year " + this.year + ", page " + this.page;
    }

}
