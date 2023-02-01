/*
 * **Esercizio 2 : interfacce**
Alcuni degli animali che abbiamo creato volano, altri nuotano.
Gli animali che volano hanno il seguente metodo :
- void vola() (mostra a video “Sto volando!!!”)
Gli animali che nuotano hanno il seguente metodo :
- void nuota() (mostra a video “Sto nuotando!!!”)
Scrivere un programma avente 2 metodi :
- void faiVolare(IVolante animale)
- void faiNuotare(INuotante animale)
Questi metodi prendono come parametro un animale che può o volare / nuotare e richiamano il corrispondente metodo vola() / nuota().
Scrivere un programma che istanzi animali che volano o nuotano e richiamare i metodi faiVolare / faiNuotare passandoglieli come parametro.
 */

package org.lessons.java.interfaceAnimals;

import java.util.Scanner;

import org.lessons.java.abstractAnimals.Animale;
import org.lessons.java.abstractAnimals.Aquila;
import org.lessons.java.abstractAnimals.Cane;
import org.lessons.java.abstractAnimals.Delfino;
import org.lessons.java.abstractAnimals.Passerotto;

public class Main {
	public static void faiVolare(IVolante animale) {
		animale.vola();
	}

	public static void faiNuotare(INuotante animale) {
		animale.nuota();
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Vuoi istanziare un animale? (s/n)");
			String risposta = s.nextLine();
			if (risposta.equals("n")) {
				break;
			}
			System.out.println("Che tipo di animale vuoi istanziare? (cane[c], passerotto[p], aquila[a], delfino[d])");
			String tipoAnimale = s.nextLine();
			Animale animale;
			if (tipoAnimale.equals("c")) {
				animale = new Cane();
			} else if (tipoAnimale.equals("p")) {
				animale = new Passerotto();
			} else if (tipoAnimale.equals("a")) {
				animale = new Aquila();
			} else if (tipoAnimale.equals("d")) {
				animale = new Delfino();
			} else {
				System.out.println("Tipo di animale non valido, inserisci un input valido");
				continue;
			}
			animale.dormi();
			animale.verso();
			animale.mangia();
		}
		s.close();
		System.out.println("Programma terminato!");

		Aquila aquila = new Aquila();
		Delfino delfino = new Delfino();
		faiVolare(aquila);
		faiNuotare(delfino);
	}
}