package oo.composicao.celular;

public class CelularTeste {

	public static void main(String[] args) {
		Celular cel1 = new Celular("Modo G1000", "Modo", new Chip(), new Chip());
		
		for(Chip chip: cel1.chips) {
			System.out.println(chip.id);;
		}
		
		System.out.printf("O celular %s da marca %s possui dois chips,\n"
				+ "O primeiro com id: %s\n"
				+ "O segundo com id: %s", cel1.nome, cel1.marca, cel1.chips[0].id, cel1.chips[1].id);
	}
}
