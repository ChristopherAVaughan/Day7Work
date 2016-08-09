package com.Day7Work;

public class Ostrich extends AnimalsZoo {

	private boolean largestBird = true;

	public Ostrich(String type, String classification, String color, int maxLifeExpectancyYears, float averageHeight,
			float averageWeight, float averageLength, int legs, int arms, String howItMoves, String primaryHabitat,
			boolean carnivore, boolean largestBird) {
		super(type, classification, color, maxLifeExpectancyYears, averageHeight, averageWeight, averageLength, legs,
				arms, howItMoves, primaryHabitat, carnivore);
		this.largestBird = largestBird;
	}

	public boolean isLargestBird() {
		return largestBird;
	}

	public void setLargestBird(boolean largestBird) {
		this.largestBird = largestBird;
	}

	@Override
	public String toString() {
		return "Ostrich which is the worlds largest bird, its a mammal with the color grey, max life exectancy of 10 years, average heoght of 8 feet, average weight of 140 pounds, average length of 4 feet, 2 legs, 2 arms/wings, walks, primary habitat is arid, and is a carnivore.";
	}
	
	

	}
