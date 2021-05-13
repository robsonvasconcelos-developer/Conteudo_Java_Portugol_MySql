package POO_lista18_PolimorfismoE_heranca;

import POO_lista18_PolimorfismoE_heranca.Animal;
import POO_lista18_PolimorfismoE_heranca.Cachorro;
import POO_lista18_PolimorfismoE_heranca.Cavalo;

public class PetED {

	public static void main(String[] args) {


		Cachorro dog = new Cachorro("Djalma", 5);
		Cavalo panga = new Cavalo("Mito", 6);

		System.out.println(dog.getNome());
		System.out.println("idade do cavalo :"+panga.getIdade());

		dog.som();
		panga.som();


	}

}