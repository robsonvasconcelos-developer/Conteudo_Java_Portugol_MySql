package POO;

public class Funcionario_teste extends Pessoa_teste {
	
	private String departamento;
	
	public Funcionario_teste(String nome, int matricula, String departamento)
	{
		super(nome, matricula);
		this.departamento = departamento;
	}

	
	/// Metodos de GETTER and SETTINS
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	

}
