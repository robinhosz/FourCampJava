import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		int opcao = -1;
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;

		Scanner sc = new Scanner(System.in);

		while (opcao != 0) {
			try {
				System.out.print("\n---------------------- Calculadora -------------------------" + "\n"
						+ "\n             |       1 - Somar               |"
						+ "\n             |       2 - Subtrair            |"
						+ "\n             |       3 - Multiplicar         |"
						+ "\n             |       4 - Dividir             |"
						+ "\n             | ----------------------------- |"
						+ "\n             |       0 - Sair                |"
						+ "\n             |                               |"
						+ "\n              Informe a opção desejada >>>> ");
				opcao = sc.nextInt();

				switch (opcao) {

				case 1:
					System.out.println("Digite um número para soma: ");
					num1 = sc.nextDouble();
					System.out.println("Digite mais um número: ");
					num2 = sc.nextDouble();

					Soma soma = new Soma(num1, num2);

					resultado = soma.calculaSoma(num1, num2);

					System.out.println("O resultado de " + num1 + " + " + num2 + " = " + resultado);
					break;

				case 2:
					System.out.println("Digite um número para subtrair: ");
					num1 = sc.nextDouble();
					System.out.println("Digite mais um número: ");
					num2 = sc.nextDouble();

					Subtrai sub = new Subtrai(num1, num2);

					resultado = sub.calculaSubtracao(num1, num2);

					System.out.println("O resultado de " + num1 + " - " + num2 + " = " + resultado);
					break;

				case 3:
					System.out.println("Digite um número para multiplicar: ");
					num1 = sc.nextDouble();
					System.out.println("Digite mais um número: ");
					num2 = sc.nextDouble();

					Multiplicacao multi = new Multiplicacao(num1, num2);

					resultado = multi.calculaMultiplicacao(num1, num2);

					System.out.println("O resultado de " + num1 + " * " + num2 + " = " + resultado);
					break;

				case 4:
					System.out.println("Digite um número para dividir: ");
					num1 = sc.nextDouble();
					System.out.println("Digite mais um número: ");
					num2 = sc.nextDouble();

					Divisao div = new Divisao(num1, num2);

					resultado = div.calculaDivisao(num1, num2);

					System.out.println("O resultado de " + num1 + " / " + num2 + " = " + resultado);
					break;

				default:
					if (opcao != 0) {
						System.err.println("\n Você precisa uma das opções validas!\n");
					}
					break;
				}

			} catch (InputMismatchException e) {
				System.err.println("Digite apenas numeros");
				sc.nextLine();
			}

		}

		System.out.println("\n Obrigado por utilizar a nossa calculadora de console! ");

		sc.close();
	}

}