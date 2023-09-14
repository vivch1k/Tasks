package ru.mirea.lab4.ex2;

public class Atelier {


    public void dressMan(Clothes[] arr) {
        System.out.println("Мужская одежда (в наличии):");
        for (Clothes clothe : arr) {
            if (clothe instanceof MenClothing) {
                System.out.println(clothe);
            }
        }
    }

    public void dressWomen(Clothes[] arr) {
        System.out.println("Женская одежда (в наличии):");
        for (Clothes clothe : arr) {
            if (clothe instanceof WomenClothing) {
                System.out.println(clothe);
            }
        }
    }
}
