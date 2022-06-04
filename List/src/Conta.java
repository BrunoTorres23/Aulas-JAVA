
public class Conta {
	
	String nome;
	double valor;
	
	@Override //overide para o tostring
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}

	public Conta(String nome, double valor) { //construtor, fields
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	
	
}
