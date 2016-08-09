package com.Day7Work;

public class Chupacabra extends AnimalsZoo {

	private boolean mythological = false;
	
	public Chupacabra(String type, String classification, String color, int maxLifeExpectancyYears, float averageHeight,
			float averageWeight, float averageLength, int legs, int arms, String howItMoves, String primaryHabitat,
			boolean carnivore, boolean mythological) {
		super(type, classification, color, maxLifeExpectancyYears, averageHeight, averageWeight, averageLength, legs,
				arms, howItMoves, primaryHabitat, carnivore);
		this.mythological = mythological;
	}

	public boolean isMythological() {
		return mythological;
	}

	public void setMythological(boolean mythological) {
		this.mythological = mythological;
	}

	@Override
	public String toString() {
		return "Chupacabra which is a mythological creature, its likely a mammal, likely brown, has a 150 year life expectancy, average height of 12 feet, average weight of 300 lbs, average length of 7 feet, 2 legs, 2 arms, likely walks, likely lives in Puerto Rico, and is believed to be a carnivore.";

	}

	
	

}
