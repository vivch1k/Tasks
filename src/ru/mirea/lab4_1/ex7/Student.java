package ru.mirea.lab4_1.ex7;

public class Student extends Learner{
    int course;
    String name;

    Student(int course, String name)
    {
        this.course = course;
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("Name: " + name + ", course: " + course);
    }
}
