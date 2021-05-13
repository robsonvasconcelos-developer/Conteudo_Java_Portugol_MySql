package POO;

//Feito uma HERANCA from SUPERCLASS Polimorfismo_Pessoa1
public class Polimorfismo_PessoaJuridica extends Polimorfismo_Pessoa1 {
	
	//Criando tipos de ATRIBUTOS
	
	private long cnpj;
	
	//Criando um construtor VAZIO, pois, neste caso PODE!
	public Polimorfismo_PessoaJuridica()
	{
		
	}
	
	//Fazendo GETTERS and SETTERS para o atrributo= 
	
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
					//Metodo
	// chamando e criando um Metodo GET Nome dentro da PESSOA Juridica
	
	// Vou HERDAR da superclass PESSOA1
	
	public String getNome() //Metodo que fara, o polimorfismo com a superCLASS
	{
		return "Pessoa Juridica: "+super.getNome()+ "CNPJ: "+this.getCnpj();
	}
	
	
	
	
	

}
