package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNum {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

		double num2 = Double.parseDouble(valor2);
		double num1 = Double.parseDouble(valor1);
		//Só com wrapper, sem consertar erros >:)

		double soma = num1 + num2;

		System.out.println("A soma é " + soma);
		//System.out.printf("A média é %f", soma/2);
		System.out.println("A média é " + soma / 2);

	}

}
