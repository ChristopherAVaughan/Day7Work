package com.Day7Work;

public class Elephant extends AnimalsZoo {

	private boolean hasTrunk = true;

	public Elephant(String type, String classification, String color, int maxLifeExpectancyYears, float averageHeight,
			float averageWeight, float averageLength, int legs, int arms, String howItMoves, String primaryHabitat,
			boolean carnivore, boolean hasTrunk) {
		super(type, classification, color, maxLifeExpectancyYears, averageHeight, averageWeight, averageLength, legs,
				arms, howItMoves, primaryHabitat, carnivore);
		this.hasTrunk = hasTrunk;
	}

	public boolean isHasTrunk() {
		return hasTrunk;
	}

	public void setHasTrunk(boolean hasTrunk) {
		this.hasTrunk = hasTrunk;
	}

	@Override
	public String toString() {
		return "Elephant which has a trunk, they are grey colored mammals with a life expenctacy of 50 years, average height of 11 feet, weighing 12,000 punds, with an average length of 16 feet, 4 legs, 0 arms, walks on all fours, primaryly located in Africa and Asia, amd is not a carnivore.";
	}

}
