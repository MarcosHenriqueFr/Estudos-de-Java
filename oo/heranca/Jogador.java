package oo.heranca;

//Vários jogadores em um tabuleiro
class Jogador {

	//Temporariamente públicos
	public int vida = 100;
	protected int x;
	protected int y;
	
	//Não poderá ser executado pois está protected
	protected Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador oponente) {//Polimorfismo
		//Para descobrir a proximidade
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		//lado a lado
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean andar(Direcao direcao) {
//		if(direcao == Direcao.NORTE) {
//			y++;
//		}
		
		switch(direcao) {
			case NORTE: y--;
				break;
			case LESTE: x--;
				break;
			case SUL: y++;
				break;
			case OESTE: x++;
				break;
		}
		
		return true;//Não é uma verificação tão complexa
	}
}
