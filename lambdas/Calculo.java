package lambdas;

@FunctionalInterface //Aplica validação, para que lambdas funcionem com base em interfaces
public interface Calculo {

	public abstract double executar(double a, double b);
	
	//Isso é possível porque é default e static
	public default double legal() {
		return executar(0, 0); //É possível acessar um abstract a partir de um default
	}
	
	static String muitoLegal() {
		return "legal";
	}
}
