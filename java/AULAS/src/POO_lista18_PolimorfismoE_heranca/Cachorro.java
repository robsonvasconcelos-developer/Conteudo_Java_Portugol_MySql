package POO_lista18_PolimorfismoE_heranca;

public class Cachorro extends Animal {

 	public Cachorro(String nome, int idade) {
 		super(nome, idade);
 		// TODO Auto-generated constructor stub
 	}

 	@Override
 	public void som() {
 		System.out.println("au au au");

 	}




 }