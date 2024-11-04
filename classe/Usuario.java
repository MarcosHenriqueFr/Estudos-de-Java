package classe;

public class Usuario {

	String nome;
	String email;
	
	//Configuração do equals
	public boolean equals(Object objeto) {
		//Outro -> Usuário passado como parametro no equals
		//this -> Objeto no qual está sendo executado o método
		//Casting, convertendo a classe mãe para a classe de usuario
		if(objeto instanceof Usuario) {//Evita conversões de objetos impossíveis
			Usuario outro = (Usuario) objeto;
			
			//é uma boa prática utilizar o equals em partes do objeto
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;			
		} else {			
			return false;
		}
	}
	
	//Também é possível usar o hashcode e equals gerado pelo eclipse
	public int hashCode() {
		return 0;
	}
}
