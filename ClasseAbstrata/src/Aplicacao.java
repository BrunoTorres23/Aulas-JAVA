//a aplicacao é a classe que vai executar tudo que foi criado nas sub classes
public class Aplicacao {

	public static void main(String[] args) {
		Item item = new Cogumelo(); //aqui esta dizendo que "item" vai receber o valor "cogumelo"
		item.pegar(); //"pegar" vira um metodo
		
		item = new DIamante();
		item.pegar();
		
		item = new Moeda();
		item.pegar();

	}

}
