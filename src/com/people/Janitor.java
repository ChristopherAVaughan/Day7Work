package com.people;

public class Janitor extends Person {

	
	private boolean isWOrking = false;
	private String title = null;
	
	public Janitor(String name, int age, String gender, float height, boolean isWorking, String title) {
		super(name, age, gender, height);
		// TODO Auto-generated constructor stub
		
	}

		


	public boolean isWOrking() {
		return isWOrking;
	}

	public void setWOrking(boolean isWOrking) {
		this.isWOrking = isWOrking;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
