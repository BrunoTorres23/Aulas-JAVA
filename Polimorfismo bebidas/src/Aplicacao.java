
public class Aplicacao {

	public static void main(String[] args) {
		
		//instanciamento de objeto
		Preparador preparador = new Preparador();
		
		//instanciamento de objeto, a partir desse ponto a variavel criada podera ser usada no metodo de prepararbebida
		LeiteQuente leiteQuente = new LeiteQuente();
		preparador.prepararBebida(leiteQuente);
		
		//refrigerante tbm na mesma aplicação
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);

	}

}
