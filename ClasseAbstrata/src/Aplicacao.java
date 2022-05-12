//a aplicacao é a classe que vai executar tudo que foi criado nas sub classes
public class Aplicacao {

	public static void main(String[] args) {
		Item item = new Cogumelo();
		item.pegar();
		
		item = new DIamante();
		item.pegar();
		
		item = new Moeda();
		item.pegar();

	}

}
