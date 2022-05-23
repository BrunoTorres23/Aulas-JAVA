
public class Pessoa {
	
	private String nome, endereco;
	private int idade;
	
	private enum Sexo {
		MASCULINO, FEMININO;
	}
	
	//get and set de mome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//get and set de idade 
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//get and set de endereco
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
