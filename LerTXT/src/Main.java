import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;		//importacoes 
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {		//A palavra-chave throws serve para declarar 
												//que um método pode lançar exceções de um determinado tipo.
		
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){	
			String line;	//usado para ler e vai ser jogado na "string", que recebe texto
			String string = "";
			
			while((line = reader.readLine())!= null) {	//enquanto o leitor não se deparar com o null, ele vai continuar aparecendo texto
				string += line + "\n";
			}
				System.out.println(string);
			}
		}

	}


