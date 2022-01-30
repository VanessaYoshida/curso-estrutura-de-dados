package com.vanessa.estruturadados.vetor.exercicios;

import java.util.ArrayList;

import com.vanessa.estruturadados.vetor.Lista;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Melhore a classe Lista e implemente o método ultimoIndice, 
		   semelhante ao método lastIndexOf da classe ArrayList */
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("V");
		lista.adiciona("A");
		lista.adiciona("V");
		
		System.out.println(lista.ultimoIndice("a")); // -1 => Não existe
		System.out.println(lista.ultimoIndice("V")); //  2 => existe no índice 2
		
		
		//Se fosse usar o método IndexOf
		ArrayList<String> arrayList = new ArrayList<String>(5);
		
		arrayList.add("V");
		arrayList.add("A");
		arrayList.add("V");
		
		System.out.println(arrayList.lastIndexOf("V")); 
	}

}
