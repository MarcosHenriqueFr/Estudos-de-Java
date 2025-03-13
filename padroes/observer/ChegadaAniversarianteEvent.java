package padroes.observer;

import java.util.Date;

public class ChegadaAniversarianteEvent {

	//O que foi feito pelo usuario
	private final Date momento;
	
	ChegadaAniversarianteEvent(Date momento){
		this.momento = momento;
	}
	
	public Date getMomento() {
		return this.momento;
	}
}
