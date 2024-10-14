package Aparelho;

import Funcao.AparelhoTelefonico;
import Funcao.NavegadorInternet;
import Funcao.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
	public void tocar() {
		System.out.println("TOCANDO MÚSICA");
	}
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA");
	}
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MÚSICA");
	}

    public void ligar(String numero) {
		System.out.println("SELECIONANDO NÚMERO");
	}

    public void atender() {
		System.out.println("ATENDENDO TELEFONE");
	}

    public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

    public void exibirPagina(String pagina) {
		System.out.println("EXIBINDO PÁGINA");
	}

    public void adicionarNovaAba() {
		System.out.println("ADICIONANDO PÁGINA");
	}


    public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}

}
