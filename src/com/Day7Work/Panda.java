package com.Day7Work;

public class Panda extends AnimalsZoo {

	private boolean isBear = false;

	public Panda(String type, String classification, String color, int maxLifeExpectancyYears, float averageHeight,
			float averageWeight, float averageLength, int legs, int arms, String howItMoves, String primaryHabitat,
			boolean carnivore, boolean isBear) {
		super(type, classification, color, maxLifeExpectancyYears, averageHeight, averageWeight, averageLength, legs,
				arms, howItMoves, primaryHabitat, carnivore);
		this.isBear = isBear;
	}

	public boolean isBear() {
		return isBear;
	}

	public void setBear(boolean isBear) {
		this.isBear = isBear;
	}

	@Override
	public String toString() {
		return "Panda whichs is not a bear, is a mammal, the colors of black and white, max life expectancy of 28 years, average height of 5 feet, average weight of 250 pounds, average length of 4 feet, 2 legs, 2 arms, walks on fours, primary habitat is Asia, and is not a carnivore.";
	}

	
	
	

}
