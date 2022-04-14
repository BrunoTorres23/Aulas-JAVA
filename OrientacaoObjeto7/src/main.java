
public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa(); //Instanceando objeto (ou criando) no caso "pessoa1"
		
		pessoa1.nome = "Bruno"; 
		pessoa1.Numfigurinhas = 1;
		
		pessoa1.receber(3);
		
		    System.out.println(pessoa1.nome);
			System.out.println(pessoa1.Numfigurinhas);
			
			Pessoa pessoa2 = new Pessoa();
			
			pessoa2.nome = "Gomes";
			pessoa2.Numfigurinhas = 3;
			
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.Numfigurinhas);
			
			pessoa1.dar(2, pessoa2);
			
			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.Numfigurinhas);
			
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.Numfigurinhas);
			
	}

}
