package com.sf.coffeebean.basics.controlflow;

import java.time.DayOfWeek;

public class DecisionMakingStatements {
    public static void main(String[] args) {
        
        printDayOfWeek(5); // switch/case
    }

    private static void printDayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.println(DayOfWeek.SUNDAY);
                break;
            case 2:
                System.out.println(DayOfWeek.MONDAY);
                break;
            case 3:
                System.out.println(DayOfWeek.TUESDAY);
                break;
            case 4:
                System.out.println(DayOfWeek.WEDNESDAY);
                break;
            case 5:
                System.out.println(DayOfWeek.THURSDAY);
                break;
            case 6:
                System.out.println(DayOfWeek.FRIDAY);
                break;
            case 7:
                System.out.println(DayOfWeek.SATURDAY);
                break;
            default:
                System.out.println("Choose a number between 1 - 7");
                break;
        }
    }
}
