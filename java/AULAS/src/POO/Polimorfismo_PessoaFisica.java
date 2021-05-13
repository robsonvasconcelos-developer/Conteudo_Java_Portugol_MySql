package POO;

//Feito uma HERANCA from SUPERCLASS Polimorfismo_Pessoa1
public class Polimorfismo_PessoaFisica extends Polimorfismo_Pessoa1 {

	//Atributos de cada TIPO
	
	private long cpf;

	//Criando um construtor VAZIO, pois, neste caso PODE!
	public Polimorfismo_PessoaFisica()
	{
		
	}

	
	//Fazendo GETTERS and SETTERS para o atrributo= 
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
				//Metodo
	// chamado e criando um Metodo GET Nome dentro da PESSOA Fisica
	
	// Vou HERDAR da superclass PESSOA1
	
	public String getNome() //Metodo que fara, o polimorfismo com a superCLASS
	{
		//Chamando Atributos da SUPERCLASS e desta Class Pessoa Fisica
	/*SAIDA -->*/	return "Pessoa fisica: "+super.getNome()+ "CPF: "+this.getCpf();
		
		//IMPORTANTE
//PALAVRA reservada: SUPER ---> Chamando atributos da SUPERCLASS - pessoa1
//PALAVRA reservada: THIS ---> Chamando atributos da Desta CLASS - pessoaFisica.

	}
	
		
	
	
	
	
	
}
