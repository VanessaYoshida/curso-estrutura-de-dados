package com.vanessa.estruturadados.vetor.exercicios;

import com.vanessa.estruturadados.vetor.Lista;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Melhorar a classe Lista e implementar o método obtem(int posicao),
		 * onde será possível obter o elemento dada uma posição do vetor.
		 * Esse método é semelhante ao método get(int posicao) da classe ArrayList.
		 */
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("V");
		lista.adiciona("A");
		lista.adiciona("V");
		

		System.out.println(lista);
		
		String dado = lista.obtem(1);
		
		System.out.println(dado); //retorna A
	}

}
