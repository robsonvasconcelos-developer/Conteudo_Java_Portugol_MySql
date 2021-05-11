package POO;

public class Pessoa {
	
	//ATRIBUTOS
	
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	/* O meu CONSTRUTOR(pedreiro) "Pessoa" ele ta RECEBENDO os "nomes com PARAMETROS" 
	e esta ATRIBUINDO, aos ATRIBUTOS que Criei*/
	
	public Pessoa (String primeiro,String meio,String ultimo)//dentro de () PARAMETROS
	{
		//AGORA jogar o PARAMETRO dentro do ATRIBUTO.
		primeiroNome =primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
		
		
		
	}
	
	//CRIANDO um metodo para Juntar aos 3 nomes:
	//CRIE O METODO - ABAIXO
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}


}

      //Construtor - Tipo public pode ser INVOCADO por qualquer CLASS


		//Lembrando que o CONSTRUTOR sera sempre o mesmo nome da classe "Pessoa" 
		
		//Seguido= Da lista dos Parametros,que vou ter.
		
		
		
		//Palavra reservada como ""NEW"", que cria um NOVO Objeto!!!
		