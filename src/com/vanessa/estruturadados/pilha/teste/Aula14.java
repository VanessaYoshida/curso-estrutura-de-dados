package com.vanessa.estruturadados.pilha.teste;

import com.vanessa.estruturadados.pilha.Pilha;

public class Aula14 {

	public static void main(String[] args) {
		
		//Empilhar Elemento
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for (int i=1; i<=10; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}
}
