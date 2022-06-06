//nas interfaces no lugar de extender, colocamos implements, posso colocar quantas interfaces que prcisar
public class Ferrari implements Automovel, ItemCaro {

	
	//sobescrita de metodos que implementa de veiculo
	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
	}

	@Override
	public Double getPreco() {
		
		return 5000000;
	}
	
	
}
