import Aparelho.iPhone;
public class UsuarioIphone {
	public static void main(String[] args) {
		iPhone iphone = new iPhone();
		
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Um Sonhador");
        iphone.ligar("(99 9999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.paginaweb.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
	}
}
