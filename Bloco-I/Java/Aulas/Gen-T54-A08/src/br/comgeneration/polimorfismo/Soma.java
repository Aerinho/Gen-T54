package br.comgeneration.polimorfismo;

public class Soma extends OperacaoMatematica{
	
	@Override //--> sobrescrita de m�todo ---> polimorfismo
	public double calcular(double x, double y) {
		System.out.print("Soma: ");
		return x + y;
	}

}
