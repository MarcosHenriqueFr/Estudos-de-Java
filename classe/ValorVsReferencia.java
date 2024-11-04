package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		double a = 2, b = a;
		
		a++;
		b--;
		
		System.out.printf("%f %f", a, b);
		
		Data d1 = new Data();
		Data d2 = d1;//atribuição por referência
		
		d1.dia = 20;
		d2.mes = 2;
		System.out.println("\n"+d1.obterDataFormatada()+"\n"+d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d2);
		System.out.println("\n"+d1.obterDataFormatada()+"\n"+d2.obterDataFormatada());
		
		//Se passar um objeto como parametro será uma referencia
		int c = 13;
		alterarPrimitivo(c);//Não altera o valor, já que não é por referencia
		System.out.println(c);
	}

	static void voltarDataParaValorPadrao(Data d){//Recebe a referencia, alterando todo o objeto, mesmo sem retorno
		//static acessa static
		d.dia = 1;//Evitar mexer em valores de parametros de objetos
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
