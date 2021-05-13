package PROJETO_CADFUNC;

public class Funcionario1 {
	
	//atributos
	private String nome;
	private String matricula;
	protected int horasTrabalhadas;
	protected double valorHora;
	
	private double salario;
	
	// construtores - apenas comNOME e MATRICULA
	

	public Funcionario1(String nome, String matricula) {
	super();
	this.nome = nome;
	this.matricula = matricula;
}

	
	// Construtores - SOBRE CARREGADOR com TODAS as variaveis PRIVADA!!
	
	
	
	
	public Funcionario1(String nome, String matricula, int horasTrabalhadas, double valorHora) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	
	


	
			/// Metodos de GETTER and SETTINS
			
		
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

			

		// Metodos 

		public double mostrarSalario() {
			return (horasTrabalhadas*valorHora);
		}


		//salarioM = (horasTrabalhadas*salario);
		
	}

	


