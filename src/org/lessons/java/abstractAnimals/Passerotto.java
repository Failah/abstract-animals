package org.lessons.java.abstractAnimals;

public class Passerotto extends Animale {

	@Override
	public void verso() {
		System.out.println("Verso del passerotto: Cip cip!");

	}

	@Override
	public void mangia() {
		System.out.println("Mangia i semi");
	}

}
