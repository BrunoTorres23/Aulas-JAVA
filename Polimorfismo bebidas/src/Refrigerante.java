
public class Refrigerante extends Bebida {

	public Refrigerante() {
		//refri recebe false pois não é bebida que será servida quente 
		super("Refrigerante", false); //refrigerante como nome já, e o falso para retornar com o boolean
		
	}

	@Override
	public void preparar() {
		
		super.preparar(); //chamou o super pois é algo que sempre vai ser executado 
		System.out.println("Colocando gelo no copo"); 
		System.out.println("Colocando o refrigerante");
		
	}
	
	
	
}
