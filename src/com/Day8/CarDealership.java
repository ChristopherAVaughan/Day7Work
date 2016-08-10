package com.Day8;

import java.util.Scanner;

public class CarDealership {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userInputB = null;
		boolean userFailed = false;
		int carPart = 0;
		Car ourSweetCar = new Car();

	

		do {
			System.out.println("How many doors would you like?");
			userInputB = sc.nextLine();

			userFailed = numberIsValid(userInputB);

		} while (userFailed);

		carPart = Integer.parseInt(userInputB);
		ourSweetCar.setDoors(carPart);

		do {
			userFailed = false;

			System.out.println("How many windows would you like?");
			String userInputC = sc.nextLine();

			userFailed = numberIsValid(userInputB);

		} while (userFailed);


		
		
		System.out.println(ourSweetCar.toString());
		
	} // closes main

	public static boolean numberIsValid(String someStringToMakeANumber) {

		try {
			int aNumber = Integer.parseInt(someStringToMakeANumber);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}

	}
}
