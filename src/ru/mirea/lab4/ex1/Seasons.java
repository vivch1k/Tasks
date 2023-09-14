package ru.mirea.lab4.ex1;

public enum Seasons {
    WINTER(-20),
    SUMMER(20) {
        public String getDescription(){
            return "Теплое время года";
        }
    }

    ,
    SPRING(10),
    AUTUMN(10);

    private int temp;

    Seasons(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public static void myFavoriteSeason(Seasons s){
        switch(s){
            case WINTER:
                System.out.println("Я люблю Зиму");
                break;
            case SUMMER:
                System.out.println("Я люблю Луто");
                break;
            case SPRING:
                System.out.println("Я люблю Весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю Осень");
                break;
        }
    }


    public String getDescription(){
        return "Холодное время года";
    }

}
