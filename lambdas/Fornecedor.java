package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		//Não tem composição, porque não faz sentido
		Supplier< List<String> > umLista = 
				//Tem que usar os parenteses
					() -> Arrays.asList("Bia", "Lia", "Gui", "Mia");
					
		System.out.println(umLista.get());
	}
}
