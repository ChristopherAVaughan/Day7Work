package com.Day6;

public class Exceptions {

	public static void main(String[] args) {
	
		int[] hiya = new int[1];
		
		try{
		System.out.println(hiya[2]);
	} 
	catch (ArrayIndexOutOfBoundsException alienEggs) 
	{
	System.out.println("you've made some error");
	}

}}
