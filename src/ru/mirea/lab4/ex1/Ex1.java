package ru.mirea.lab4.ex1;


public class Ex1 {
    public static void main(String[] args) {
        for (Seasons s : Seasons.values()){
            System.out.println(s.name() + " " + s.getTemp() + " " + s.getDescription());
        }
        System.out.println();
        Seasons.myFavoriteSeason(Seasons.SPRING);
    }
}
