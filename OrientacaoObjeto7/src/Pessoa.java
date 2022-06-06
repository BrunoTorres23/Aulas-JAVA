
public class Pessoa {
	String nome;
	int Numfigurinhas;

	//recebe o num de figurinhas 
	void receber(int numfig) {
		this.Numfigurinhas += numfig;	// o += adiciona um valor 
	}

	boolean dar(int qtdfig , Pessoa pessoa)

	{
		if (this.Numfigurinhas < qtdfig) { // o this.Numfigurinhas foi usado pois como eu já estou dentro dessas
													// variaveis
			return false;
			
		
			
		} else {

			this.Numfigurinhas -= qtdfig;
			pessoa.receber(qtdfig);

			return true;
		}

	}
}
