package POO_17list;

public class Aviao {

	
	//Atributos
		String cor;
		String modelo;
		double velocidadeAtual;
		double velocidadeMaxima;
		
		
		//Metodo ESPECIFICO
		void voando()
		{
			System.out.println("O aviao esta voando ...");//indicar que o carro esta ligado!
		}
		
		//Segundo Metodo
		//ENCAPSULAMENTO de Gets Sets, E possivel criar no Mouse:
		void acelera(double quantidade) //isto e um PARAMETRO dentro de METODO!!!
		{
			double velocidadeNova = this.velocidadeAtual+quantidade;
			this.velocidadeAtual = velocidadeNova;
			
		}
		int pegaMarcha()
		{
			if(this.velocidadeAtual<0)
			{
				return -1;
			}
			if(this.velocidadeAtual>=0 && this.velocidadeAtual<200)
			{
				return 1;
			}
			if(this.velocidadeAtual>=40 && this.velocidadeAtual<400)
			{
				return 2;
			}
			return 3;
	
		}
}
