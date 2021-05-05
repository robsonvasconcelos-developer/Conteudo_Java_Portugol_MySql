programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		/*
		 * 4)Crie um programa que receba valores do usuário 
		 * para preencher uma matriz 3X3, e em seguida, exiba 
		 * a soma dos valores dela e a soma dos valores da 
		 * primeira diagonal, ou seja, diagonal principal.
		 */

		 inteiro matriz[3][3]
		 inteiro total=0
		 inteiro diagonal = 0

		para (inteiro linha = 0; linha < 3; linha++){
			para (inteiro coluna = 0; coluna <3; coluna++){

				matriz[linha][coluna]=Util.sorteia(1,6)
				escreva(matriz[linha][coluna])
				escreva(" ")
				total = total + matriz[linha][coluna]
				
			}
			escreva("\n")
			
		}

		escreva("\nRESULTADOS")
		escreva("\nTotal da matriz: ", total, "\nE a diagonal é: ", diagonal)
		escreva("\n FIM DO PROGRAMA !!!!")
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 703; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */