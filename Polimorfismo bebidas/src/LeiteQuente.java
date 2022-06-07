
public class LeiteQuente extends Bebida { //extende de bebiba pois bebida é a classe mãe das outras 

	public LeiteQuente() {
		//neste caso, leite quente é a unica bebiba sendo servida quente, então, recebe um boolean de true ou false
		super("Leite Quente" , true);
		
	}

	@Override
	public void preparar() {
		
		//aquecer so entra nesse caso pois leite quente é a unica bebida que precisa 
		super.preparar(); //chamou o super pois é algo que sempre vai ser executado 
		System.out.println("Colocando o leite no copo");
		System.out.println("Aquecendo o leite");
	}

	

	
	
	
}
