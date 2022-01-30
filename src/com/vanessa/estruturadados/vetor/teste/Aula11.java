package com.vanessa.estruturadados.vetor.teste;

import com.vanessa.estruturadados.vetor.Lista;
public class Aula11 {

	public static void main(String[] args) {
		// Configurar tipo dinamicamente
		
		Lista<Contato> vetor = new Lista<Contato>(1);

		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "6543-5679", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "8678-5680", "contato3@email.com");

		vetor.adiciona(c1);
		
		//Elemento existe no vetor
		int pos = vetor.busca(c1);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		//Elemento não existe no vetor porque não adicionei
		pos = vetor.busca(c2);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		//Elemento não existe no vetor porque não adicionei
		pos = vetor.busca(c3);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
	}

}
