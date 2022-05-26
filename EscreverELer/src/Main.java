import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Digite a sua mensagem:");
		Scanner entrada = new Scanner(System.in);
		String digitado = (entrada.nextLine());
		
		try (BufferedWriter escrever =  new BufferedWriter(new FileWriter("saida.txt"))){
	
	 			escrever.write(entrada.toString());
		}

		try(BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))){
			String line;
			String string = "";
		}
		
		System.out.println(digitado);
		
		
	
	}

}