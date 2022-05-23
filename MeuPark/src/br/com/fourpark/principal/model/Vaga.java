package br.com.fourpark.principal.model;

public class Vaga {

	private Integer posicao;
	private String horaEntrada;
	private String horaSaida;
	private Veiculo veiculo;
	private boolean ocupado;
	
	public Vaga() {
		
	}
	
	public Vaga(Integer posicao) {
		this.ocupado = false;
		this.posicao = posicao;
	}

	public Vaga(Integer posicao, String horaEntrada, String horaSaida, Veiculo veiculo) {
		this.posicao = posicao;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.veiculo = veiculo;
	}


	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public boolean GetOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "{" + "Vaga='" + posicao + '\'' +'}';
	}

}