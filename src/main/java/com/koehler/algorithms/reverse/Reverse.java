package com.koehler.algorithms.reverse;

public class Reverse {

    public static void main(String args[]) {

        System.out.println(new Reverse().reverse("Fabio"));
    }

    private String reverse(String string) {

        StringBuffer reverse = new StringBuffer();



        for (int i = string.length() - 1; i >= 0; i--) {
            reverse.append(string.charAt(i));
        }

        return reverse.toString();
    }
}
