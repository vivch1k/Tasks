package ru.mirea.lab8.ex15;

public class ex15 {

    static public void fact_num(int n)
    {
        int res = n;
        if (n == 0){
            return;
        }
        System.out.print(res%10 + " ");
        res = res/10;
        fact_num(res);
    }

    public static void main(String[] args) {
        fact_num(1234);
    }
}
