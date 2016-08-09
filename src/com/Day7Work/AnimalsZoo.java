package com.Day7Work;

public class AnimalsZoo {

	protected String type = null;           
	protected String classification = null;
	protected String color = null;
	protected int maxLifeExpectancyYears = 0;
	protected float averageHeight = 0.0f;   
	protected float averageWeight = 0.0f;   
	protected float averageLength = 0.0f;   
	protected int legs = 0;         
	protected int arms = 0;
	protected String howItMoves = null;
	protected String primaryHabitat = null;
	protected boolean carnivore = false;
	
	public AnimalsZoo(String type, String classification, String color, int maxLifeExpectancyYears, float averageHeight,
			float averageWeight, float averageLength, int legs, int arms, String howItMoves, String primaryHabitat,
			boolean carnivore) {
		this.type = type;
		this.classification = classification;
		this.color = color;
		this.maxLifeExpectancyYears = maxLifeExpectancyYears;
		this.averageHeight = averageHeight;
		this.averageWeight = averageWeight;
		this.averageLength = averageLength;
		this.legs = legs;
		this.arms = arms;
		this.howItMoves = howItMoves;
		this.primaryHabitat = primaryHabitat;
		this.carnivore = carnivore;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxLifeExpectancyYears() {
		return maxLifeExpectancyYears;
	}

	public void setMaxLifeExpectancyYears(int maxLifeExpectancyYears) {
		this.maxLifeExpectancyYears = maxLifeExpectancyYears;
	}

	public float getAverageHeight() {
		return averageHeight;
	}

	public void setAverageHeight(float averageHeight) {
		this.averageHeight = averageHeight;
	}

	public float getAverageWeight() {
		return averageWeight;
	}

	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}

	public float getAverageLength() {
		return averageLength;
	}

	public void setAverageLength(float averageLength) {
		this.averageLength = averageLength;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getArms() {
		return arms;
	}

	public void setArms(int arms) {
		this.arms = arms;
	}

	public String getHowItMoves() {
		return howItMoves;
	}

	public void setHowItMoves(String howItMoves) {
		this.howItMoves = howItMoves;
	}

	public String getPrimaryHabitat() {
		return primaryHabitat;
	}

	public void setPrimaryHabitat(String primaryHabitat) {
		this.primaryHabitat = primaryHabitat;
	}

	public boolean isCarnivore() {
		return carnivore;
	}

	public void setCarnivore(boolean carnivore) {
		this.carnivore = carnivore;
	}
	
}
		
	