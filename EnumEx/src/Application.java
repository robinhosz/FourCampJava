import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println(Aula17.PESSOA_FISICA.getTexto());
		//System.out.println(Aula17.PESSOA_JURIDICA.getTexto());

		Scanner sc = new Scanner(System.in);
		
		for (Menu m : Menu.values()) { 
 			System.out.println("Opção " + m + " = " + m.getValor() + "\n");
		}
		
		System.out.print("Escolha um valor >>>> ");
		int valor = sc.nextInt();
		
		Menu.escolherOpcaoMenu(valor);
		
		
	}

}
