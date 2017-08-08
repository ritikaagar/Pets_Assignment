package com.codingdojo.models;

public class CatTwo extends Animal implements pet {
	
	public CatTwo(String name, String breed, Double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	

	@Override
	public String showAffection() {
		return String.format("Your %s cat, %s, looked at you eith some affection. You think?", this.breed, this.name);
	}

}
