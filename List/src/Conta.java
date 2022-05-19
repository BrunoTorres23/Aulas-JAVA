
public class Conta {
	
	String nome;
	double valor;
	
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}

	public Conta(String nome, double valor) { //construtor, fields
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	
	
}
