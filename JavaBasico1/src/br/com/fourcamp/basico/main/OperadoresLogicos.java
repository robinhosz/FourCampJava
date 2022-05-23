package br.com.fourcamp.basico.main;

import java.util.Scanner;

// Exemplo simples de Operadores Logicos

// && Conjun��o Aditiva  (&& mesma coisa que "e")

// || Conjun��o Alternativa (|| mesma coisa que "ou")

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo = 50.00;
		boolean isOk = false;
		String nome;
		
		System.out.print("Digite seu nome: >>>>");
		nome = sc.nextLine();
		
		
		System.out.println("Bem-vindo" + nome + " Seu saldo �: " + saldo + "\n");
				
		isOk = (saldo > 10 && saldo < 100);
		System.out.println(isOk + "! O saldo � maior que 10 e menor que 100!");
		
		isOk = (saldo > 10 && saldo < 40);
		System.out.println(isOk + "! O saldo � maior que 10 mas n�o � menor que 40 pois ele �: " + saldo + (" R$"));
		
		isOk = (saldo > 10 || saldo < 40);
		System.out.println(isOk + " O saldo � maior que 10 ou pode ser menor que 40!");
		
		isOk = (saldo > 60 || saldo < 40);
		System.out.println(isOk + " O saldo � menor que 60 ou maior que 40!");
		
		isOk = (saldo > 10 && saldo < 100 && saldo <=50 && saldo != 0);
		System.out.println(isOk + " O saldo � maior que 10 � menor que 100 � igual a 50 e � diferente de 0!");


		sc.close();
	}

}
