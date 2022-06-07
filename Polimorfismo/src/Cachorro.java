
public class Cachorro extends Animal { //cachorro extende animal, pois animal é a classe mãe

	//overrride de sobescrita de metodos, sons caracteristicos de cachorro
	@Override
	public void Falar() {
		System.out.println("AUAU");
	}

	public void morder() {
		System.out.println("NHAC");
		
	}
	
	
}
