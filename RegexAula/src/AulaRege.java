import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AulaRege {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String regex = "\\b([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})";

		System.out.print("Digite seu CPF com a pontuação >>>");
		String cpf = sc.next();

		Pattern padrao = Pattern.compile(regex);

		Matcher match = padrao.matcher(cpf);

		if (match.find() == false) {
			System.out.println("Por gentileza, Digite o CPF de acordo com o padrão!");
		} else {
			System.out.println("CPF " + cpf + " Está correto");
		}
	}
}