package com.vanessa.estruturadados.pilha.teste;

import com.vanessa.estruturadados.pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {
		
		/*
		 * Espiar/Verificar elemento do topo (peek)
		 * Verificar o que está no topo da pilha
		 */
		
		Pilha<Integer> pilha = new Pilha<Integer>();

		System.out.println(pilha.topo()); //null

		System.out.println(pilha); //[]

		pilha.empilha(1);
		pilha.empilha(2);

		System.out.println(pilha.topo()); //2

		System.out.println(pilha);//[1, 2]
	}

}
