//sub classe que herdou da super classe "item"
public class Cogumelo extends Item {

	@Override //override para sobrepor o metodo
	public void pegar() {
		System.out.println("Pegou o Cogumelo");
	}
	
	
}
