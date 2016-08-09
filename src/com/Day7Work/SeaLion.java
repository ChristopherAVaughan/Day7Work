package com.Day7Work;

public class SeaLion extends AnimalsZoo {

	private boolean isPinniped = true;

	public SeaLion(String type, String classification, String color, int maxLifeExpectancyYears, float averageHeight,
			float averageWeight, float averageLength, int legs, int arms, String howItMoves, String primaryHabitat,
			boolean carnivore, boolean isPinniped) {
		super(type, classification, color, maxLifeExpectancyYears, averageHeight, averageWeight, averageLength, legs,
				arms, howItMoves, primaryHabitat, carnivore);
		this.isPinniped = isPinniped;
	}

	public boolean isPinniped() {
		return isPinniped;
	}

	public void setPinniped(boolean isPinniped) {
		this.isPinniped = isPinniped;
	}

	@Override
	public String toString() {
		return "Sea Lion which is a Pinniped and a mammal, the color grey, have a max life expectancy of 12 years, average height of 3 feet, average weight of 300 pounds, average length of 5 feet, 0 legs, 2 arms, swims to move, primary habitatis the water, and are carnivores.";
	}
	
	

	
}
