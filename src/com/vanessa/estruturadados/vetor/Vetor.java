package com.vanessa.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
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
	
	public boolean adiciona(String elemento){
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}	
	
	
	
	
	
	
	
}
