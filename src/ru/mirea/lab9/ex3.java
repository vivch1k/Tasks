package ru.mirea.lab9;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static List<stud> mergeSort(List<stud> list1, List<stud> list2) {
        List<stud> mergedList = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            stud student1 = list1.get(index1);
            stud student2 = list2.get(index2);

            if (student1.getGpa() > student2.getGpa()) {
                mergedList.add(student1);
                index1++;
            } else {
                mergedList.add(student2);
                index2++;
            }
        }

        // Добавляем оставшиеся элементы из list1, если они есть
        while (index1 < list1.size()) {
            mergedList.add(list1.get(index1));
            index1++;
        }

        // Добавляем оставшиеся элементы из list2, если они есть
        while (index2 < list2.size()) {
            mergedList.add(list2.get(index2));
            index2++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<stud> list1 = new ArrayList<>();
        list1.add(new stud("Alice", 3.9));
        list1.add(new stud("Bob", 3.5));
        list1.add(new stud("Charlie", 4.0));

        List<stud> list2 = new ArrayList<>();
        list2.add(new stud("David", 3.7));
        list2.add(new stud("Eve", 3.8));

        List<stud> mergedList = mergeSort(list1, list2);

        // Выводим отсортированный список студентов
        for (stud student : mergedList) {
            System.out.println(student);
        }
    }
}
