package com.vanessa.estruturadados.fila;

import com.vanessa.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{

	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		
		/*this.elementos[this.tamanho] = elemento;
		this.tamanho++;*/
		
		this.adiciona(elemento);
	}
	
	public T espiar() {
		if (this.estaVazia()) {
			return null;
		}
		
		return this.elementos[0];
	}
	
	public T desenfileirar() {
		
		final int POS = 0;
		
		if(this.estaVazia()) {
			return null;
		}
		
		T elementoASerRemovido = this.elementos[POS];
		
		/*for (int i=posicao; i<tamanho-1; i++){
			elementos[i] = elementos[i+1];
		}
		tamanho--;*/
		
		this.remove(POS);
				
		return elementoASerRemovido;
	}
}
