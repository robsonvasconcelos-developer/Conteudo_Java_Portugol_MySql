package POO;

public class Coordenador_teste extends Pessoa_teste {

	private String cursoCoordenado;
	
	public Coordenador_teste(String nome, int matricula, String cursoCoordenado)
	{
		super(nome,matricula);
		this.cursoCoordenado = cursoCoordenado;
		
	}
	
	/// Metodos de GETTER and SETTINS

	public String getCursoCoordenado() {
		return cursoCoordenado;
	}

	public void setCursoCoordenado(String cursoCoordenado) {
		this.cursoCoordenado = cursoCoordenado;
	}

	
	

	
	
	
}
