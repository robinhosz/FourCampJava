package br.com.fourpark.principal;

import java.util.HashMap;
import java.util.Scanner;

import br.com.fourpark.principal.model.Vaga;
import br.com.fourpark.principal.model.Veiculo;
import br.com.fourpark.principal.servico.Servico;

public class Menu {

	public static void chamaMenu(HashMap<Integer, Vaga> vagas) {
		
		Integer opcao = -1;
		Scanner sc = new Scanner(System.in);
		while(opcao != 0) {
		System.out.println("-----------Bem vindo ao FourPark!\n"
		+"\n 1 - Estacionar\n" 
		+"\n 2 - Vagas Disponíveis\n" 
		+"\n 3 - Vagas Ocupadas\n"
		+"\n 4 - Retirar Veículo\n"
		+"\n 0 - Sair\n");
		opcao = sc.nextInt();
		switch(opcao) {
		
		case 1:
			Servico.estacionarVeiculo(vagas, sc);
			break;
		case 2: 
			Servico.vagasDisponiveis(vagas);
			break;
		case 3: 
			Servico.vagasOcupadas(vagas);
			break;
		case 4:
			System.out.println("Insira a placa que está desocupando");
			String placa = sc.next();
			Servico.retirarVeiculo(vagas, placa);
			
		}
		
		
		}
		
		
	}
}