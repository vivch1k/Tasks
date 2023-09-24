package ru.mirea.lab4_1.ex7;

public class TestLearner {
    public static void main(String[] args) {
        Schoolboy sc1 = new Schoolboy(7, "Bob");
        Schoolboy sc2 = new Schoolboy(11, "Jack");
        Student s1 = new Student(1, "Tom");
        Student s2 = new Student(3, "Roma");

        Learner[] arr = {sc1, sc2, s1, s2};

        for (Learner el : arr)
            el.info();
    }
}
