package com.Day6;

import java.util.*;
import java.text.NumberFormat;

public class HateThisOne {
	
	public static void main(String[] args){ 
		
		Scanner sc = new Scanner(System.in); 
		double successfulRuns = 0; 
		double totalBases = 0; 
		int atbatt = 0; 
		AtBat bat = new AtBat(); 
		System.out.print("Number of batters: "); 
		int batters = sc.nextInt(); System.out.println(); bat.setPlayers(batters); int[] atbat = new int[batters]; 
		double[][] calculate = new double[batters][2]; 
		
		for(int a = 0; a < batters; a++) { 
			atbat[a] = Validator.getInt(sc, "Enter the number of times at bat for player " + (a+1) + ": ", 0, 11); 
			System.out.println(); atbatt = atbat[a]; double[] results = new double[atbatt]; 
			System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run"); 
			for(int i = 0; i < atbatt; i++) { 
				results[i] = Validator.getInt(sc, "Results for at-bat " + i + ": ", -1, 5); 
				bat.setResult(results[i]); 
				
				if (results[i] > 0) successfulRuns++; 
				totalBases += results[i]; 
				calculate[a][0] = successfulRuns / (double)atbatt; 
				calculate[a][1] = totalBases / (double)atbatt; 
				bat.setResult(calculate[a][0]); bat.setResult2(calculate[a][1]); 
				} NumberFormat number = NumberFormat.getNumberInstance(); 
				number.setMinimumFractionDigits(3); 
				String message = "Batting average: " + number.format(bat.getResult()) + "\t" + "Slugging percent: " + number.format(bat.getResult2()); 
				System.out.println(message); 
				System.out.println(); 
				}
		}
	} 
    