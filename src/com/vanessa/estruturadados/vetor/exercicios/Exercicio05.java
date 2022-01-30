package com.vanessa.estruturadados.vetor.exercicios;

import java.util.ArrayList;

import com.vanessa.estruturadados.vetor.Lista;

public class Exercicio05 {
	public static void main(String[] args) {
		/*
		 * Melhorar a classe Lista e implemente o método limpar,
		 * onde todos os elementos da lista são removidos.
		 * Esse método é semelhante ao método clear da classe ArrayList.
		 */
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("V");
		lista.adiciona("A");
		lista.adiciona("N");
		

		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);
		
		
		/*
		 * Se fosse via ArrayList seria assim:
		 */
		
		ArrayList<String> arrayList = new ArrayList<String>(5);
		
		arrayList.add("V");
		arrayList.add("A");
		arrayList.add("N");
		arrayList.add("E");
		arrayList.add("S");
		arrayList.add("S");
		arrayList.add("A");
		

		System.out.println(arrayList);
		
		arrayList.clear();
		
		System.out.println(arrayList);
	}
	
}
