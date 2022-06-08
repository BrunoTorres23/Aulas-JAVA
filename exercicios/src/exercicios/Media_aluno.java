package exercicios;

public class Media_aluno {

	public static void main(String[] args) {
		
		double nota1; //variaveis para notas e media final
		double nota2;
		double nota3;
		double media; 
		
		nota1 = 8.5; // valores pre definidos para notas
		nota2 = 7.5;
		nota3 = 6.0;
		
		System.out.println("Calculo de Média:");
		System.out.println("nota 1: " + nota1);
		System.out.println("nota 2: " + nota2);
		System.out.println("nota 3: " + nota3);
		System.out.println("");
		System.out.println("gerando média...");
		System.out.println("");
		
		media = nota1 + nota2 + nota3; // calculos para gerar a media
		
		System.out.println("Sua média gerada foi de: ");
		System.out.println(media / 3); 
		
	}

}
