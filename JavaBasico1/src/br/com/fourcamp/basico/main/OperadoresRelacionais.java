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
		System.out.println("O valor é: " + valor);
		novoValor = valor + 1;
		System.out.println("O novo valor é: " + novoValor);
		
		
		System.out.println("------É MAIOR?----------");
		
		isMaior = (valor > novoValor);
		System.out.println("Valor é maior que novo valor? " + isMaior);
		isMaior = (novoValor > valor);
		System.out.println("Novo Valor é maior que valor? " + isMaior);
		
		System.out.println("");
		
		System.out.println("------É MENOR?----------");
		
		isMenor = (valor < novoValor);
		System.out.println("Valor é menor que novo valor? " + isMenor);
		isMenor = (novoValor < valor);
		System.out.println("Novo Valor é menor que valor? " + isMenor);
		
		System.out.println("");
		
		System.out.println("------É IGUAL?----------");
		
		isIgual = (valor == novoValor);
		System.out.println("Valor é igual que novo valor? " + isIgual);

		System.out.println("");
		
		System.out.println("------É DIFERENTE?----------");
		
		isDiferente = (valor != novoValor);
		System.out.println("Valor é igual que novo valor? " + isDiferente);
		
	
	}

}
