package hardware;

import software.MediaPlayer;
import software.Navegador;
import software.Telefone;

public class Iphone implements MediaPlayer, Navegador, Telefone {
	
	protected String numero;
	protected String url;
	protected String musica;
	
	public Iphone() {
		
	}
	
	public Iphone(String numero, String url, String musica) {
		this.numero = numero;
		this.url = url;
		this.musica = musica;
	}	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	@Override
	public String ligar(String numero) {;
		return "Ligando para o número " + numero;
	}

	@Override
	public String atender() {
		return "Ligação atendida";
	}

	@Override
	public String iniciarCorreioVoz() {
		return "Iniciando Correio de Voz";
	}

	@Override
	public String exibirPagina(String url) {
		return "Exibindo a página -> " + url;
	}

	@Override
	public String adicionarNovaAba() {
		return "Nova aba criada";
	}

	@Override
	public String atualizarPagina() {
		return "Página atualizada com sucesso!";
	}

	@Override
	public String tocar() {
		return "Tocando música: " + musica;
	}

	@Override
	public String pausar() {
		return "Música Pausada";
	}

	@Override
	public String selecionarMusica(String musica) {
		return "Música selecionada:  " + musica;
	}

}
