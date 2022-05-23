package br.com.fourcamp.basico.main;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.MessageFormat;

public class EstruturaCondicionalSwitchCase {

	public static void main(String[] args) {
		Date data = new Date();
		Scanner sc = new Scanner(System.in);
		int r = -1;

		do {
			try {

				System.out.println("\n ---------------------- MENU ------------------------"
						+ "\n|               1 - Para saber o n�mero de PI                 |"
						+ "\n|               2 - Para somar dois n�meros                   |"
						+ "\n|               3 - Para saber se um n�mero � primo           |"
						+ "\n|               4 - Saber o dia e data de hoje                |"
						+ "\n|               ----------------------------------------      |"
						+ "\n|               0 - Para Sair                                 |" + "\n"
						+ "\n Selecione uma op��o >>>>> " + "\n");

				r = sc.nextInt();

				switch (r) {

				case 1:

					System.out.println("\n O n�mero de PI � 3,14");
					break;

				case 2:
					int n1;
					int n2;

					System.out.println("\n Digite o primeiro n�mero: ");
					n1 = sc.nextInt();
					System.out.println("\n Digite o segundo n�mero: ");
					n2 = sc.nextInt();

					String msg = MessageFormat.format("\n A soma de {0} + {1} � igual a {2} ", n1, n2, n1 + n2);

					System.out.println(msg);
					break;

				case 3:

					int numero;

					System.out.println("\n Digite um n�mero: ");
					numero = sc.nextInt();

					for (int j = 2; j < numero; j++) {
						if (numero % j == 0)
							System.out.println("\n N�o � primo");
					}
					System.out.println("\n � primo");
					break;

				case 4:

					DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL);
					System.out.println("\n"+ dff.format(data));
					break;

				default:
					if (r != 0) {
						System.err.println("\n Voc� precisa selecionar uma das op��es validas!");
					}
					break;
				}
			} catch (InputMismatchException e) {

				System.err.println("Ooops... Voc� digitou letras em vez de n�meros, por favor digite novamente!");
				sc.nextLine();
			}

		} while (r != 0);

		System.out.println("\n");
		System.out.println("Obrigado por utilizar nosso sistema. At� breve!");
		sc.close();

	}

}