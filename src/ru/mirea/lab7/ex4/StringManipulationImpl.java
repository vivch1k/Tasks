package ru.mirea.lab7.ex4;

public class StringManipulationImpl implements StringManipulation {
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        StringManipulation s1 = new StringManipulationImpl();

        String s = "faefa";
        System.out.println(s1.countCharacters(s));
        System.out.println(s1.getOddPositionCharacters(s));
        System.out.println(s1.reverseString(s));
    }
}
