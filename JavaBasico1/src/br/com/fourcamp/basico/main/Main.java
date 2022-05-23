package br.com.fourcamp.basico.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double a = 0.0;
		Double b = 0.0;
		int op = -1;
		
		calcularValor(a,b,op);

	}
	
	
	public static Double calcularValor(Double a, Double b, int op) {
		Scanner sc = new Scanner(System.in);
		while (op != 0) {
			try {
				System.out.print("\nQual operação você vai querer realizar?\n" + "\n1 - Soma" + "\n2 - Subtração"
						+ "\n3 - Multiplicação" + "\n4 - Divisão \n" + "5 - Porcentagem\n" + "6 - Potencia\n" + "7 - Raiz\n" + "\nPara sair digite 0\n" + "\n>>>>>");
				op = sc.nextInt();
				switch (op) {

				case 1:
					System.out.println("Digite um número: ");
					a = sc.nextDouble();
					System.out.println("Digite outro número: ");
					b = sc.nextDouble();

					System.out.println(soma(a, b));
					break;
				case 2:
					System.out.println("Digite um número: ");
					a = sc.nextDouble();
					System.out.println("Digite outro número: ");
					b = sc.nextDouble();

					System.out.println(subtracao(a, b));
					break;
				case 3:
					System.out.println("Digite um número: ");
					a = sc.nextDouble();
					System.out.println("Digite outro número: ");
					b = sc.nextDouble();

					System.out.println(multiplicacao(a, b));
					break;
				case 4:
					System.out.println("Digite um número: ");
					a = sc.nextDouble();
					System.out.println("Digite outro número: ");
					b = sc.nextDouble();

					System.out.println(divisao(a, b));
					break;
				case 5: 
					System.out.println("Digite um número: ");
					a = sc.nextDouble();
					System.out.println("Digite outro número: ");
					b = sc.nextDouble();

					System.out.println(porcentagem(a, b));
					break;
				case 6: 
					System.out.println("Digite um número: ");
					a = sc.nextDouble();
					System.out.println("Digite outro número: ");
					b = sc.nextDouble();

					System.out.println(potencia(a, b));
					break;
				case 7: 
					System.out.println("Digite um número para saber a raiz dele: ");
					a = sc.nextDouble();
					

					System.out.println(raiz(a));
					break;
				default:
					if (op != 0) {
						System.err.println("Digite no intervalo de 1 a 4.");
					}
				}

			} catch (InputMismatchException e) {
				System.err.println("Digite apenas numeros");
				sc.nextLine();
			}
		}
		System.out.println("\n Obrigado por utilizar a nossa calculadora de console! ");

		sc.close();
		return a;
		
	}

	

	public static Double soma(Double a, Double b) {
		return a + b;
	}

	public static Double subtracao(Double a, Double b) {
		return a - b;
	}

	public static Double multiplicacao(Double a, Double b) {
		return a * b;
	}

	public static Double divisao(Double a, Double b) {
		return a / b;
	}
	
	public static Double potencia(Double a, Double b) {
		Double resultado = a;
		
		resultado = Math.pow(a, b);
		return resultado;
	} 
	
	public static Double porcentagem(Double a, Double b) {
		return (b*100)/a;
		}
	public static Double raiz(Double a) {
		return Math.sqrt(a);
		}
	
	
	
	
	
	
	
	
	
	
	
	

}
