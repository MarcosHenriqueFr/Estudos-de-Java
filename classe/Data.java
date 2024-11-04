package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){//Parametros/valores padrões
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);//como método, chamando um outro construtor
	}
	
	Data(int dia, int mes, int ano){//Valores já setados na criação do objeto
		this.dia = dia;//dia objt = dia class
		this.mes = mes;//Referenciar objetos atuais
		this.ano = ano;
	}
	
	String obterDataFormatada(){
		String dataFormatada = String.format("Data: %d/%d/%d", this.dia, this.mes, this.ano);
		return dataFormatada;
	}
}
