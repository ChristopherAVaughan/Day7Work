package com.Day7Work;

public class DartFrog extends AnimalsZoo{

	private boolean isVenomious = true;

	public DartFrog(String type, String classification, String color, int maxLifeExpectancyYears, float averageHeight,
			float averageWeight, float averageLength, int legs, int arms, String howItMoves, String primaryHabitat,
			boolean carnivore, boolean isVenomious) {
		super(type, classification, color, maxLifeExpectancyYears, averageHeight, averageWeight, averageLength, legs,
				arms, howItMoves, primaryHabitat, carnivore);
		this.isVenomious = isVenomious;
	}

	public boolean isVenomious() {
		return isVenomious;
	}

	public void setVenomious(boolean isVenomious) {
		this.isVenomious = isVenomious;
	}

	@Override
	public String toString() {
		return "DartFrog which is a venonious amphibian, can be many different bright colors, have a max life expectancy of 17 years, average height of 1 in, average weight of 1 ounce, average length of 1 in., 4 legs, 0 arms, jmups to move, its primary habitatis in humid climates, and is a carnivore.";
		
	}
	

	

}
