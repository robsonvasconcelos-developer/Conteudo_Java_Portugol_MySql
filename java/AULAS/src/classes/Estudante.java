package classes;

public class Estudante {

	
	//atributos - A maioria dos OBEJTOS em classes e feito em Private,
	//onde nao pode ser acessado em outro Programa.
	
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	private String nome;
	


	//construtores - Criando Sem digitar: 
	//Mouse -->Source-->Generate Construtor using field!! Selecionei CPF e Matricula.
	
	public Estudante(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}



	
	//sobrecarga de construtor - Criando Sem digitar: 
	//Mouse -->Source-->Generate Construtor using field!! Selecionei CPF, Matricula E status
	public Estudante(int matricula, String cpf, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
	}

	//sobrecarga de construtor - Criando Sem digitar: 
		//Mouse -->Source-->Generate Construtor using field!! Selecionei CPF, Matricula E status



	public Estudante(int matricula, String cpf, double pontos, boolean status) {
		super();
		//O  this declarou ATRIBUTO // esse segunda matricula e a variavel!!
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
	}



	//encapsulamento - getters and setters (E como acessar os dados!!!)
	//GETTER =  PEGAR a informacao !!!!
	//Setters = Substituir !!!!
	//VOID = Nao tem o Retorno!!!



	public int getMatricula() {
		return matricula;
	}




	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public double getPontos() {
		return pontos;
	}



/* O SET pontos foi DESATIVADO, porque nao pode alterar!!!!
 * 
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
*/



	public boolean isStatus() {
		return status;
	}




	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
	//metodos
	
	//Mudando os PONTOS com metodos! Adiocinado!!
	




	public void adicionarNota(double pontos) {
		this.pontos = this.pontos + pontos;
	}
	
	public void tirarNota(double pontos) {
		this.pontos = this.pontos + pontos;
	}
	
	
	
	
	
	
}
