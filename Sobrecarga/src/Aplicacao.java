
public class Aplicacao {

	public static void main(String[] args) {
		
		matematica Matematica = new matematica();
		
		int soma = Matematica.somar(3, 4);
		System.out.println("o resultado �: " + soma + "!!!");
		
		soma = Matematica.somar(3, 4, 5);
		System.out.println("o resultado �: " + soma + "!!!");
		
		double soma2 = Matematica.somar(3.5, 4);
		System.out.println("o resultado �: " + soma2 + "!!!");
	}

}
