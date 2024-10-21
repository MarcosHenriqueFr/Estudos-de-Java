package fundamentos;

import java.text.DecimalFormat;

public class Temperatura {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");//nem tem no ex
		double fahrenheit, celsius;
		final double FATOR = 5.0/9.0;
		final int AJUSTE = 32;
		
		fahrenheit = 100;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(fahrenheit + " °F é " + df.format(celsius) + "°C");
	}
}
