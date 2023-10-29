package ru.mirea.lab10.ex1;

import ru.mirea.lab10.ex1.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Создаем объекты класса Student
        Student student1 = new Student("John", "Doe", "Computer Science", 3, "Group A");
        Student student2 = new Student("Alice", "Smith", "Mathematics", 2, "Group B");
        Student student3 = new Student("Bob", "Johnson", "Physics", 4, "Group A");

        // Добавляем студентов в список
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // Выводим список студентов до сортировки
        System.out.println("Список студентов до сортировки:");
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }

        // Сортируем список студентов с использованием компаратора
        Collections.sort(students, new Student());

        // Выводим список студентов после сортировки
        System.out.println("\nСписок студентов после сортировки:");
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }
}