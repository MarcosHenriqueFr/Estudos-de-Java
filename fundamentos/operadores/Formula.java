package fundamentos.operadores;

public class Formula {
	
	  public static void main(String[] args) {
		    
		    double expComp, parteSup, exp1, exp1Cima, exp1Baixo, exp2, exp2Cima, exp2Baixo, parteInf;
		    
		    exp1Cima = Math.pow((3+2)*6, 2);
		    exp1Baixo = 3*2;
		    
		    exp1 = exp1Cima/exp1Baixo;
		    
		    exp2Cima = (1-5)*(2-7);
		    exp2Baixo = 2;
		    
		    exp2 = Math.pow(exp2Cima/exp2Baixo, 2);
		    
		    parteSup = Math.pow(exp1-exp2, 3);
		    parteInf = Math.pow(10, 3);
		    
		    expComp = parteSup/parteInf;
		    
		    System.out.println(expComp);
		  
		  }

}
