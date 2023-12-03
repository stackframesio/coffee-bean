package com.sf.coffeebean.collection.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");

        System.out.println("Fruits :"+fruits);
        System.out.println("Size :"+ fruits.size());
        System.out.println("Contains Object:"+ fruits.contains("Java"));
        System.out.println("Contains All:"+ fruits.containsAll(Arrays.asList("Apple","Orange")));

        System.out.println("Removing Object :"+ fruits.remove("Pineapple"));
        System.out.println("Fruits :"+fruits);

    }
}
