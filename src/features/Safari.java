package features;

public class Safari implements NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("exibindo pagina !");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("adicionando nova aba !");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("atualizando pagina !");
		
	}

}
