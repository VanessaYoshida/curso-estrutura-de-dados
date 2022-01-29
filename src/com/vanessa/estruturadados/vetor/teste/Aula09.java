package com.vanessa.estruturadados.vetor.teste;

import com.vanessa.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		// Remover elemento do Vetor
		
		//Exemplo para remover uma posição específica
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("B");
		vetor.adiciona("V");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);

		//Exemplo para remover uma letra específica
		System.out.println("Remover o elemento E");
		int pos = vetor.busca("E");
		if (pos > -1) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento digitado não existe no vetor");
		}
		System.out.println(vetor);
	}

}
