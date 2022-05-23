package br.com.foursys.fourcampp;

import java.util.ArrayList;
import java.util.List;

public class app {

	public static void main(String[] args) {
		
		List<Pessoa> pessoa = new ArrayList();
		
		pessoa.get(0);
		
		
		for (Pessoa nome : pessoa) {
			System.out.println(nome);
		}
	}
}
