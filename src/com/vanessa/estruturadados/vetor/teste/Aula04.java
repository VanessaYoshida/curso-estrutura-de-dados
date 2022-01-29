package com.vanessa.estruturadados.vetor.teste;

import com.vanessa.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		
		/*Nesta aula 04 vamos apresentar apenas os dados do vetor que contém valores, não iremos apresentar o que estiver null)*/
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.tamanho());

		System.out.println(vetor.toString());
	}

	/* Resultado apresentado no console:
	   3
	   [elemento 1, elemento 2, elemento 3]
	 */
}
