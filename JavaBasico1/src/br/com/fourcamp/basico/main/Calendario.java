package br.com.fourcamp.basico.main;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) {
		Date data = new Date();
		Calendar dataAtual = Calendar.getInstance();
		System.out.println(dataAtual.getTime());

		DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("\n" + dff.format(data));

	}

}
