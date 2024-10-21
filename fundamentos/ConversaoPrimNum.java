package fundamentos;

public class ConversaoPrimNum {
//CAST
	public static void main(String[] args) {
		//int a = (byte) 127;//explicito e limita o valor literal
		
		double a = 3;//implicito
		int b = (int) a;
		byte c = (byte) b;
		
		//bem parecido com a noção de conjuntos
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
