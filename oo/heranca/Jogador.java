package oo.heranca;

public class Jogador {//Vários jogadores em um tabuleiro

	int vida = 100;
	int x;
	int y;
	
	boolean atacar(Jogador oponente) {//Polimorfismo
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
	
	boolean andar(Direcao direcao) {
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
