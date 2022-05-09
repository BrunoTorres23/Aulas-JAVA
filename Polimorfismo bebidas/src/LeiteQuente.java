
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		
		super("Leite Quente" , true);
		
	}

	@Override
	public void preparar() {
		
		super.preparar(); //chamou o super pois é algo que sempre vai ser executado 
		System.out.println("Colocando o leite no copo");
		System.out.println("Aquecendo o leite");
	}

	

	
	
	
}
