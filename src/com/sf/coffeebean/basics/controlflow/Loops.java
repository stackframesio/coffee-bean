package com.sf.coffeebean.basics.controlflow;

public class Loops {

    public static void main(String[] args) {
        printEvenNumbers(10);
        printOddNumbers(10);
        printNumbers(10);
    }

    private static void printNumbers(int num) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= num);
    }

    private static void printEvenNumbers(int num) {
        int i = 0;
        while (i <= num) {
            System.out.println(i);
            i+=2;
        }
    }

    private static void printOddNumbers(int num) {
        for(int i = 1; i <= num; i+=2) {
            System.out.println(i);
        }
    }

}
