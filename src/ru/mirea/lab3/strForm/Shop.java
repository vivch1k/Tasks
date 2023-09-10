package ru.mirea.lab3.strForm;

import java.util.Scanner;

public class Shop {
    private String curr;
    Prod[] arr;

    public void create_prod(){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String name = "";
        String curr = "";
        double price = 0.0;
        for (int i = 0; i < size; i++){
            name = input.next();
            curr = input.next();
            price = input.nextDouble();
        }
    }

    public void expect_price() {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        for (int i = 0; i < arr.length; i++){
            if (name == arr[i].getName()){
                if (arr[i].getCurr() == "Euro"){
                    System.out.println(arr[i].getPrice());
                }
            }
        }
    }

}
