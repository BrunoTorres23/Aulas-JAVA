
public class Contador {
	
	private static int valor; //valor recebe inteiro
	
//	public Contador() {
//		this.valor = 1;

	//getters and setters e constructor 
	
	static {
		valor = 1; 
	}	
	public static void incrementar () {
		valor ++;
	}
	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public Contador() {
		this.valor = 1;
	}
	

	
	
}
