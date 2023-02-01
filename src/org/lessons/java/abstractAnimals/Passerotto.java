package org.lessons.java.abstractAnimals;

import org.lessons.java.interfaceAnimals.IVolante;

public class Passerotto extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("Verso del passerotto: Cip cip!");

	}

	@Override
	public void mangia() {
		System.out.println("Mangia i semi");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}

}
