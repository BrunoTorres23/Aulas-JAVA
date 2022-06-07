
public class Bebida {
	
	private String nome;
	private boolean aquecer;
	
	//constructor 
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	//getters and setters
	public void preparar () { 
		System.out.println("Pegando o copo"); //fez com que simplificasse, ja que o copo é pego em ambas situações
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
}
