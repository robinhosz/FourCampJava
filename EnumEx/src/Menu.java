public enum Menu {
	SALVAR(1),
	IMPRIMIR(2),
	ABRIR(3),
	VISUALIZAR(4),
	FECHAR(5);
	
	private final int valor;

	Menu(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public static void escolherOpcaoMenu(int valorMenu) {
	if (valorMenu == Menu.ABRIR.getValor()) System.out.println("Abrindo");
	else if (valorMenu == Menu.IMPRIMIR.getValor()) System.out.println("Imprimindo");
	else if (valorMenu == Menu.VISUALIZAR.getValor()) System.out.println("Visualizando");
	else if (valorMenu == Menu.SALVAR.getValor()) System.out.println("Salvando");
	else if (valorMenu == Menu.FECHAR.getValor()) System.out.println("Fechando");
	else System.err.println("Opção invalida");
	}
	
}
