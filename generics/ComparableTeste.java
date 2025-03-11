package generics;

import java.util.Set;
import java.util.TreeSet;

public class ComparableTeste {

	public static void main(String[] args) {
		Set<Integer> nums = new TreeSet<Integer>();
		
		//Consegue adicionar porque já tem um comparable
		//Estudar mais as collections
		nums.add(10);
		nums.add(4);
		nums.add(16);
		
		nums.stream().forEach(System.out::println);
	}

}
