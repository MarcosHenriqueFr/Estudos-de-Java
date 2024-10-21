package fundamentos.exercicios;

public class Bhaskara {
	/*
	 * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) 
	 * utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. 
	 * Encontre o delta
	 * */

	public static void main(String[] args) {
		
		System.out.println("Fórmula usada: x^2 + 12x - 13");
		double a = 1, b = 12, c = -13;
		double delta, x1, x2;
		
		delta = Math.pow(b, 2) - (4 * a * c);
		x1 = (-b + Math.sqrt(delta)) / (2*a);
		x2 = (-b - Math.sqrt(delta)) / (2*a);
		
		System.out.printf("Os valores de x são: \nx1 = %.2f\nx2 = %.2f", x1, x2);
	}

}
