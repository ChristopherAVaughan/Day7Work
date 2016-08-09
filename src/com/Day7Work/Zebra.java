package com.Day7Work;

public class Zebra extends AnimalsZoo {

	private boolean hasStripes = true;

	public Zebra(String type, String classification, String color, int maxLifeExpectancyYears, float averageHeight,
			float averageWeight, float averageLength, int legs, int arms, String howItMoves, String primaryHabitat,
			boolean carnivore, boolean hasStripes) {
		super(type, classification, color, maxLifeExpectancyYears, averageHeight, averageWeight, averageLength, legs,
				arms, howItMoves, primaryHabitat, carnivore);
		this.hasStripes = hasStripes;
	}

	public boolean isHasStripes() {
		return hasStripes;
	}

	public void setHasStripes(boolean hasStripes) {
		this.hasStripes = hasStripes;
	}

	@Override
	public String toString() {
		return "Zebra which has stripes, they are mammals and are colored black and white, life expectancy of 20 years, average height of 6 feet, average weight of 500 pounds, average length of 7 feet, 4 legs, 0 arms, moves on all fours, primary habitat of Africa, and is not a carnivore.";
	}
	
	

}
