package lambdas;

public class Threads {

	public static void main(String[] args) {
		
		//Thread -> processo executado "paralelamente"
		//Um mesmo processador escalonando entre threads -> Antigamente
		//Atualmente é possível porque um processador pode ter mais de um core
		
		//Criou uma interface anonima
		Runnable trabalho1 = new Trabalho1();
		Runnable trabalho2 = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Tarefa #02");
					try {
						Thread.sleep(100);//para por 0.1s
					} catch (Exception e) {
					}
				}
				
			}
		};
		
		//Da para usar lambdas mesmo se n for interface funcional, pois só tem um método
		//A partir do java8
		Runnable trabalho3 = Threads::trabalho3;
		
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	
	static void trabalho3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #03");
			
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				
			}
		}
	}
}
