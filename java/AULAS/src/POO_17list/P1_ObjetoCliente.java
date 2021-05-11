package POO_17list;

import java.util.Scanner;

import POO.Carro;

public class P1_ObjetoCliente {

	public static void main(String[] args)
	{
		
		
		//teste usuario
		//teste programador para programador
		Scanner leia = new Scanner(System.in);
		
		//Instanciando o CARRO e criando um novo OBJETO=
		P1_class_cliente meuCliente = new P1_class_cliente();//Instanciou o OBjeto "meuCliente""
		P1_class_cliente meuCliente2 = new P1_class_cliente();
		//Adicionando CARACTERISTICAS do carro la da [[[ classe raiz CARRO]]]]
		//Inicializando todos os Atributos
		
		
		//pegando o Modelo
		meuCliente.nome = "Bia";
		meuCliente.anoNascimento = 1992;
		
		
		meuCliente.codigoCliente = 1230;
		meuCliente.cpf = "000.000.000-00";

		
		// Imprimir direto, teste de PROGRAMADOR
		
		
		meuCliente.mostrarIdade();
		
		//Chamando os METODOS de ACAO
		//Metodos sao Acoes de um Objeto
		//meuCliente.anoDaCompra
		
		//mostrando a VELOCIDADE Atual depois de ter Auterado
		System.out.println();
		
		
	}

}
