//a classe abstrata não pode se instanciar um objeto
public abstract class Item {
	
	
	
	private int posx; //criaçaõ de variavel private
	private int posy;
	
	public abstract void pegar (); 
	
	//geração de getters and setters
	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}
}
