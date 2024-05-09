package application;

import features.Safari;
import features.Spotify;
import features.Telefone;

public class IPhoneMultifuncional {

	public static void main(String[] args) {

		System.out.println("acionando a função telefone:");
		System.out.println();
		Telefone aparelho = new Telefone();
		aparelho.atender();
		aparelho.ligar();
		aparelho.iniciarCorreioVoz();
		System.out.println("___________________________________");

		System.out.println("acionando a função browser:");
		System.out.println();
		Safari browser = new Safari();
		browser.exibirPagina();
		browser.adicionarNovaAba();
		browser.atualizarPagina();
		System.out.println("___________________________________");

		System.out.println("acionando a função reprodutor musical:");
		System.out.println();
		Spotify spot = new Spotify();
		spot.selecionarMusica();
		spot.tocar();
		spot.pausar();
		System.out.println("___________________________________");
	}

}
