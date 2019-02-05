package com.nexteducation.app.utils;

public class Dog extends Animal{

	int value;
	String name;
	
	/*public Dog(String name){
		
		this.name=name;
	}*/
	
	public String getAction(){
		System.out.println("Dog barks");
		return "Bark";
	}
}
