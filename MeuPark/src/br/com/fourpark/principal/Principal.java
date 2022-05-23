package br.com.fourpark.principal;

import java.util.HashMap;
import java.util.Scanner;

import br.com.fourpark.principal.model.Vaga;
import br.com.fourpark.principal.servico.Servico;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Vaga> vagas = new HashMap<>();

		for (int x = 0; x <= 49; x++) {

			Vaga vaga = new Vaga(x);
			vagas.put(x, vaga);
			
		}
		

		Menu.chamaMenu(vagas);
	}

}