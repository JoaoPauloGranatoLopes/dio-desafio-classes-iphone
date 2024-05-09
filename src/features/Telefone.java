package features;

public class Telefone implements AparelhoTelefonico{

	@Override
	public void ligar() {
		System.out.println("ligando !");
		
	}

	@Override
	public void atender() {
		System.out.println("atendendo !");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("iniciando correio de voz !");
		
	}
	
}

	