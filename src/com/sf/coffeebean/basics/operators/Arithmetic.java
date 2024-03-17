package com.sf.coffeebean.basics.operators;

/**
 * Integral Arithmetic
 * Floating Point Arithmetic
 */
public class Arithmetic {

    public static void main(String[] args) {

        int x = 10;
        // System.out.println(x / 0); // RE : ArithmeticException: / by zero

        int i = 0;
        // System.out.println(i / 0); // RE: ArithmeticException: / by zero

        double y = 10.0;
        System.out.println(y / 0); // Infinity

        double z = -10.0;
        System.out.println(z / 0); // -Infinity

        double j = 0.0;
        System.out.println(j / 0); // NaN

    }

}
