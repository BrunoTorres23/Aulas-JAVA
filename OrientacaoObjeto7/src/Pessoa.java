
public class Pessoa {
	String nome;
	int Numfigurinhas;

	void receber(int numfigurinhas) {
		this.Numfigurinhas += numfigurinhas;
	}

	boolean dar(int numfigurinhas, Pessoa pessoa)
	
	{
		if (this.Numfigurinhas < numfigurinhas) { //o this.Numfigurinhas foi usado pois como eu j� estou dentro dessas variaveis

			System.out.println("A troca n�o pode ser realizada");
			
			return false;
	}
		else {

			this.Numfigurinhas -= numfigurinhas;
			pessoa.receber(Numfigurinhas);
			
			return true;
	}


	}
	}