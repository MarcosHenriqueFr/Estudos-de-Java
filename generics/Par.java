package generics;

import java.util.Objects;

public class Par <K, V>{

	private K chave;
	private V valor;
	
	public Par(){
		
	}
	
	public Par(K chave, V valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}

	public K getChave() {
		return chave;
	}
	public void setChave(K chave) {
		this.chave = chave;
	}
	public V getValor() {
		return valor;
	}
	public void setValor(V valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par<?, ?> other = (Par<?, ?>) obj;
		return Objects.equals(chave, other.chave);
	}
	
	//metodo de comparação natural de uma classe
	//é bom que essa ordem natural seja consistente com o equals
//	@Override
//	public int compareTo(Par<K, V> o) {
//		//Trabalhando com numeros
//		if() {			
//			return -1;
//		} else if(this.chave < o.chave) {			
//			return 1;
//		} else {			
//			return 0;
//		}
//	}
}
