import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

		for (int x = 0; x < 4; x++) {

			Pessoa pessoa = new Pessoa();
			pessoa.setEndereco(new Endereco());

			System.out.println("Digite o seu nome: ");
			pessoa.setNome(entrada.next());

			System.out.println("Digite a sua idade: ");
			pessoa.setIdade(entrada.nextInt());

			System.out.println("Digite a sua rua de endereço: ");
			pessoa.getEndereco().setRua(entrada.next());;

			System.out.println("Digite o numero da sua rua: ");
			pessoa.getEndereco().setNum(entrada.nextInt());;

			System.out.println("Digite o seu bairro: ");
			pessoa.getEndereco().setBairro(entrada.next());;
			
			System.out.println("Digite M caso o seu sexo seja Masculino e F caso seja Feminino");
			

		}

	}
}
