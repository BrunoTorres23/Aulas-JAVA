
public class Quadrado implements CalcularInterface {

	private Double lado; //private porque o "lado" usado no quadrado é um atributo unico

	//getters and setters
	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	@Override
	public void CalcularArea() {
		System.out.println("A area do quadrado é: " + Math.pow(lado, 2)); 
	} 
	
	//math pow usado para simplicar e não precisar 
	//escrever lado*lado, o pow eleva o segundo valor digitado
		
	
	
	
	
}
