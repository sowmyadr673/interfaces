package com.xworkz.DB.DAO.AnimalDAO;

public class DogDAO implements AnimalInterface {

	public void walk() {
		System.out.println("dog is walk");

	}

	public void eat() {
		System.out.println("dog is eating");
	}

	public void sleep() {
		System.out.println("dog is sleeping");
	}

	public void bark() {
		System.out.println("dog is barking");
	}

}
