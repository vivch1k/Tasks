package ru.mirea.lab4.ex2;

public class Test {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.XS, "темно-серый", 2000),
                new TShirt(Size.L, "черный", 2500),
                new Pants(Size.M, "голубой", 5000),
                new Pants(Size.XXS, "синий", 4000),
                new Skirt(Size.S, "розовый", 3000),
                new Skirt(Size.M, "красный", 3250),
                new Tie(Size.L, "синий", 1000),
                new Tie(Size.L, "красный", 1100),
        };

        Atelier studio = new Atelier();
        studio.dressMan(clothes);
        System.out.println();
        studio.dressWomen(clothes);
    }
}
