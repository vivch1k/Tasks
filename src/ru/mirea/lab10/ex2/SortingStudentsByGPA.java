package ru.mirea.lab10.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String name;
    private int iDNumber;
    private double GPA;

    public Student(String name, int iDNumber, double GPA) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", IDNumber: " + iDNumber + ", GPA: " + GPA;
    }
}

class SortingStudentsByGPA {
    private ArrayList<Student> students;

    public SortingStudentsByGPA() {
        students = new ArrayList<>();
    }

    public void setArray(ArrayList<Student> students) {
        this.students = students;
    }

    public void quickSort(Comparator<Student> comparator) {
        quickSort(0, students.size() - 1, comparator);
    }

    private void quickSort(int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(low, high, comparator);
            quickSort(low, pi - 1, comparator);
            quickSort(pi + 1, high, comparator);
        }
    }

    private int partition(int low, int high, Comparator<Student> comparator) {
        Student pivot = students.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(students.get(j), pivot) >= 0) {
                i++;
                Collections.swap(students, i, j);
            }
        }

        Collections.swap(students, i + 1, high);
        return i + 1;
    }

    public void mergeSort(Comparator<Student> comparator) {
        mergeSort(0, students.size() - 1, comparator);
    }

    private void mergeSort(int left, int right, Comparator<Student> comparator) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(left, middle, comparator);
            mergeSort(middle + 1, right, comparator);
            merge(left, middle, right, comparator);
        }
    }

    private void merge(int left, int middle, int right, Comparator<Student> comparator) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        ArrayList<Student> leftArray = new ArrayList<>(students.subList(left, middle + 1));
        ArrayList<Student> rightArray = new ArrayList<>(students.subList(middle + 1, right + 1));

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (comparator.compare(leftArray.get(i), rightArray.get(j)) >= 0) {
                students.set(k, leftArray.get(i));
                i++;
            } else {
                students.set(k, rightArray.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            students.set(k, leftArray.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            students.set(k, rightArray.get(j));
            j++;
            k++;
        }
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1, 3.7));
        students.add(new Student("Bob", 3, 3.5));
        students.add(new Student("Charlie", 2, 4.0));
        students.add(new Student("David", 5, 3.9));
        students.add(new Student("Eve", 4, 3.8));

        sorter.setArray(students);

        // Сортировка с использованием быстрой сортировки
        sorter.quickSort(Comparator.comparingDouble(Student::getGPA));
        System.out.println("Сортировка с использованием быстрой сортировки (по GPA):");
        sorter.outArray();

        // Сортировка с использованием сортировки слиянием
        sorter.mergeSort(Comparator.comparingInt(Student::getIDNumber));
        System.out.println("\nСортировка с использованием сортировки слиянием (по IDNumber):");
        sorter.outArray();
    }
}
