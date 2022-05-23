package br.com.fourpark.principal.model;

public class Veiculo {

	private String modelo;
	private String placa;
	private String proprietario;

	public Veiculo() {
	}

	public Veiculo(String modelo, String placa, String proprietario) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.proprietario = proprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "{" + "modelo='" + modelo + '\'' + ", placa='" + placa + '\'' + ", proprietario='" + proprietario + '\'' + '}';
	}

}
