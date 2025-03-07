package todoList.programa.tl.estudos;

import java.util.Date;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Datas {

	public static void main(String[] args) {
		
		//Pega o tempo atual
		Date data = new Date();
		//Faço isso antes de abrir o arquivo para verificar quais tarefas apagar e oq modificar
		long tempoCriacao = data.getTime() / 60000;
		long tempoUsuario = 30;
		
		//Uma soma
		long tempoDeVida = (tempoCriacao + tempoUsuario);
		
		UnaryOperator<Long> calcularTempo = (tempoVida) -> {
			return (data.getTime() / 60000) - tempoDeVida;
		};
		
		Predicate<Long> isVivo = valor -> valor < 0 ? true : false;
		
		System.out.println(calcularTempo.apply(tempoDeVida));
		System.out.println(isVivo.test(calcularTempo.apply(tempoDeVida)));
	}

}
