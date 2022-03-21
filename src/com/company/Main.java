package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner read = new Scanner(System.in);

        int first;
        int second;
        String operator;

        first = read.nextInt();
        operator = read.next();
        second = read.nextInt();

        if (operator.equals("*") && first <= 10 && second <= 10) {
            System.out.print("=" + (first * second));

        } else if (operator.equals("/") && first <= 10 && second <= 10) {
            System.out.print("= " + (first / second));

        } else if (operator.equals("+") && first <= 10 && second <= 10) {
            System.out.print("= " + (first + second));

        } else if (operator.equals("-") && first <= 10 && second <= 10) {
            System.out.print("= " + (first - second));
        }else {
            System.out.println("Консолго туура эмес маалымат киргиздиниз");
        }
    }
}

