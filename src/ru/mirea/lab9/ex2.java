package ru.mirea.lab9;

import java.util.Arrays;
import java.util.Comparator;

class stud {
    private String name;
    private double gpa;

    public stud(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", GPA: " + gpa;
    }
}

class SortingStudentsByGPA implements Comparator<stud> {
    @Override
    public int compare(stud student1, stud student2) {
        // Сравниваем студентов по убыванию GPA
        if (student1.getGpa() < student2.getGpa()) {
            return 1;
        } else if (student1.getGpa() > student2.getGpa()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class ex2 {
    public static void main(String[] args) {
        stud[] students = {
                new stud("Alice", 3.9),
                new stud("Bob", 3.5),
                new stud("Charlie", 4.0),
                new stud("David", 3.7),
                new stud("Eve", 3.8)
        };

        // Используем быструю сортировку и SortingStudentsByGPA для сортировки
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        Arrays.sort(students, comparator);

        // Выводим отсортированный массив студентов
        for (stud st : students) {
            System.out.println(st);
        }
    }
}
