package oo.heranca.desafio;

//Não é uma classe abstrata
public class Ferrari extends Carro implements Esportivo, Luxo{
	
	//Dentro do método eu posso modificar a classe SUPER, mas fora não
	//Se eu colocar o mesmo nome em um atributo filho, ele só irá esconder e não sobrescrever
	
	//Começam falso como padrão
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(){
		this(230);
		this.nome = "Ferrari";
	}
	
	public Ferrari(int velocidadeFinal){
		super(velocidadeFinal);
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	//Dá para personalizar um método get da classe super
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 40;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr){
			return 20;
		} else {
			return 15;
		}
	}
	
	//Tem uma maior flexibilidade devido ao delta, ou seja, a variação de velocidade
}
