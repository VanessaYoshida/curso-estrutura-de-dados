package com.vanessa.estruturadados.vetor.exercicios;

import com.vanessa.estruturadados.vetor.Lista;

public class Exercicio03 {

	public static void main(String[] args) {
		/* 
		 * Melhore a classe Lista e implemente o método remove (T elemento), 
		 * onde será possível remover um elemento da lista passando o mesmo como parâmetro.
		 */

		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("V");
		lista.adiciona("A");
		lista.adiciona("V");
		

		System.out.println(lista);
		
		lista.remove("A");
		
		System.out.println(lista);
	}

}
