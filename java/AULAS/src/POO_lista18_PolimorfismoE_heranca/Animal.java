package POO_lista18_PolimorfismoE_heranca;

public class Animal {
	
	
	//Atributos
	
	private String especie;
	private String raca;
	
	private String nome;
	private int idade;
	private String emitirSom;
	private String correr;
	
	
	//Construtor
	public Animal (String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	/// Metodos de GETTER and SETTINS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

// METODOS de ACAO do animal 
	
public void som() {
	System.out.println("Fazendo som ...");
}


	

	
	

}
