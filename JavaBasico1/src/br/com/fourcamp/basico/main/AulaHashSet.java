package br.com.fourcamp.basico.main;

import java.util.HashSet;
import java.util.Set;

public class AulaHashSet {

	public static void main(String[] args) {

		
		Set<String> lista = new HashSet<String>();

		// Diferença do HashSet e Set pro List, linkedlist e arraylist é que o HashSet
		// não vai aceitar valores duplicados

		lista.add("José Robson");
		System.out.println(lista.add("Monica"));
		lista.add("José Robson");
		lista.add("José Robson");
		lista.add("Lucas");
		lista.add("Michel");

		for (String nome : lista) {
			System.out.println(nome);
		}

		System.out.println("---------------------------------");

		lista.remove("Lucas"); // Tem que passar o objeto e não o indice

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
