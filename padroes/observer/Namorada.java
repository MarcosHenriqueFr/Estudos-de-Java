package padroes.observer;

//Crio uma interface e especifico dentro de outro metodo
public class Namorada implements ChegadaAniversarianteObserver{

	//Ações do usuário como um evento do sistema
	@Override
	public void chegou(ChegadaAniversarianteEvent evento) {
		System.out.println("Avisar convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar...");
		System.out.println("SURPRESA!!!");
	}
}
