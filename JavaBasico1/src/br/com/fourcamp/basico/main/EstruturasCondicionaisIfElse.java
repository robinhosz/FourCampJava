package br.com.fourcamp.basico.main;

import java.text.MessageFormat;
import java.util.Scanner;

// Exemplo simples de estrutura condicional, usando o scanner e o MessageFormat

public class EstruturasCondicionaisIfElse {

	public static void main(String[] args) {
	
		int n1;
		int n2;
		boolean isOk = false;
		String resposta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		n1 = sc.nextInt();
		System.out.println("Digite outro n�mero: ");
		n2 = sc.nextInt();
		
		isOk = (n1 > n2);
		
		if (isOk == true) {
			resposta = MessageFormat.format("O n�mero {0} � MAIOR que o n�mero {1} ",n1, n2);
		} else {
			resposta = MessageFormat.format("O n�mero {1} � MAIOR que o n�mero {0} ",n1,n2);
		}
		
		System.out.println("\n--------------------------------");
		System.out.println(resposta);
		
		sc.close();
		
	}
}
