/*
 * **Esercizio 1 : classi astratte**
Dobbiamo realizzare un programma che rappresenti il regno animale.
Creiamo quindi una classe astratta Animale e delle classi che la estendono : Cane, Passerotto, Aquila, Delfino
Vogliamo che gli animali abbiano i seguenti metodi
- void dormi() (mostra a video “Zzz”)
- void verso() (mostra a video il verso fatto dall'animale specifico)
- void mangia() (mostra a video quello che mangia : erba, carne, ...?)
Quali di questi metodi devono essere implementati nella classe astratta e quali devono essere lasciati astratti e 
implementati dalle classi che la estendono?
Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati.
 */

package org.lessons.java.abstractAnimals;

import java.util.Scanner;

public class Main {
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
	}
}
