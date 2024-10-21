package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um número: ");
		int num = Integer.parseInt(valor);
		
		if(num % 2 == 0) {//true
			System.out.println("Número par!");
		} else {//false
			System.out.println("Número ímpar!");
		}

	}

}
