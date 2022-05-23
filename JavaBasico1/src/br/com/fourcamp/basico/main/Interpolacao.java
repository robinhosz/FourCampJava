package br.com.fourcamp.basico.main;

import java.text.MessageFormat;

//Exemplo de interpolação de Strings usando a lib MessageFormat!

public class Interpolacao {

	public static void main(String[] args) {
		
		int soma = 1 + 1;
		int sub = 5 - 2;
		float multi = (float) (2.5 * 5);
		double divisao = 8 / 2;
		boolean condicao = true;
		
		String msg = MessageFormat.format("O resultado da soma é: {0} " 
				+ "\n O resultado da subtração é: {1} "
				+ "\n O resultado da divisão 1 é: {2} "
				+ "\n O resultado da divisão 2 é {3} "
				+ "\n A condição é: {4}", soma, sub, multi, divisao, condicao);
		
		
		System.out.println(msg);
		
		
	}

}