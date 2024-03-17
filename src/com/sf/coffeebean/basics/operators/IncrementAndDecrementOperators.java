package com.sf.coffeebean.basics.operators;

public class IncrementAndDecrementOperators {

    public static void main(String[] args) {

        int  count = 0;

        int preIncrement = ++count;

        int postIncrement = count++;

        // int nestedIncrement = ++ (++ count); // CE
        // Note: increment / decrement operator not applicable for constants.

        byte num1 = 5;

        byte num2 = 10;

        // byte sum = num1 + num2; // CE :  Required byte, Provided int.

        // Note: If we apply arithmetic operator between variables then the result would be max ( int, type of val1, type of val2  )

    }
}


