
public class Mouse {
	
	//atributos de mouse
	private String funciona;
	private int qtdbotoes;
	private String tamanho;
	
	//constructor
	public Mouse(boolean funciona, int qtdbotoes, String tamanho) {
	
		super();
		this.funciona = funciona;
		this.qtdbotoes = qtdbotoes;
		this.tamanho = tamanho;
		
	
	}
	@Override
	public String toString() {
		return "Mouse [funciona=" + funciona + ", qtdbotoes=" + qtdbotoes + ", tamanho=" + tamanho + "]" + "\n";
	}
	
	public Mouse(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1 [0].split("=");	//o array para colocar as informaçoes lado a lado
		this.funciona = arrayAuxiliar2[1].trim();			//o split para quebrar aquilo que não precisa ser mostrado
										//o trim corta os espaços sobrados
		
		String[] arrayAuxiliar1 = arrayAuxiliar1[1].split("=");
		this.qtdbotoes = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar1 = arrayAuxiliar1[2].split("=");
		this.tamanho = arrayAuxiliar2[1].trim();
	}
	
	//getters and setters
	public boolean isFunciona() {
		return funciona;
	}
	
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	
	public int getQtdbotoes() {
		return qtdbotoes;
	}
	
	public void setQtdbotoes(int qtdbotoes) {
		this.qtdbotoes = qtdbotoes;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	


	
		
}
