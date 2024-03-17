package com.sf.coffeebean.basics;

import java.util.Arrays;
import java.util.stream.Collectors;

public class VariableArguments {

    private static void sum(int ...numbers) {
        int total = Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println("Total : "+ total);
    }

    private static void print(String... names) {
        String fruits = Arrays.stream(names).map(Object::toString).collect(Collectors.joining(","));
        System.out.println("Fruits : "+ fruits);
    }
    // Note: corresponding 1D Array declaration is not allowed in this class.

    public static void main(String[] args) {

        sum(1,2,3,4,5);

        print("Apple", "Orange");
    }
}
