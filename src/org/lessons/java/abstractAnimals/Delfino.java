package org.lessons.java.abstractAnimals;

public class Delfino extends Animale {

	@Override
	public void verso() {
		System.out.println("Verso del delfino: sembra che squittisce");
	}

	@Override
	public void mangia() {
		System.out.println("Mangia altri pesci");
	}

}
