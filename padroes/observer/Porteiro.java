package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//Simula como um processo
public class Porteiro extends Thread{

	//Adicionados na minha execução
	private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();
	
	public void registrarObserver(ChegadaAniversarianteObserver o) {
		observers.add(o);
	}
	
	//Toda essa etapa acontece dentro do framework
	@Override
	public void run() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Aniversariante chegou?");
			valor = entrada.nextLine();
			
			if(valor.equalsIgnoreCase("sim")) {
				observers.stream().forEach(x -> {
					//Será notificado agora
					x.chegou(new ChegadaAniversarianteEvent(new Date()));
				});
				valor = "sair";
			} else {
				System.out.println("Alarme falso");
			}
		}
		
		entrada.close();
	}
}
