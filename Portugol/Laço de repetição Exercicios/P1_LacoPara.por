programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//Variais
		const inteiro habitantes = 20
		real salario = 0.00
		inteiro filhos = 0
		real mediaSalarial = 0.00
		real totalSalario = 0.00
		real mediaFilhos = 0.00
		real totalFilhos = 0.00
		real maiorSalario = 0.00
		real percentualSalarioAte100 = 0.00
		real contadorSalarioAte100 = 0.00

		
		
		//Entradas
		para (inteiro indice = 1; indice<=habitantes; indice++){
			escreva("Digite o salario do habitante ",indice," : R$ ")
			leia(salario)
			escreva("Digite o numero de filhos: ")
			leia(filhos)
			totalSalario = totalSalario + salario //Totalizando o salario
			totalFilhos = totalFilhos + salario
			se (salario > maiorSalario){
				maiorSalario = salario
			}

			se (salario <=100){
				contadorSalarioAte100++
			}
		}
		
		
		//processos
		mediaSalarial = mat.arredondar((totalSalario  / habitantes),2)
		mediaFilhos = mat.arredondar((totalFilhos  / habitantes),2)
		percentualSalarioAte100 = mat.arredondar((contadorSalarioAte100 / habitantes),2)
		
		//saidas

		
		
		
		escreva ("\nMedia Salarios :R$ ",totalSalario)
		escreva ("\nMedia Salarial :R$ ",mediaSalarial)
		escreva ("\nMaior Salario :R$ ",maiorSalario)
		escreva ("\nTotal de filhos :R$ ",totalFilhos)
		escreva ("\nMedia de Filhos :R$ ",mediaFilhos)
		escreva ("\nPercentual de pessoas com salario ate 100 : ",contadorSalarioAte100," % ")
		escreva ("\nFim do Programa")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */