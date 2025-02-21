package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		//Só possui o metodo respirar e mover
//		Animal a = new Cachorro();
		
		//Possui respirar, mover e mamar
		Mamifero a = new Cachorro();
		
		System.out.println(a.respirar());
		System.out.println(a.mover());
		System.out.println(a.mamar());
	}
}
