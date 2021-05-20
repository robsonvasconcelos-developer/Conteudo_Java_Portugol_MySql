package AnimaisPOO;

public class Urubu extends Ave implements Civilizado {


 	public Urubu(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
 	public void voar() {
 		System.out.println("cortando as pernas, não deixo voar...");

 	}

 	@Override
 	public void levarVeterinario() {
 		System.out.println("Levando meu flamenguista pra toma o leitinho, come uma podridão e remedio");

 	}

 	@Override
 	public void treinar() {
 		// TODO Auto-generated method stub

 	}

 }