package br.com.exercicios.basico;

import java.util.Scanner;

public class ImpaPar {

	public static void main(String[] args) {
		
		int a;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("É par");
		} else {
			System.out.println("É impar");
		}
		
		
		sc.close();
		
	}

}
