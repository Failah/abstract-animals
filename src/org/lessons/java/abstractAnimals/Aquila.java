package org.lessons.java.abstractAnimals;

import org.lessons.java.interfaceAnimals.IVolante;

public class Aquila extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("Verso dell'aquila: si sente da lontano in cielo");
	}

	@Override
	public void mangia() {
		System.out.println("Mangia piccoli animali e rettili");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");

	}

}
