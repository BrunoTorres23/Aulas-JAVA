
public class Preparador {
	
	public void prepararBebida (Bebida bebida) {
		 System.out.println("Preparando a bebida " + bebida.getNome());
		 
		//ja que a bebida esta recebendo refri e leite quente será usado o get nome para puxar
		 bebida.preparar(); 
		 
		//se a bebida for aquecida, aqui aparecera o leite quente, ja que recebeu um metodo de aquecer e true de boolean 
		 if (bebida.isAquecer()) {
			 
		 		System.out.println("Aquecendo a bebida " + bebida.getNome());
		 		
		 }
		 
		//no final as duas bebidas serão preparadas 
		 System.out.println("Bebida preparada com sucesso\n");
			 	
	}

	
		
	
}
