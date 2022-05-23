package br.com.exercicios.basico;

import java.util.Scanner;

//Exercicio simples que informa o maior número que o usuário digitou e a soma de todos os números digitados

public class ExercicioOperadoresRelacionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int maior;
		
		System.out.println("Informe o primeiro número: ");
		a = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		b = sc.nextInt();
		System.out.println("Informe o terceiro número: ");
		c = sc.nextInt();
		
		if (a > b && a > c){
			maior = a;
			System.out.println(+ maior + " É maior! ");
		} else if (b > a && b > c){
			maior = b;
			System.out.println(+ maior + " É maior!");
		}
		else {
			maior = c;
			System.out.println(+ maior + " É maior");
		}
		
		System.out.println("E a soma deles são: "+ (a+b+c));

	}

}
