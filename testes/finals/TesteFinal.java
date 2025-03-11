package testes.finals;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import testes.estaticos.Produto;

public class TesteFinal {

	public static void main(String args[]) {
		@SuppressWarnings("unused")
		final Produto p1 = new Produto();
//		p1 = new Produto(); Não posso mudar o endereço, os valores especificos eu defino na classe
		
		@SuppressWarnings("unused")
		final List<Integer> nums = new ArrayList<Integer>();
//		nums = Arrays.asList(2, 4, 5); Estou criando nova array
//		Integer[] numsA = (Integer[]) nums.toArray();
	}
}
