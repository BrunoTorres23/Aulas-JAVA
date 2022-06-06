
public class Aplicacao {

	public static void main(String[] args) {
		
//		Rota rota = new Rota();
		Ferrari ferrari = new Ferrari();	//instanciamento de ferrari
//		rota.ir(ferrari);
//		
//		System.out.println();
//		
//		Fusca fusca = new Fusca ();
//		rota.ir(fusca);
		
		Vendedor vendedor = new Vendedor ();	//instanciamento de vendedor
		Apartamento apartamento = new Apartamento();	//instanciamento de apartamento
		
		vendedor.mostrarPreco(apartamento);	//o vendedor com o metodo de mostrar o preco de apartamento 
		vendedor.mostrarPreco(ferrari);		//o vendedor com o metodo de mostrar o preco de ferrari
	}

}
