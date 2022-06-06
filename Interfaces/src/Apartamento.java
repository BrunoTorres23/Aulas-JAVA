
public class Apartamento implements ItemCaro {		//apartamento implementa de apartamento 

	@Override
	public Double getPreco() {		//sobescrita de metodo

		return 200000;		//retorna um valor alto por ser um item caro
	}
	
}
