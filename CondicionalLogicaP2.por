programa
{
	
	funcao inicio()
	{
	/*
	 * 2) 2) Elabore um sistema que leia as variáveis C e N, respectivamente código 
	 * e número de horas trabalhadas de um operário. E calcule o salário sabendo-se 
	 * que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule 
	 * o excesso de pagamento armazenando-o na variável E, caso contrário 
	 * zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
	 * 
	 * No final do processamento imprimir o salário total e o salário excedente.
	 */

	//variaveias
	inteiro C,N,E,salario,excedente

	//Entrada de Dados

	escreva("Digite o Codigo da Matricula: ")
	leia(C)

	escreva("Digite o Total de horas Trabalhadas: ")
	leia(N)

		se (N > 50){
		E = N - 50
		excedente = E * 20
		salario = 50 * 10
		escreva ( "Salario Total e Excedente: ", salario, E)
		}
		senao {
			E = 0
			salario = N * 10
			escreva ( "Total de Salario e Excedente: ", salario, E)
		}

			//FIM
		
	

	
	
	


	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 932; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */