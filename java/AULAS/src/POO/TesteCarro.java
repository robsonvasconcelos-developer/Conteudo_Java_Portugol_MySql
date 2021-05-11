package POO;

public class TesteCarro {

	public static void main(String[] args)
	{
		
		//Instanciando o CARRO e criando um novo OBJETO=
		Carro meuCarro = new Carro();
		//Adicionando CARACTERISTICAS do carro la da [[[ classe raiz CARRO]]]]
		//Inicializando todos os Atributos
		
		meuCarro.cor = "Vermelho";
		//pegando o Modelo
		meuCarro.modelo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		//Chamando os METODOS de ACAO
		//Metodos sao Acoes de um Objeto
		meuCarro.liga();
		meuCarro.acelera(20);
		//mostrando a VELOCIDADE Atual depois de ter Auterado
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
		


	}

}
