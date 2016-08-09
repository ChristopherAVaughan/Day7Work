package com.Day7Work;

public class VampireBats extends AnimalsZoo{

	private boolean sucksBlood = true;

	public VampireBats(String type, String classification, String color, int maxLifeExpectancyYears,
			float averageHeight, float averageWeight, float averageLength, int legs, int arms, String howItMoves,
			String primaryHabitat, boolean carnivore, boolean sucksBlood) {
		super(type, classification, color, maxLifeExpectancyYears, averageHeight, averageWeight, averageLength, legs,
				arms, howItMoves, primaryHabitat, carnivore);
		this.sucksBlood = sucksBlood;
	}

	public boolean isSucksBlood() {
		return sucksBlood;
	}

	public void setSucksBlood(boolean sucksBlood) {
		this.sucksBlood = sucksBlood;
	}

	@Override
	public String toString() {
		return "Vampire Bats that sucks blood, they are mammals and are generally black, life expectancy of 3 years, average height of 1 foot, average weight of 1 pound, average length of 1 foot, 2 legs, 2 arms, flies to move, primary habitat is the desert, and are carnivores.";
	}
	
	

}
