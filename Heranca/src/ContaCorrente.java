public class ContaCorrente extends Conta{

	private double chequeEspecial;

	public ContaCorrente(int nrConta, int nrAgencia, String nmBanco, double vlSaldo, double chequeEspecial) {
		super(nrConta, nrAgencia, nmBanco, vlSaldo);
		this.chequeEspecial = chequeEspecial;
		
	}
	
	@Override
	public String toString() {
		return "Conta ="+ getNrConta()+ ", Ag�ncia =" + getNrAgencia() + ", Banco ="+ getNmBanco() +
				", Saldo =" + getVlSaldo() + ", Cheque Especial = " + chequeEspecial + "]";
	}
	

	public double getVlSaldo() {
		return this.chequeEspecial + this.vlSaldo;
	}
	
	public double getSaldoDinheiro() {
		return getVlSaldo() - this.chequeEspecial;
	}
	
	public double getLimite() {
		return this.chequeEspecial;
	}
	
	}


