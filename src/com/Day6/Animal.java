package com.Day6;

public class Animal {

	protected String type = null;
	protected int maxLifeExpectancyYears = 0;
	protected float averageHeight = 0.0f;
	protected float averageWeight = 0.0f;
	protected float averageLength = 0.0f;
	protected boolean legs = false;
	protected boolean arms = false;
	
	public Animal(String type, int maxLifeExpectancyYears, float averageHeight, float averageWeight,
			float averageLength, boolean legs, boolean arms) {
		this.type = type;
		this.maxLifeExpectancyYears = maxLifeExpectancyYears;
		this.averageHeight = averageHeight;
		this.averageWeight = averageWeight;
		this.averageLength = averageLength;
		this.legs = legs;
		this.arms = arms;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public boolean isLegs() {
		return legs;
	}

	public void setLegs(boolean legs) {
		this.legs = legs;
	}

	public boolean isArms() {
		return arms;
	}

	public void setArms(boolean arms) {
		this.arms = arms;
	}
	
	
	
	