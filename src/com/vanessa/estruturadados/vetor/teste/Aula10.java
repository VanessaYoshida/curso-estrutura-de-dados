package com.vanessa.estruturadados.vetor.teste;

import com.vanessa.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		// Generalizar o tipo do vetor
		//Fizemos o vetor de tipo Objeto
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "6543-5679", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "8678-5680", "contato3@email.com");
		Contato c4 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
	}

}
