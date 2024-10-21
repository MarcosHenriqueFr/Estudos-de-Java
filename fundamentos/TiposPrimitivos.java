package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Usando todos os tipos primitivos
		
		byte anosDeEmpresa = 32;
		short voosAcumulados = 231;
		int id = 21_453;
		long pontosAcumulados = 3_432_752_721L;
		
		float salario = 8_912.21F;
		double vendasAcumuladas = 4_432_213_432.32;
		
		char ativo = 'A';
		boolean emFerias = false;
		
		//dias trabalhados
		System.out.println(anosDeEmpresa * 365);
		
		//quant de viagens
		System.out.println(voosAcumulados / 2);
		
		//pontos por venda
		System.out.println(id + " ganha " + pontosAcumulados/vendasAcumuladas + " pontos a cada venda!");
		
		//info salario 
		System.out.println(id + ": ganha -> "+ salario);
		
		System.out.println("Ativo? "+ativo);
		
		System.out.println("Em férias? "+emFerias);
	}
}
