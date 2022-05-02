
public class main {

	public static void main(String[] args) {

		//variável (nome da classe) + endereço = construtor de objeto
		ContaBancaria conta1 = new ContaBancaria();
		
//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo); 
		
//		//informa o valor a receber
//		conta1.receber(100.8); 
//		
//		//valor a dar
//		conta1.dar(72.5);
		
		//mostra na tela o saldo
		//System.out.println(conta1.saldo());
		
		//ContaBancaria conta2 = new ContaBancaria();
	
		//System.out.println(conta2.saldo());
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Bruno");
		cliente.setCpf(484716);
		cliente.setNumConta(482173);
		
//		System.out.println(cliente.getNome());
//		System.out.println(cliente.getCpf());
//		System.out.println(cliente.getNumConta());
		
		System.out.println(cliente);
		
 
	
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Bruno");
		cliente2.setCpf(48948);
		cliente2.setNumConta(49846);
		
//		cliente2 = cliente1; 
		
		System.out.println(cliente2);
		
		if (cliente.getNome() == cliente2.getNome()) { //ele pega o nome como comparação com "==" e o get como quesito diferente, é preciso o get, ele compara endereço
			System.out.println("Os objetos são iguais");
			
		} else {
				System.out.println("Os objetos são diferentes");
			}
		
		
		if (cliente == cliente2) {
			System.out.println("os objetos são iguais");
			
		} else {
			System.out.println("os objetos são diferentes");
		}
		
		
		if(cliente.equals(cliente2)) {
			System.out.println("os objetos são iguais");
		} else { 
			System.out.println("os objetos são diferentes");
	
}
	}
}
