public enum Aula17 {

	PESSOA_FISICA("1"), PESSOA_JURIDICA("Pessoa Juridica");

	private String texto;

	Aula17(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
}
