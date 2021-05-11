package POO_17list;

import POO.Carro;

public class TestandoAviao {

	public static void main(String[] args) {
		
		
		
		//Instanciando o CARRO e criando um novo OBJETO=
				Aviao meuAviao = new Aviao();
				//Adicionando CARACTERISTICAS do aviao la da [[[ classe raiz Aviao]]]]
				//Inicializando todos os Atributos
				
				meuAviao.cor = "Vermelho";
				//pegando o Modelo
				meuAviao.modelo = "Passat";
				meuAviao.velocidadeAtual = 0;
				meuAviao.velocidadeMaxima = 80;
				
				//Chamando os METODOS de ACAO
				//Metodos sao Acoes de um Objeto
				meuAviao.voando();
				meuAviao.acelera(200);
				//mostrando a VELOCIDADE Atual depois de ter Auterado
				System.out.println(meuAviao.velocidadeAtual);
				meuAviao.pegaMarcha();
		

	}

}
