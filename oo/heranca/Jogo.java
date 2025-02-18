package oo.heranca;

public class Jogo {
	//3° Quadrante do plano cartesiano

	public static void main(String[] args) {
		Heroi heroi = new Heroi(2, 10);
		Monstro monstro = new Monstro();
		//Generico -> Especifico
		monstro.x = 6;
		monstro.y = 7;
		
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.OESTE);
		heroi.andar(Direcao.OESTE);
		heroi.andar(Direcao.OESTE);
		
//		System.out.printf("A posição x do jogador é: %d\n", j1.x);
//		System.out.printf("A posição y do jogador é: %d", j1.y);
		System.out.printf("A vida do jogador 1 é: %d\n", heroi.vida);
		System.out.printf("A vida do jogador 2 é: %d\n", monstro.vida);
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		System.out.printf("A vida do %s é: %d\n", heroi.nome, heroi.vida);
		System.out.printf("A vida do %s é: %d\n", monstro.nome, monstro.vida);
	}

}
