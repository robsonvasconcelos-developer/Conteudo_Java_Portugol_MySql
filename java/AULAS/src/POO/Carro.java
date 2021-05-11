package POO;

public class Carro {

	//Atributos
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	
	//Metodo ESPECIFICO
	void liga()
	{
		System.out.println("O carro esta ligado ...");//indicar que o carro esta ligado!
	}
	
	//Segundo Metodo
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
		if(this.velocidadeAtual>=0 && this.velocidadeAtual<40)
		{
			return 1;
		}
		if(this.velocidadeAtual>=40 && this.velocidadeAtual<80)
		{
			return 2;
		}
		return 3;
		
		
		
		
		
	}
	
}
