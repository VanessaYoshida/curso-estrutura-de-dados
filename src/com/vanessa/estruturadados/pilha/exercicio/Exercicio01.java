package com.vanessa.estruturadados.pilha.exercicio;

import java.util.Scanner;

import com.vanessa.estruturadados.pilha.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String linha;
		int numero;
		Integer desempilhado;

		Pilha<Integer> pilha = new Pilha<Integer>();

		for (int i=1; i<=10; i++) {
			System.out.println("Entre com um número: ");
			linha = scan.nextLine();
			numero = Integer.parseInt(linha); 

			if ((numero % 2) == 0) {
				System.out.println("Empilhando o número " + numero);
				pilha.empilha(numero);
			} else {

				desempilhado = pilha.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha está vazia");
				} else {
					System.out.println("Número ímpar, desempilhando um elemento da pilha: " 
							+ desempilhado);
				}
			}
		}

		System.out.println("Todos os números foram lidos, desempilhando números da pilha");
		
		while (!pilha.estaVazia()) {
			
			desempilhado = pilha.desempilha();
			
			if (desempilhado == null) {
				System.out.println("Pilha está vazia");
			} else {
				System.out.println("Desempilhando um elemento da pilha: " 
						+ desempilhado);
			}
		}
		
		System.out.println("Todos os elementos foram desempilhados");
	}
}