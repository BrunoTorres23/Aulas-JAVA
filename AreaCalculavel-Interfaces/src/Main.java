
public class Main {

	public static void main(String[] args) {
		
		 double x = 7; // declaracao de variavel com x igual a 7
		double y = 6; // declaracao de variavel com y igual a 6
		
		AreaCalculavel areaCalculavel = new quadrado(); //areacalculavel recebe quadrado
		areaCalculavel.calcularArea(x, y); //areacalculavel vezes o metodo 
		
		areaCalculavel = new retangulo(); //areacalculavel recebe retangulo
		areaCalculavel.calcularArea(x, y);  //areacalculavel vezes o metodo 
		
		areaCalculavel = new circunferencia(); //areacalculavel recebe circunferencia
		areaCalculavel.calcularArea(x, y); //areacalculavel vezes o metodo 
			

	}

}
