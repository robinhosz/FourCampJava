package br.com.fourcamp.basico.main;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		int c = 0;
		int cont = 0;

		while (c <= 10) {
			System.out.println(c);
			c++;
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		do {
			System.out.println(cont);
			cont++;
		} while (cont <= 10);
	}

}
