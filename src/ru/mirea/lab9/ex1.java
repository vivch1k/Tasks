package ru.mirea.lab9;

class Student {
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", IDNumber: " + iDNumber;
    }
}

class StudentSorter {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }
    }
}

public class ex1 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3),
                new Student("Bob", 1),
                new Student("Charlie", 2),
                new Student("David", 5),
                new Student("Eve", 4)
        };

        // Создаем экземпляр класса StudentSorter
        StudentSorter sorter = new StudentSorter();

        // Сортируем массив студентов по полю iDNumber с помощью сортировки вставками
        sorter.insertionSort(students);

        // Выводим отсортированный массив студентов
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

