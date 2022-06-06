
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo(); //instanciamento de veiculo
		
		veiculo.setMarca("Honda"); //veiculo vai receber marca, modelo e ano
		veiculo.setModelo("City");
		veiculo.setAno(2013);
		
		veiculo.imprimir();	//assinatura de metodo
		veiculo.buzinar();	//veiculo recebe o metodo buzinar
		
		Carro carro = new Carro(); //instanciamento de carro
		
		carro.setMarca("Honda"); //carro vai receber marca, modelo e ano
		carro.setModelo("Fit");
		carro.setAno(2014);
		carro.setQuatroPortas(true);	//quatroportas para identificar se o carro contem as 4 portas, se não seria falso
		System.out.println();
		carro.imprimir();
		carro.buzinar();
		
		Caminhao caminhao = new Caminhao();	//instanciamento de caminhao
		
		caminhao.setMarca("SCANIA");	//caminhao recebe marca, modelo e ano
		caminhao.setModelo("XJT76");
		caminhao.setAno(2021);
		
		System.out.println();
		
		caminhao.imprimir();	//assinatura de metodo
		caminhao.buzinar();
		
		Moto moto = new Moto();		//instanciamento de moto
		
		moto.setMarca("Honda");		//moto recebe marca, modelo e ano
		moto.setModelo("Titan");
		moto.setAno(2014);
		
		System.out.println();
		
		moto.imprimir();
		moto.buzinar();
		moto.empinar();		//metodo proprio apenas para moto
	}

}
