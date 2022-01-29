package com.vanessa.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/* Adicionar elemento no final do vetor */
	
	/* Opção 1 (não é uma boa opção, pois exige muito processamento ficar verificando toda vez se está nula ou não)
	   public void adiciona(String elemento) {
		for (int i=0; i<this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	/* Opção 2
	   public void adiciona(String elemento) throws Exception{
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
		}
	}*/
	
	
	// Opção 3
	public boolean adiciona(String elemento){
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}	
	
	/* Obter elemento de uma determinada posição
	 * Se for uma posição que não existe, dispara um erro tratado
	 */
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	
	/* Verificar tamanho e imprimir elementos do vetor
	 * Nesta classe fazemos a iteração dos dados do vetor, 
	 * e apresentamos na tela de acordo com o tamanho de dados preenchidos no vetor*/
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
}
