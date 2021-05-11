package POO;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa_teste jessica = new Pessoa_teste("Jessica", 555);
		Funcionario_teste pedro = new Funcionario_teste("Pedro", 222,"TI");
		Pessoa_teste maria = new Funcionario_teste("Maria", 333,"Informatica --DEV");
		Pessoa_teste jose = new Coordenador_teste("Jose", 444,"CC");
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
		

	}

}
