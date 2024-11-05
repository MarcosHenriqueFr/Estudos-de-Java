package colecoes;

//ARRAY LIST -> Estrutura coordenada
import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> ListaUsuarios = new ArrayList<>();//Uma lista de objetos
		//List<Classe> nome = new ArrayList<ClasseImplicita>();
		
		//ORDEM DE INSERÇÃO MANTIDA
		Usuario u1 = new Usuario("Jorge");
		ListaUsuarios.add(u1);
		
		//Esse tipo de código só funciona corretamente com o hashcode e equals determinados
		//Já que eles não estão referenciados em uma var
		ListaUsuarios.add(new Usuario("Maria"));
		ListaUsuarios.add(new Usuario("Carlos"));
		ListaUsuarios.add(new Usuario("Mendes"));
		ListaUsuarios.add(new Usuario("Mendonça"));
		
		//Possível acessar por indice
		System.out.println(ListaUsuarios.get(2));//Pode ser executado diretamente com o toString
		
		ListaUsuarios.remove(2);
		
		System.out.println("Tem? "+ ListaUsuarios.contains(new Usuario("Jorge")));
		System.out.println("Tem? "+ ListaUsuarios.contains(new Usuario("Lia")));
		
		for(Usuario u: ListaUsuarios) {
			System.out.print(u.nome + " ");
		}
	}
}
