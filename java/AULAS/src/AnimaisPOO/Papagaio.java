package AnimaisPOO;

public class Papagaio extends Ave implements Pet{


 	@Override
 	public void voar() {
 		System.out.println("Voando....");
 	}

 	@Override
 	public void brincarSala() {
 		System.out.println("em cima do mesa, andando no chão, voando pela sala...tudo fechado..");

 	}

 	@Override
 	public void levarPassear() {
 		System.out.println("colocando na gaiola, andando na rua, colando a corrente e colocando no ombro..");

 	}
 }