
public class Main {
	
	public static final double PI = 3.14;
	
	//o enum cria conjuntos de constantes 
	private enum Sexo{
		MASCULINO, FEMININO;
		
		
	}
	
	public static void main(String[] args) {
		
		double pi = Main.PI;
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA; //ele só aceita os enums que estao no dia da semana 
		int num = DiaDaSemana.SEGUNDA.getNum();
		
		System.out.println(num);
		
		String s = "TERCA"; //s esta recebendo terca nesse caso
		hoje = DiaDaSemana.valueOf(s);
		
		System.out.println(hoje.getNum()); //get num sao os dias da semana, 1,2,3 etc... estao atribuidos conforme os dias da semana 
		
		Sexo sexo = Sexo.FEMININO; //sexo recebe tanto feminino e masculino
		sexo = Sexo.MASCULINO;
		
		
	}

}
