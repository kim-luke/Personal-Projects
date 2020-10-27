package com.company;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {

            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Circle");
            System.out.println("5) Quit");
            System.out.println("Which shape: \n");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Base: ");
                    int base = keyboard.nextInt();

                    System.out.println("Height: ");
                    int height = keyboard.nextInt();

                    System.out.println("The area is " + triangleArea(base, height) + "\n");
                    break;

                case 2:
                    System.out.println("Length: ");
                    int length = keyboard.nextInt();

                    System.out.println("Width: ");
                    int width = keyboard.nextInt();

                    System.out.println("The area is " + rectangleArea(length, width) + "\n");
                    break;

                case 3:
                    System.out.println("Side: ");
                    int side = keyboard.nextInt();

                    System.out.println("The area is " + squareArea(side) + "\n");
                    break;

                case 4:
                    System.out.println("Radius: ");
                    int radius = keyboard.nextInt();

                    System.out.println("The area is " + circleArea(radius) + "\n");
                    break;

                case 5:
                    System.out.println("Goodbye.");
                    break;
            }

            if (choice != 5) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            }
        }
    }

    public static double circleArea(int radius) {
        double area = 3.14 * radius * radius;

        return area;
    }

    public static int rectangleArea(int length, int width) {
        int area = length * width;

        return area;
    }

    public static int squareArea(int side) {
       int area = side * side;

       return area;
    }

    public static double triangleArea(int base, int height) {
        double area = .5 * base * height;

        return area;
    }
}
