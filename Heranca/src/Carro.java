
public class Carro extends Veiculo { //carro extende de veiculo, veiculo é a classe mae
	
	private boolean quatroPortas;

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Tem 4 portas; " + quatroPortas);	//sobescrita de metodo, som proprio de carro
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {	//carro tem quatro portas, para true ou false usa-se o boolean 
		this.quatroPortas = quatroPortas;
	}
	
	
}
