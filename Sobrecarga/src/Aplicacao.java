import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		//scanner para o usuario poder escrever 
		Scanner scanner = new Scanner (System.in); //System.in é o que faz a leitura do que se escreve no teclado
		
		
		matematica Matematica = new matematica();
		
		
		
		System.out.println("Somar dois números");
		System.out.println("Digite o primeiro número: ");
		int x = scanner.nextInt();	//nextint faz retorno de inteiro
		
		System.out.println("Digite o segundo número: ");
		int y = scanner.nextInt();
		
		
		//soma vai ser o resultado matematico entre x e y
		int soma = Matematica.somar(x, y);
		System.out.println("o resultado é: " + soma + "!!!");
		
		soma = Matematica.somar(x, y, 5);
		System.out.println("o resultado é: " + soma + "!!!");
		
		double soma2 = Matematica.somar(x, y);
		System.out.println("o resultado é: " + soma2 + "!!!");
	}

}
