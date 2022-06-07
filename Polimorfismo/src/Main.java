
public class Main {

	public static void main(String[] args) {

//		Animal animal = new Cachorro();
//		animal.Falar();				//os codigos comentados são maneiras mais longas de executar, o modo abaixo são formas que simplificam
//		
//		animal = new Gato();
//		animal.Falar();
		Gato gato = new Gato();		//instanciamento de gato
		Cachorro cachorro = new Cachorro();	//instanciamento de cachorro
		falar(gato);	//gato receber um metodo de falar 
		falar(cachorro);	////cachorro receber um metodo de falar 
	}
	
	//ambos os animais vão executar seus sons proprios ja que o falar já estão com o animal que receb os dois animais
	public static void falar(Animal a) {
		a.Falar();
		
		if (a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			a.morder();	//O operador instanceof testa a presença da função construtora do objeto, que seria o cachorro morder 
		}
	}
	

}
