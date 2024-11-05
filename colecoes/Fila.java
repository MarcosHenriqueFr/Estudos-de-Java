package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		fila.add("Carlos");
		fila.offer("João");
		fila.offer("Guilherme");
		fila.offer("Vitor");
		fila.offer("Paula");
		
		//Mostram o elemento e não removem
//		System.out.println(fila.peek());
//		System.out.println(fila.element());
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
//		System.out.println(fila.remove());
	}

}
