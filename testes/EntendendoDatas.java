package testes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EntendendoDatas {
	//LocalDate, LocalTime, LocalDateTime, UTC timestamp
	public static void main(String[] args) {
		LocalDate data = LocalDate.now();
		LocalTime tempo = LocalTime.now();
		System.out.println(data.getYear());
		System.out.println(data);
		System.out.println(tempo);
		
		//soma -> momento de criação mais o valor a se adicionar
		final LocalTime MOMENTO_CRIADO =  LocalTime.of(12, 5, 00);
		final int valorAdicionado = 6;
		final int soma = MOMENTO_CRIADO.getMinute() + valorAdicionado;
		
		int delta = soma - LocalTime.now().getMinute();
		
		if(delta < 0) {
			System.out.println("O tempo da tarefa acabou!");
		} else {
			System.out.println("A tarefa continua viva!");
		}
		
		System.out.println("A tarefa tem "+delta+" minutos sobrando");
		
		LocalDateTime dataTempo = LocalDateTime.now();
		DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dataFormatada = dataTempo.format(formatado);
		
		System.out.println(dataFormatada);
		
		
		
	}
}
