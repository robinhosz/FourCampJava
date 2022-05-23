package br.com.fourpark.principal.servico;

import java.util.HashMap;
import java.util.Scanner;

import br.com.fourpark.principal.model.Vaga;
import br.com.fourpark.principal.model.Veiculo;

public class Servico {

	public static void vagasDisponiveis(HashMap<Integer, Vaga> vagas) {

		for (int x = 0; x < vagas.size(); x++) {
			
			if (!vagas.get(x).GetOcupado()) { 
				System.out.println(" vaga " + (x + 1) + " disponivel!	\n");
				
			} 
		}
	}

	public static void vagasOcupadas(HashMap<Integer, Vaga> vagas) {
	for (int x = 0; x < vagas.size(); x++) {
			
			if (vagas.get(x).GetOcupado()) { 
				System.out.println(" vaga " + (x + 1) + " está ocupada!	pelo veículo: "
			    + vagas.get(x).getVeiculo());
			} 
		}
	}

	public static String estacionarVeiculo(HashMap<Integer, Vaga> vagas, Scanner sc) {

		Veiculo veiculo = new Veiculo();

		cadastraVeiculo(veiculo, sc);

		for (int x = 0; x < vagas.size(); x++) {

			if (!vagas.get(x).GetOcupado()) {
				vagas.get(x).setVeiculo(veiculo);
				vagas.get(x).setOcupado(true);
				vagas.get(x).setPosicao(x + 1);
				break;

			}
		}

		return "Estacionado";

	}
	
	public static Boolean retirarVeiculo(HashMap<Integer, Vaga> vagas, String placa) {
		Boolean retorno = false;
		for(int x=0; x < vagas.size(); x++) {
			
			Vaga vaga = vagas.get(x);
			Veiculo veiculo = vaga.getVeiculo();
			if(veiculo != null) {
				
				if(veiculo.getPlaca().equals(placa)) {
					vagas.put(x, new Vaga());
					retorno = true;
				}
			}
			
		}
		return retorno;
		
	}
	

	public static void cadastraVeiculo(Veiculo veiculo, Scanner sc) {
		System.out.println("Informe o modelo: ");
		String modelo = sc.next();
		veiculo.setModelo(modelo);

		System.out.println("Informe a placa: ");
		String placa = sc.next();
		veiculo.setPlaca(placa);

		System.out.println("Informe o proprietario: ");
		String proprietario = sc.next();
		veiculo.setProprietario(proprietario);

	}

}
