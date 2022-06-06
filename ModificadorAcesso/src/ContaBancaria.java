
public class ContaBancaria { // a classe n pode ser privada se não n vai instanciar

	private int numConta; // atributo foi privado
	private boolean ativo;
	private double saldo;
	
	
	//conta bancario ativo se caso true ou falso por conta dele ser boolean, e a quant de saldo
	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
	}
	public ContaBancaria(boolean ativo, double saldo) {
		this.ativo = ativo; // o this diz q esse atributo é da classe
		this.saldo = saldo;
	}
	//metodo que recebe valores
	public void receber (double valor) { // o metodo é capaz de ver o atributo privado
		saldo += valor;
		
	}
	//metodo que mostra o valor
	public double saldo() {
		return saldo;
	}
	
	//metodo dar
	public void dar(double valor) {
		if (saldo >= valor)
		saldo -= valor;
	}
	
	
	
}
