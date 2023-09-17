package ru.mirea.lab4.ex3;

import java.util.Scanner;

public class Shop {

    public static void getMenu() {
        System.out.println("\n Меню");
        System.out.println("1.Категории товаров");
        System.out.println("2.Корзина");
        System.out.println("3.Оплатить");
        System.out.println("0.Выход");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number) {
            case 1: {
                getCategory(all);
                break;
            }
            case 2: {
                getBasket(card);
                break;
            }
            case 3: {
                Buy();
                break;
            }
            case 0: {
                break;
            }
        }
    }
    public static void Buy() {
        Basket cards = new Basket(card);
        client.purchased = cards;
        System.out.println("Товарный чек");
        for(int i = 0; i < client.purchased.purchased.length; ++i) {
            if(client.purchased.purchased[i] == null) break;
            System.out.println((i+1) + ". " + client.purchased.purchased[i].nameProduct + " ------- ");
        }
        double gc = getCash(client.purchased.purchased);
        System.out.print("Общая сумма покупок составляет -------" + gc);
    }
    public static double getCash(Product[] p) {
        double cash = 0.0;
        for(int i = 0; i < p.length; ++i) {
            if(p[i] == null) break;
            cash+=p[i].cost;
        }
        return cash;
    }
    public static void getCategory(Category[] c) {
        for(int i = 0; i < c.length; ++i)System.out.println("№"+ (i+1) + " " + c[i].nameCategory);
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
        else seeProduct(all[number-1]);

    }
    public static void getBasket(Product[] b) {
        for(int i = 0; i < b.length; ++i) {
            if(b[i] == null) break;
            System.out.println((i+1) + ". " + b[i].nameProduct + " ------- "
                    + b[i].cost + " ------- ");
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
    }

    public static void seeProduct(Category cat) {
        for(int i = 0; i < cat.products.length; ++i) {
            System.out.println((i+1) + ". " + cat.products[i].nameProduct + " ------- "
                    + cat.products[i].cost + " ------- ");
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getCategory(all);
        else buyProduct(cat.products[number-1]);
    }

    private static void buyProduct(Product p) {
        System.out.println("Продукт " + p.nameProduct + " за " + p.cost + " был добавлен в вашу корзину");
        for(int i = 0; i < card.length; ++i) {
            if(card[i] == null) {
                card[i] = p;
                break;
            }
            else {
                if(i+1 == card.length && card[i] == null) {
                    System.out.println("Корзина заполнена");
                    break;
                }
            }
        }

        getCategory(all);
    }

    static Product sneakers = new Product("Кроссовки", 5000.0);
    static Product boots = new Product("Ботинки", 6000.0);
    static Product slippers = new Product("Тапки", 2500.0);

    static Product windbreaker = new Product("Ветровка", 7000.0);
    static Product jacket = new Product("Кофта", 5000.0);
    static Product tshirt = new Product("Футболка", 1500.0);

    static Product[] Footwear = { sneakers, boots, slippers };
    static Product[] outerwear = { windbreaker, jacket, tshirt };

    static Category bakery = new Category("Обувь", Footwear);
    static Category diary = new Category("Верхняя одежда", outerwear);

    static Category[] all = { bakery, diary };
    static Product[] card;
    static User client;
    public static void main(String[] args) {
        client = new User("123","123");

        Scanner scanner = new Scanner(System.in);
        card = new Product[10];
        System.out.println("Авторизация \n Введите логин и пароль пользователя:");
        String login = (String)scanner.nextLine();
        String password = (String)scanner.nextLine();
        if (!client.isAuth(login, password)) {
            getMenu();
        }

    }

}
