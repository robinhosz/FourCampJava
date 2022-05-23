package br.com.fourcamp.basico.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AulaLista {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList();

		List<String> lista2 = new ArrayList();

		List<String> lista3 = new LinkedList();

		lista2.add("José Robson");
		lista3.add("Roberto");
		lista3.add("Michel");
		lista3.add("Roberto");
		lista3.add("Carlos");
		lista3.add("Matias");
		lista3.add("Júnior");
		lista3.add("Claudia");
		lista3.add("Sonia");

		System.out.println(lista3);
		System.out.println(lista3.get(0));
		System.out.println(lista3.get(5));
		System.out.println(lista3.get(8));

		System.out.println("------------------------------------------");

		for (String nome : lista3) {
			System.out.println(nome);
		}

		System.out.println("-------------------------------");

		lista3.remove(1);
		for (int i = 0; i < lista3.size(); i++) {
			if (i == 1) {
				System.out.println("Indice removido com sucesso!");
			} else {
				System.out.println(lista3.get(i));
			}

		}

	}

}
