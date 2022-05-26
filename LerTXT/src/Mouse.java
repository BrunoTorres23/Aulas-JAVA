
public class Mouse {
	
	private String funciona;
	private int qtdbotoes;
	private String tamanho;
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
		String[] arrayAuxiliar2 = arrayAuxiliar1 [0].split("=");
		this.funciona = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar1 = arrayAuxiliar1[1].split("=");
		this.qtdbotoes = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar1 = arrayAuxiliar1[2].split("=");
		this.tamanho = arrayAuxiliar2[1].trim();
	}
	
	
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
