package POO;

import java.util.HashSet;
import java.util.Set;

public class Colecoes_ListaAluno {
	
	//DOCUMENTAR ???????
	
	public static void main(String args[])
	{
		Set<Colecoes_Aluno> conjunto = new HashSet<Colecoes_Aluno>();
		Colecoes_Aluno a= new Colecoes_Aluno("Cristiano Ronaldo", "JAVA", 6.8);
		Colecoes_Aluno b= new Colecoes_Aluno("Bianca", "Macintosh", 7.8);
		Colecoes_Aluno c= new Colecoes_Aluno("Leticia", "Linux", 8.8);
		Colecoes_Aluno d= new Colecoes_Aluno("Mary", "Python", 5.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
		
		
		
		
		
		
		
		
	}

}
