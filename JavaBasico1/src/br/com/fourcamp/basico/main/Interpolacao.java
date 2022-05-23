package br.com.fourcamp.basico.main;

import java.text.MessageFormat;

//Exemplo de interpola��o de Strings usando a lib MessageFormat!

public class Interpolacao {

	public static void main(String[] args) {
		
		int soma = 1 + 1;
		int sub = 5 - 2;
		float multi = (float) (2.5 * 5);
		double divisao = 8 / 2;
		boolean condicao = true;
		
		String msg = MessageFormat.format("O resultado da soma �: {0} " 
				+ "\n O resultado da subtra��o �: {1} "
				+ "\n O resultado da divis�o 1 �: {2} "
				+ "\n O resultado da divis�o 2 � {3} "
				+ "\n A condi��o �: {4}", soma, sub, multi, divisao, condicao);
		
		
		System.out.println(msg);
		
		
	}

}