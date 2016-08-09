package com.Day7Work;

public class Lion extends AnimalsZoo {

	private boolean hasRoar = true;

	public Lion(String type, String classification, String color, int maxLifeExpectancyYears, float averageHeight,
			float averageWeight, float averageLength, int legs, int arms, String howItMoves, String primaryHabitat,
			boolean carnivore, boolean hasRoar) {
		super(type, classification, color, maxLifeExpectancyYears, averageHeight, averageWeight, averageLength, legs,
				arms, howItMoves, primaryHabitat, carnivore);
		this.hasRoar = hasRoar;
	}

	public boolean isHasRoar() {
		return hasRoar;
	}

	public void setHasRoar(boolean hasRoar) {
		this.hasRoar = hasRoar;
	}

	@Override
	public String toString() {
		return "Lion known for its roar, they are mammals and are brown, max life expectancy of 20 years, average height of 3 feet, average weight of 450 pounds, average length of 7 feet, 4 legs, 0 arms, legs=4, arms=0, walks on all fours, primary habitat of Africa, and is a carnivore.";

	}
	
	

}
