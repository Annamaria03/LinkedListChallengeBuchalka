package annamaria03;

import java.util.Scanner;

public class Main {
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        solutionOne();
        solutionTwo();
        solutionThree();


    }

    private static void solutionOne() {
        ListPlacesOne places = new ListPlacesOne();

        boolean flag = true;

        while (flag) {
            places.menuDisplayer();
            switch (scr.nextLine().toUpperCase()) {
                case "F", "FORWARD" -> places.iterate();
                case "B", "BACKWARD" -> places.iterateBackward();
                case "L", "LIST PLACES" -> places.setNaturalOrderDistances();
                case "M", "MENU" -> places.menuDisplayer();
                default -> {
                    flag = false;
                    System.out.println("YOU QUIT PLACE ITERATOR SOLUTION ONE");

                }
            }
        }
    }

    private static void solutionTwo() {
        ListingPlacesTwo places = new ListingPlacesTwo();
        places.sortedPlacesFromSydney();
        boolean flag = true;

        while (flag) {
            places.menuDisplayer();
            switch (scr.nextLine().toUpperCase()) {
                case "F", "FORWARD" -> places.iteratePlacesSydneyToDarwin();
                case "B", "BACKWARD" -> places.iteratePlacesFromDarwinToSydney();
                case "L", "LIST PLACES" -> places.sortedPlacesFromSydney();
                case "M", "MENU" -> places.menuDisplayer();
                default -> {
                    flag = false;
                    System.out.println("YOU QUIT PLACE ITERATOR SOLUTION TWO");

                }
            }
        }
    }

    private static void solutionThree() {
        ListingPlacesThree places = new ListingPlacesThree();
        places.sortedPlacesFromSydney();
        boolean flag = true;

        while (flag) {
            places.menuDisplayer();
            switch (scr.nextLine().toUpperCase()) {
                case "F", "FORWARD" -> places.iterateTowardsSydney();
                case "B", "BACKWARD" -> places.iterateBackwards();
                case "L", "LIST PLACES" -> places.sortedPlacesFromSydney();
                case "M", "MENU" -> places.menuDisplayer();
                default -> {
                    flag = false;
                    System.out.println("YOU QUIT PLACE ITERATOR SOLUTION THREE");

                }
            }
        }
    }


}

