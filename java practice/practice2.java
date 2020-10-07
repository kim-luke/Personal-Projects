// This program contains my practice with variables
package com.company;

public class practice2 {

    public static void main(String[] args) {
	    int cars, drivers, passengers, carsNotDriven, carsDriven;
	    double spaceInACar, carpoolCapacity, averagePassengersPerCar;

	    cars = 100;
	    spaceInACar = 4.0;
	    drivers = 30;
	    passengers = 90;
	    carsNotDriven = cars - drivers;
	    carsDriven = drivers;
	    carpoolCapacity = carsDriven * spaceInACar;
	    averagePassengersPerCar = passengers / carsDriven;

	    System.out.println("There are " + cars + " cars available.");
	    System.out.println("There are only " + drivers + " drivers available.");
	    System.out.println("There will be " + carsNotDriven + " empty cars today.");
	    System.out.println("We can transport " + carpoolCapacity + " people today.");
	    System.out.println("We have " + passengers + " to carpool today.");
	    System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");

	    String myName, myEyes, myTeeth, myHair;
	    int myAge, myHeight, myWeight;

	    myName = "Luke Y. Kim";
	    myAge = 22;
	    myHeight = 74; // inches
		myWeight = 145; // pounds
		myEyes = "Brown";
		myTeeth = "White";
		myHair = "Brown";

		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches tall.");
		System.out.println("He's " + myWeight + " pounds heavy.");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.print("His teeth are usually " + myTeeth + " depending on the coffee.\n");
		System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + ".");

		int room = 113;
		double value = 2.71828;
		String major = "Computer Science";

		System.out.println("This is room # " + room);
		System.out.println("e is close to " + value);
		System.out.println("I am learning a bit about " + major);

		int year = 2021;
		String name = "Luke Kim";

		System.out.println("My name is " + name + " and I'll graduate in " + year);
    }
}
