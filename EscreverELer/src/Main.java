import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;		//importações
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Digite a sua mensagem:");		//syso para aparecer para o usuario uma mensagem 
		Scanner entrada = new Scanner(System.in);		//scanner entrada para ler e possibilitar o usuario a escrever 
		String digitado = (entrada.nextLine());			
		
		try (BufferedWriter escrever =  new BufferedWriter(new FileWriter("saida.txt"))){ //o try com o buffered para caso aconteça algo no codigo o try protege 
	
	 			escrever.write(entrada.toString());		//vai ler uma tostring 
		}

		try(BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))){
			String line;
			String string = "";
		}
		
		System.out.println(digitado);	//aqui vai ler tudo que foi digitado
		
		
	
	}

}
