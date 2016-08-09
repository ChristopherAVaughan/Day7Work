package com.Day6;

import java.util.Scanner;

    public class BaseballStatistics
    {
    	
    	Scanner sc = new Scanner(System.in);
    	String atBats;
    	
    	System.out.println("Please enter in the number of player at bats: ")
    	System.out.println ("Enter in the number of at bats for a player: ");
    	String userEnteredPlayer = sc.nextLine();
    	
    	0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run
    	Result for at-bat 0: 0
    	Result for at-bat 1: 1
    	Result for at-bat 2: 0
    	Result for at-bat 3: 2
    	Result for at-bat 4: 3
    	Batting average: 0.600
    	Slugging percent: 1.200
    	Another batter? (y/n): y
    	Enter number of times at bat: 3
    	0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run
    	Result for at-bat 0: 0
    	Result for at-bat 1: 4
    	Result for at-bat 2: 0
    	Batting average: 0.333
    	Slugging percent: 1.333
    	Another batter? (y/n): n
}}}