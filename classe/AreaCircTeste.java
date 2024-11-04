package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(2);
		AreaCirc a2 = new AreaCirc(1);
//		a1.PI = 10;//Possível modificar
//		AreaCirc.PI = 2; Não é possível
		
		System.out.println(AreaCirc.area(20));//Sem necessidade de criar um objeto
		System.out.println(Math.PI);
		System.out.println(a1.area());
		System.out.println(a2.area());
	}

}
