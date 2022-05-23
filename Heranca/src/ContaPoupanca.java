
public class ContaPoupanca extends Conta{

	private int diaAniversario;
	private double txjuros;
	
	public ContaPoupanca(int nrConta, int nrAgencia, String nmBanco, double vlSaldo, int diaAniversario,
			double txjuros) {
		super(nrConta, nrAgencia, nmBanco, vlSaldo);
		this.diaAniversario = diaAniversario;
		this.txjuros = txjuros;
	}
	
	@Override
	public double getVlSaldo() {
		if (this.diaAniversario == 28) {
		return this.vlSaldo += this.txjuros * this.vlSaldo;
		}  else {
			return this.vlSaldo;
		}
	}
}
