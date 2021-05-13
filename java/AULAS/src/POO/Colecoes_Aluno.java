package POO;

public class Colecoes_Aluno {
	
	//Declarando Atributos
	private String nome;
	private String curso;
	double nota;
	
	//Construindo um Public na ORDEm {TERMOS e Parametros} dos Atributos
	public Colecoes_Aluno(String nome, String curso, double nota)
	{
		//Atribuindo os Valores do CONSTRUTOR
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}
	
	//  apenas Para NOMES !!!
	public String toString()
	{
		return this.nome;
	}

	
	
	///Getter and Setter - FEITO para todos!!
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}







}
