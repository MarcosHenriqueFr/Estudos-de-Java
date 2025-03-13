package lambdas;

public class Multiplicar implements Calculo{

	//uso de interface
	@Override
	public double executar(double a, double b) {
		return a*b;
	}
}
