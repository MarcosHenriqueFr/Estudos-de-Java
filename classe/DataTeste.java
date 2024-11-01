package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data data1 = new Data();
		Data data2 = new Data();
		
		data1.dia = 12;
		data1.mes = 6;
		data1.ano = 2003;
		
		data2.dia = 30;
		data2.mes = 10;
		data2.ano = 2024;
		
		System.out.printf("Data 1: %d/%d/%d\n", data1.dia, data1.mes, data1.ano);
		System.out.printf("Data 2: %d/%d/%d\n", data2.dia, data2.mes, data2.ano);
	}

}
