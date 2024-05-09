package features;

public class Spotify implements ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("tocando !");
		
	}

	@Override
	public void pausar() {
		System.out.println("pausando !");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("selecionando musica !");
		
	}

}
