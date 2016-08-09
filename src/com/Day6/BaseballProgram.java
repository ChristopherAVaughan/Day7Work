package com.Day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BaseballProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter in the number of player at bats: ");
		String atBats = sc.nextLine();
		float atBatsAsFloat = Float.parseFloat (atBats);
		
	
		for(float i=1; i<=atBatsAsFloat; i++){
			System.out.println("For each at bat, enter a 1 for a single, 2 for a double, "
				+ "3 for a triple, 4 for a homerun, and a 0 if the player did not record a hit: ");
			String atBatOutcome = sc.nextLine();
			float atBatOutcomeAsFloat = Float.parseFloat (atBatOutcome);
			if (atBatOutcomeAsFloat >= 0 || atBatOutcomeAsFloat <= 4) {
				System.out.println("You have entered an invalid entry.  Please start over again and stick to the parameters.");
			} 
				
			}

		
		
		
		
		
		HashMap typeOfHits = new HashMap();
		typeOfHits.put(0, 0);
		typeOfHits.put(1, 1);
		typeOfHits.put(2, 1);
		typeOfHits.put(3, 1);
		typeOfHits.put(4, 1);
		
		

	}

	}
