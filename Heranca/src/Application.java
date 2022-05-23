
public class Application {

	public static void main(String[] args) {
				
		ContaCorrente cc = new ContaCorrente(110, 111, "Banco teeste", 20.00, 10.00);
		System.out.println(cc);
		System.out.println("O saldo total da conta corrente é: " + cc.getVlSaldo());
		System.out.println("O em dinheiro da conta corrente: " + cc.getSaldoDinheiro());
		System.out.println("O saldo limite da conta corrente: " + cc.getLimite());
		
		ContaPoupanca cp = new ContaPoupanca(33, 3, "Banco N", 10.00, 30, 0.05);
		System.out.println(cp);
		System.out.println("O saldo conta poupanca " + cp.getVlSaldo());
	}

}
