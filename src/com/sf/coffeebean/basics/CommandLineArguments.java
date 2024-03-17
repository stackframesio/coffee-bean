package com.sf.coffeebean.basics;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CommandLineArguments {
    public static void main(String[] args) {
        String name = Arrays.stream(args).map(Object::toString).collect(Collectors.joining(" "));
        System.out.println("Hello :"+ name);
    }
}
