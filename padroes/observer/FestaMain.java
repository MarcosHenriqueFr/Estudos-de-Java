package padroes.observer;

public class FestaMain {

	public static void main(String[] args) {
		Namorada n = new Namorada();
		Porteiro p = new Porteiro();
		
		//Nesse caso dá para usar lambda, já que só possui um metodo
		p.registrarObserver(e -> System.out.println("Surpresa por lambda em "+ e.getMomento()));
		p.registrarObserver(n);
		
		//O monitoramento sempre fica ativo, o listener do meu evento
		p.run();
	}
}
