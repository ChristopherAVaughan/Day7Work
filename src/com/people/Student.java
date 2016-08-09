package com.people;

public class Student extends Person{

	private String studentID = null;
	private boolean coffee = false;
	private boolean inClassroom = false;
	private boolean payingAttention = false;
	
	
	public Student(String name, int age, String gender, float height, String studentID, boolean coffee,
			boolean inClassroom, boolean payingAttention) {
		super(name, age, gender, height);
		this.studentID = studentID;
		this.coffee = coffee;
		this.inClassroom = inClassroom;
		this.payingAttention = payingAttention;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public boolean isCoffee() {
		return coffee;
	}

	public void setCoffee(boolean coffee) {
		this.coffee = coffee;
	}

	public boolean isInClassroom() {
		return inClassroom;
	}

	public void setInClassroom(boolean inClassroom) {
		this.inClassroom = inClassroom;
	}

	public boolean isPayingAttention() {
		return payingAttention;
	}

	public void setPayingAttention(boolean payingAttention) {
		this.payingAttention = payingAttention;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", coffee=" + coffee + ", inClassroom=" + inClassroom
				+ ", payingAttention=" + payingAttention + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", height=" + height + "]";
	}
	
	

	}


