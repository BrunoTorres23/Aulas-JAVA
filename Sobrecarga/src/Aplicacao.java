import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		matematica Matematica = new matematica();
		
		System.out.println("Somar dois números");
		System.out.println("Digite o primeiro número: ");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int y = scanner.nextInt();
		
		
		
		int soma = Matematica.somar(x, y);
		System.out.println("o resultado é: " + soma + "!!!");
		
		soma = Matematica.somar(x, y, 5);
		System.out.println("o resultado é: " + soma + "!!!");
		
		double soma2 = Matematica.somar(x, y);
		System.out.println("o resultado é: " + soma2 + "!!!");
	}

}
