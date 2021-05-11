package POO;

public class Pessoa_teste {
	
	
	//Atributos
	
	private String nome;
	private int matricula;
	
	//
	
	public Pessoa_teste (String nome, int matricula){
		this.nome =nome;
		this.matricula = matricula;
	}
	
	
	/// Metodos de GETTER and SETTINS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	
	
	
}
