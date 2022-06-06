
public class Main {
	
	public static final double PI = 3.14;
	
	//o enum cria conjuntos de constantes 
	private enum Sexo{
		MASCULINO, FEMININO;
		
		
	}
	
	public static void main(String[] args) {
		
		double pi = Main.PI; //constante que nao for enum tem que ser guardada em algum lugar
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA; //ele só aceita os enums que estao no dia da semana 
		int num = DiaDaSemana.SEGUNDA.getNum(); // pega o dia da semana e o numero do indice que esta ao lado
		
		System.out.println(num);
		
		String s = "TERCA"; //s esta recebendo terca nesse caso
		hoje = DiaDaSemana.valueOf(s); //Procura a variavel string que está na variavel s e coloca na variavel hoje.
		
		System.out.println(hoje.getNum()); //get num sao os dias da semana, 1,2,3 etc... estao atribuidos conforme os dias da semana 
		
		Sexo sexo = Sexo.FEMININO; //sexo recebe tanto feminino e masculino
		sexo = Sexo.MASCULINO;
		
		
	}

}
