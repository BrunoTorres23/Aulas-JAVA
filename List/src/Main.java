import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//o list organiza as informacoes que o array coleta
		List lista = new ArrayList();
		
		//insere informacoes na variavel que vem de list
//		lista.add("abc");
//		lista.add(12);
//		lista.add(true);
		
		//for para ter uma repeticao
////		for(int x=0; x< lista.size(); x++) {
////			System.out.println(lista.get(x));
////		}
		
		//enhanced for de lista
//		for(Object valor : lista ) {
//			System.out.println(valor);
//		}
//		
		//lista para remover uma informacao
//		System.out.println();
//		lista.remove(0);
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
		
//		System.out.println();
//		
		//add list com enhanced for 
//		lista.add(0, "def");
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
		
//		System.out.println();
//		
//		lista.set(0, "ghi");
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
		
//		System.out.println();
//		lista.clear();		//clear para limpar a lista 
//		if (lista.isEmpty()) {	//is empty confere se esta vazio ou nao
//			System.out.println("Sua lista está vazia");
//		}
		
		Conta conta1 = new Conta("Agua" , 60.00);
		Conta conta2 = new Conta("Luz" , 120.00);
		
		List<Conta> listaDeContas = new ArrayList<Conta>(); //Conta em maiusculo para conta generico (diamond)
		
		//enhanced for de lista de contas, simplificando o codigo 
		for (Conta conta :listaDeContas) {
			System.out.println(conta);
		}
		
	}
	
	

}
