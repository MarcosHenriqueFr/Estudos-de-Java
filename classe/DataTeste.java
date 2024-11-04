package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data data1 = new Data();
		Data data2 = new Data(30, 10, 2024);
		
		String dataFormat1 = data1.obterDataFormatada();
		String dataFormat2 = data2.obterDataFormatada();
		
		System.out.println(dataFormat1);
		System.out.println(dataFormat2);
	}

}
