import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		matematica Matematica = new matematica();
		
		System.out.println("Somar dois n�meros");
		System.out.println("Digite o primeiro n�mero: ");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int y = scanner.nextInt();
		
		
		
		int soma = Matematica.somar(x, y);
		System.out.println("o resultado �: " + soma + "!!!");
		
		soma = Matematica.somar(x, y, 5);
		System.out.println("o resultado �: " + soma + "!!!");
		
		double soma2 = Matematica.somar(x, y);
		System.out.println("o resultado �: " + soma2 + "!!!");
	}

}
