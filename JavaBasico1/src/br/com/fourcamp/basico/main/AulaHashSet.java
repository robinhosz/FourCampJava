package br.com.fourcamp.basico.main;

import java.util.HashSet;
import java.util.Set;

public class AulaHashSet {

	public static void main(String[] args) {

		
		Set<String> lista = new HashSet<String>();

		// Diferen�a do HashSet e Set pro List, linkedlist e arraylist � que o HashSet
		// n�o vai aceitar valores duplicados

		lista.add("Jos� Robson");
		System.out.println(lista.add("Monica"));
		lista.add("Jos� Robson");
		lista.add("Jos� Robson");
		lista.add("Lucas");
		lista.add("Michel");

		for (String nome : lista) {
			System.out.println(nome);
		}

		System.out.println("---------------------------------");

		lista.remove("Lucas"); // Tem que passar o objeto e n�o o indice

		for (String nome : lista) {
			System.out.println(nome);
		}
		System.out.println("----------------------------------");

		lista.clear(); // Limpa a minha lista
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		System.out.println(lista);
		System.out.println("Lista limpa");
		System.out.println(lista.isEmpty());
	}

}
