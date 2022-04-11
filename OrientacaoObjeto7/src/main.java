
public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa(); //Instanceando objeto (ou criando) no caso "pessoa1"
		
		pessoa1.nome = "Bruno"; 
		pessoa1.Numfigurinhas = 1;
		
		pessoa1.receber(3);
		
			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.Numfigurinhas);
	}

}
