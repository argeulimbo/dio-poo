package application;

import hardware.Iphone;

public class Program {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		System.out.println(" - - - - - MEDIA PLAYER - - - - - ");
		//MediaPlayer - Selecionar Música
		String musica = "Versus Simples - Chimarruts";
		iphone.setMusica(musica);	
		System.out.println(iphone.selecionarMusica(musica));
		
		//MediaPlayer - Tocar
		System.out.println(iphone.tocar());
		
		//MediaPlayer - Pausar
		System.out.println(iphone.pausar());
		System.out.println();
		
		System.out.println(" - - - - - NAVEGADOR - - - - - ");
		//Navegador - Adicionar Aba
		System.out.println(iphone.adicionarNovaAba());
		
		//Navegador - Exibir página
		String url = "https://github.com/argeulimbo/dio-poo";
		iphone.setUrl(url);
		System.out.println(iphone.exibirPagina(url));
		
		//Navegador - Atualizar página
		System.out.println(iphone.atualizarPagina());
		System.out.println();
		
		System.out.println(" - - - - - TELEFONE - - - - - ");
		//Telefone - Ligar
		String numero = "(31) 973051592";
		iphone.setNumero(numero);
		System.out.println(iphone.ligar(numero));

		//Telefone - Atender
		System.out.println(iphone.atender());

		//Telefone - Correio de Voz
		System.out.println(iphone.iniciarCorreioVoz());
	}

}
