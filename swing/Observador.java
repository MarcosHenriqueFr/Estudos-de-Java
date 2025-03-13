package swing;

import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Observador");
		
		//Fechar, mata a aplicação
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); //Centraliza no pc
		
		//Lembra muito manipulação com DOM
		JButton botao = new JButton("Clicar");
		janela.add(botao);
		
//		botao.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Evento ocorreu!!!");
//			}
//		});
		
		//Você geralmente quer registrar que esse evento aconteceu
		botao.addActionListener(evento -> {
			System.out.println("Evento lambda ocorreu! Quando: " + evento.getActionCommand());
		});
		
		janela.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		janela.setVisible(true);
	}
}
