import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException; //importações 
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException { //A palavra-chave throws serve para declarar que um método 
						//pode lançar exceções de um determinado tipo.
		
	 String s = "texto para ser gravado no arquivo."; //s recebe String
	
	 	Mouse mouse1 = new Mouse(true, 3, "medio"); //mouse 1,2,3 recebe varios atributos diferentes 
	 	Mouse mouse2 = new Mouse(false, 3, "pequeno");
	 	Mouse mouse3 = new Mouse(true, 3, "grande");
	
	 	List<Mouse> ListadeMouse = new ArrayList<Mouse>(); //list para listar os mouses, arraylist para guaradr as infomraçoes em forma de lista 
	 	
	 	ListadeMouse.add(mouse1); //add para adicionar mais itens a lista 
	 	ListadeMouse.add(mouse2);
	 	ListadeMouse.add(mouse3);
	 	
	 	try (BufferedWriter escrever =  new BufferedWriter(new FileWriter("saida.txt"))){
	 		
	 		for (Mouse mouse:ListadeMouse) {	//enhanced for lista de mouse
	 
	 			escrever.write(mouse.toString()); //mouse vai receber uam string 
    
	
    }
	
	 	}  
    
    
	}
}
