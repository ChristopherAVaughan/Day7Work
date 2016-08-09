package com.Day7Work;

public class Anaconda extends AnimalsZoo {

	private String deattachableJaw = null;

	public Anaconda(String type, String classification, String color, int maxLifeExpectancyYears, float averageHeight,
			float averageWeight, float averageLength, int legs, int arms, String howItMoves, String primaryHabitat,
			boolean carnivore, String deattachableJaw) {
		super(type, classification, color, maxLifeExpectancyYears, averageHeight, averageWeight, averageLength, legs,
				arms, howItMoves, primaryHabitat, carnivore);
		this.deattachableJaw = deattachableJaw;
	}

	public String getDeattachableJaw() {
		return deattachableJaw;
	}

	public void setDeattachableJaw(String deattachableJaw) {
		this.deattachableJaw = deattachableJaw;
	}

	@Override
	public String toString() {
		return "saw a Anaconda which has a deattachable jaw that is a reptile of the color green, has a life expectancy of 12 Years,average height of 1 foot, average weight of 500 pounds, average length of 20 feet, 0 legs, 0 arms, slithers to move,i primarily resides in the jungle, and is a carnivore";
	}

}
	