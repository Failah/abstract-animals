package org.lessons.java.abstractAnimals;

import org.lessons.java.interfaceAnimals.INuotante;

public class Delfino extends Animale implements INuotante {

	@Override
	public void verso() {
		System.out.println("Verso del delfino: sembra che squittisce");
	}

	@Override
	public void mangia() {
		System.out.println("Mangia altri pesci");
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}

}
