
public class Pessoa {
	String nome;
	int Numfigurinhas;

	void receber(int numfig) {
		this.Numfigurinhas += numfig;
	}

	boolean dar(int qtdfig , Pessoa pessoa)

	{
		if (this.Numfigurinhas < qtdfig) { // o this.Numfigurinhas foi usado pois como eu já estou dentro dessas
													// variaveis
			System.out.println("A troca não pode ser realizada");
			return false;
			
		} else {

			this.Numfigurinhas -= qtdfig;
			pessoa.receber(qtdfig);

			return true;
		}

	}
}