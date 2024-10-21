package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		//um switch menos usual, sem o break
		//switch recebe diretamente o valor
		
		String faixa = "marrom";
		
		switch (faixa.toLowerCase()) {//Switch funcionando em cascata
			case "preta":
				System.out.println("Sei o Bassai-Dai...");
			case "marrom":
				System.out.println("Sei o Tekki Shodan");
			case "roxa":
				System.out.println("Sei o Heian Godan");
			case "verde":
				System.out.println("Sei o Heian Yodan");
			case "laranja":
				System.out.println("Sei o Heian Sandan");
			case "vermelha":
				System.out.println("Sei o Heian Nidan");
			case "amarela":
				System.out.println("Sei o Heian Shodan");
				break;
			default:
				System.out.println("Não sei nada");
		}
	}

}
