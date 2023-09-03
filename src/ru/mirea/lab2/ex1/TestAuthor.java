package ru.mirea.lab2.ex1;

import ru.mirea.lab2.ex1.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Bob", "Bob2000@mail.ru", 'M');
        a1.setEmail("Bob2030@mail.ru");
        System.out.println(a1.getName() + " " + a1.getEmail() + " " + a1.getGender());
        System.out.println(a1.toString());
    }
}
