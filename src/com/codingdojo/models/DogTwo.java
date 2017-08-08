package com.codingdojo.models;

public class DogTwo extends Animal implements pet {
	
	public DogTwo(String name, String breed, Double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	@Override
	public String showAffection() {
		return this.name + "hopped into your lap and cuddled you!";
	}

}
