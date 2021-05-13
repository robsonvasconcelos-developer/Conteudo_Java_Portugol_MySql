package POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) 
	{
		//Chamando a LISTA 1 collection!!
		Collection<String> nomes = new ArrayList();
		//Adicionando Collection Manualmente, add como programador
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafaela");
		
		//criando FOR para percorrer os elementos
		for(String name : nomes) {
			System.out.println("Lista de nomes: "+ name); //no FOR imprime 4 vezes cada nome
		}
		
		
		//Criando uma SEGUNDA LISTA(MANUAL) d tipo Collection
		Collection<String> nomes2 = Arrays.asList("Joao", "Joana");
		//mostrando todos os nomes da lista 2
		nomes.addAll(nomes2);
		System.out.println("Lista de nomes: "+ nomes);
		
		//como pesquisar PESSOA especifica na LISTA acima:
		
		System.out.println("Contem o nome Maria? "+nomes.contains("Maria"));
		
		// IF para ANTI campos VAZIOS
		if(nomes.isEmpty()) {
			System.out.println("Lista Vazia...");
		}else {
			// IMPRIMINDO na tela a Lista de nome!!
			System.out.println("Lista de nomes: "+ nomes);
			
		}
		
		
		
		
	}

}
