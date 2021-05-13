package PROJETO_CADFUNC;

public class FuncionarioTerceiro extends Funcionario1 {

	
	//Atributos
	
	private double adicional=10; //valor do adicional 10 reais
	/*private double mostrarSalario=0.00;
	private double salarioM;
	private double salario;*/
	
	
	// construtores - escolher da SUPERCLASS ""FUNCIONARIO1"

	public FuncionarioTerceiro(String nome, String matricula, int horasTrabalhadas, double valorHora,
			double adicional) {
		super(nome, matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	//gETTER
	

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	/*@Override
	
	public double salario() {
		return (horasTrabalhadas*valorHora)+adicional;
	}
	*/
	
	//METODOS - calculo CALCULO = horas trabalhadas e valor HOra
	
	
	
	
	

	
	
	
	
}
