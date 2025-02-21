package lambdas;

//Com lambdas não é necessário criar uma classe, mas a leitura fica confusa
public class Somar implements Calculo{

	@Override
	public double executar(double a, double b) {
		return a+b;
	}
}
