package com.vanessa.estruturadados.pilha.teste;

import com.vanessa.estruturadados.pilha.Pilha;

public class Aula15 {

	public static void main(String[] args) {

		//Verificar se a pilha está vazia
		
		Pilha<Integer> pilha = new Pilha<Integer>();

		System.out.println(pilha.estaVazia()); //true

		pilha.empilha(1);

		System.out.println(pilha.estaVazia());//false

	}

}
