package POO;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		//criando um OBJETO de uma PESSOA FISICA
		//Palavra Reservada NEW "INSTANCEIA" a PESSOA FISICA
		Polimorfismo_PessoaFisica fisica = new Polimorfismo_PessoaFisica();
		// Agora o OBJETO e conhecido como "fisica".
		fisica.setNome("Juliana"); //Colocando nome no OBJETO "fisica"
		fisica.setCpf(1215L);//SET e para RENOMA aquele OBJETO.
		
		Polimorfismo_PessoaJuridica juridica = new Polimorfismo_PessoaJuridica();
		juridica.setNome("Cristino S.A."); 
		juridica.setCnpj(1214165L);//SET e para RENOMA aquele OBJETO.
		
		
		//Estanciando a PESSOA1 da SUPERCLASS
		//Criando ARRAY com 2 posicoes para o OBJETO
		Polimorfismo_Pessoa1[] pessoas = new Polimorfismo_Pessoa1[2];
	//Colocando PESSOAS fisicas e Juridicas em um OBJETO com ARRAYs
		pessoas[0]=fisica;//posicao 0 e PESSOA FISICA
		pessoas[1]=juridica;//posicao 0 e PESSOA JURIDICA
		
		
		//loop para Percorrer
		for(Polimorfismo_Pessoa1 pessoa:pessoas)
			//criei "pessoa" do nada para correr o LOOP e chamar meu ARRAY "pessoas".
		{
			//Impremindo
			System.out.println(pessoa.getNome());//pegou NOME da superCLASS
		}
		
		
	}

}
