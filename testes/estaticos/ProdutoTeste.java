package testes.estaticos;

public class ProdutoTeste {

	public static void main(String... args) {
		@SuppressWarnings("unused")
		Produto p1 = new Produto();
		Produto.id = 3;
		System.out.println(Produto.id);
//		System.out.println(p1.id);
	}
}
