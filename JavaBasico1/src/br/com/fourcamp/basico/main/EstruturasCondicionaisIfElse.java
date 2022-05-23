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
		
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		n2 = sc.nextInt();
		
		isOk = (n1 > n2);
		
		if (isOk == true) {
			resposta = MessageFormat.format("O número {0} é MAIOR que o número {1} ",n1, n2);
		} else {
			resposta = MessageFormat.format("O número {1} é MAIOR que o número {0} ",n1,n2);
		}
		
		System.out.println("\n--------------------------------");
		System.out.println(resposta);
		
		sc.close();
		
	}
}
