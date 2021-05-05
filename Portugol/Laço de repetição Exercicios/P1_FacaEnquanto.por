programa
{
	
	funcao inicio()
	{
	//DECLARANDO VARIAVEIS
		inteiro n = 0

	//Entrada de Dados na Variaveis
		escreva ("Informe um numero INTEIRO entre 233 a 456: ")
		leia(n)

	//Processamento do LOOP
		faca {
			se (n >=300 e n <=400){
				n = n + 5
				escreva ("\n",n)
			}
			se (n>=233 e n <300 ou n >400 e n < 456){
				n = n + 3
				escreva("\n",n)
			}
			
		}
				enquanto (n>=233 e n <456)
					se (n <233 ou n >456){
						escreva("Este numero nao atende a regra entre 233 a 456")
				}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */