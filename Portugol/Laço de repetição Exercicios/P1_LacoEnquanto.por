programa
{
	
	funcao inicio()
	{
		/*
		 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
		 * e apresente no final o total do somatório, a média e o total de valores lidos. 
		 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo 
		 * valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor 
		 * negativo.
		 */

		inteiro valor
		inteiro totalSoma=0
		inteiro media
		inteiro totalLido

		escreva("Escreva até que valor deseja, efetuar a contagem: ")
		leia(valor)

		se (valor <= 0){
			escreva ("\nValor invalido na contagem!!!")
			
		enquanto (valor>0){
			escreva("\nA contagem até o numero digitado é :", valor)
			valor = valor - 1
			totalSoma = totalSoma + valor
			
			
			}
		
			}
		
			escreva ("\ntotal de soma: ", totalSoma)

			media = totalSoma / 2
			escreva("\nA media do total, considerando o valor digitado é de: ", media)

			
			
				



		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 959; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */