package com.vanessa.estruturadados.pilha.exercicio;

import java.util.Scanner;

import com.vanessa.estruturadados.pilha.Pilha;

public class Exercicio05 {

	public static void main(String[] args) {

		/*Programa que testa uma se uma sequência de caracteres
	  é um palíndromo (palavra onde ela é simétrica)*/

		@SuppressWarnings("resource")
		var scan = new Scanner(System.in);
		String palavra;

		System.out.println("Digite a palavra para verificar se é um palíndromo: ");
		palavra = scan.nextLine();
		
		imprimeResultado(palavra);

	}
	
	
	public static void imprimeResultado(String palavra) {
		System.out.println("A palavra " + palavra + " é palíndromo? " + testaPalindromo(palavra));
	}

	public static boolean testaPalindromo(String palavra) {

		Pilha<Character> pilha = new Pilha<Character>();

		for (int i=0; i<palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}

		String palavraInversa = "";

		while (!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}

		if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}

		return false;
	}

}
