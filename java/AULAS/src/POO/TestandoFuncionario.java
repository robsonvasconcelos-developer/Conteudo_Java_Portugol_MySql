package POO;

public class TestandoFuncionario {

	public static void main(String[] args) {
		
		// instanciando o Funcionario 
		//Criando OBJETO chamado func
		
		Funcionario_enpsulamento func = new Funcionario_enpsulamento();
		
		//Criando Parametros, para depois chamar os metodos:
		
		func.setNome("BIA");
		func.setSalario(2500);

		System.out.println(func.getNome());
		System.out.println(func.getSalario());
		
		
		

	}

}
