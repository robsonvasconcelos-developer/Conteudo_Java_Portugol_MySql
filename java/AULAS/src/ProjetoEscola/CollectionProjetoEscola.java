package ProjetoEscola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class CollectionProjetoEscola {
	public static void main(String[] args) {
		
		
		
		Scanner leia = new Scanner(System.in);
		
		//Chamando a LISTA 1 collection!!
		Collection<String> nomes = new ArrayList();
		//Adicionando Collection Manualmente, add como programador
		nomes.add("Leticia");
		nomes.add("Neymar");
		nomes.add("Jack");
		nomes.add("Steve Jobs");
		nomes.add("Bill Gates");
		nomes.add("Bia");
		nomes.add("Ednilson");
		nomes.add("Vagner");
		nomes.add("Ana");
		nomes.add("Lloris");
		nomes.add("James");
		nomes.add("Juliete");
		nomes.add("Hernanes");
		nomes.add("Cristiano Ronald");
		nomes.add("Marwa");
		nomes.add("Pogba");
		nomes.add("Bruno Fernandes");
		nomes.add("Rashford");
		nomes.add("Larissa Manoela");
		nomes.add("Billie Eilish");
		nomes.add("Dean");
		nomes.add("Sam");
		nomes.add("Johnnie Walker");
		nomes.add("Jack Daniels");
		nomes.add("Rogerio Ceni");
		
		System.out.println("Lista de todis ALUNIS matriculados na Escola: \n"); 
		
		//criando FOR EACH para percorrer os elementos
		for(String name : nomes) {
			System.out.println(name); 
			
		}
		
		


		
		
		
	}
}
