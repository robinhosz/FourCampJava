package br.com.exercicios.basico;

import java.util.Scanner;

//Exercicio simples que informa o maior n�mero que o usu�rio digitou e a soma de todos os n�meros digitados

public class ExercicioOperadoresRelacionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int maior;
		
		System.out.println("Informe o primeiro n�mero: ");
		a = sc.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		b = sc.nextInt();
		System.out.println("Informe o terceiro n�mero: ");
		c = sc.nextInt();
		
		if (a > b && a > c){
			maior = a;
			System.out.println(+ maior + " � maior! ");
		} else if (b > a && b > c){
			maior = b;
			System.out.println(+ maior + " � maior!");
		}
		else {
			maior = c;
			System.out.println(+ maior + " � maior");
		}
		
		System.out.println("E a soma deles s�o: "+ (a+b+c));

	}

}
