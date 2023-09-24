package ru.mirea.lab4_1.ex2;

public class TestPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone("89261819112", "iphone", 196);
        p1.receiveCall("Bob", "89154871884");
        p1.sendMessage("89154871884", "89154841885", "89124251684");
    }
}
