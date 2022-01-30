package com.vanessa.estruturadados.vetor.exercicios;

import com.vanessa.estruturadados.vetor.VetorObjetos;
import com.vanessa.estruturadados.vetor.teste.Contato;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 *  Utilizar a classe Lista ou Vetor e classe Contato e devolva os seguintes itens:
		 *  1 - Crie um vetor com capacidade para 20 contatos;
		 *  2 - Insira 30 contatos no vetor
		 *  Crie um exemplo para utilizar cada método da classe Lista;
		*/

		VetorObjetos vetor = new VetorObjetos(20);
		
		int tamanhoVetor = 30;
		
//		if(int i=0; i<=tamanhoVetor; i++) {
//			vetor.adiciona(Contato c[i] = new Contato("contato"+[i], "1234-5678", "contato1@email.com");)
//		}
		
		Contato c1 = new Contato("Vanessa", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Christian", "6543-5679", "contato2@email.com");
		Contato c3 = new Contato("Luffy", "8678-5680", "contato3@email.com");
		Contato c4 = new Contato("Gon", "1234-5678", "contato1@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
	}

}
