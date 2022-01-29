package com.vanessa.estruturadados.vetor.teste;

import com.vanessa.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		// Obter elemento de uma determinada posição
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1"); //0
		vetor.adiciona("elemento 2"); //1
		vetor.adiciona("elemento 3"); //2

		System.out.println(vetor.busca(2));
	}

}
