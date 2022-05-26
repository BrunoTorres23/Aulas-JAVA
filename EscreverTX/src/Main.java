import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
	 String s = "texto para ser gravado no arquivo.";
	
	 	Mouse mouse1 = new Mouse(true, 3, "medio");
	 	Mouse mouse2 = new Mouse(false, 3, "pequeno");
	 	Mouse mouse3 = new Mouse(true, 3, "grande");
	
	 	List<Mouse> ListadeMouse = new ArrayList<Mouse>();
	 	
	 	ListadeMouse.add(mouse1);
	 	ListadeMouse.add(mouse2);
	 	ListadeMouse.add(mouse3);
	 	
	 	try (BufferedWriter escrever =  new BufferedWriter(new FileWriter("saida.txt"))){
	 		
	 		for (Mouse mouse:ListadeMouse) {
	 
	 			escrever.write(mouse.toString());
    
	
    }
	
	 	}  
    
    
	}
}