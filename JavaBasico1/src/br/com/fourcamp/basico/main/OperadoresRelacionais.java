package br.com.fourcamp.basico.main;

public class OperadoresRelacionais {

	public static void main(String[] args) {

		int valor;
		int novoValor;
		
		boolean isMaior;
		boolean isMenor;
		boolean isIgual;
		boolean isDiferente;
		
		System.out.println("---------Valores----------");
		
		valor = 1;
		System.out.println("O valor �: " + valor);
		novoValor = valor + 1;
		System.out.println("O novo valor �: " + novoValor);
		
		
		System.out.println("------� MAIOR?----------");
		
		isMaior = (valor > novoValor);
		System.out.println("Valor � maior que novo valor? " + isMaior);
		isMaior = (novoValor > valor);
		System.out.println("Novo Valor � maior que valor? " + isMaior);
		
		System.out.println("");
		
		System.out.println("------� MENOR?----------");
		
		isMenor = (valor < novoValor);
		System.out.println("Valor � menor que novo valor? " + isMenor);
		isMenor = (novoValor < valor);
		System.out.println("Novo Valor � menor que valor? " + isMenor);
		
		System.out.println("");
		
		System.out.println("------� IGUAL?----------");
		
		isIgual = (valor == novoValor);
		System.out.println("Valor � igual que novo valor? " + isIgual);

		System.out.println("");
		
		System.out.println("------� DIFERENTE?----------");
		
		isDiferente = (valor != novoValor);
		System.out.println("Valor � igual que novo valor? " + isDiferente);
		
	
	}

}
