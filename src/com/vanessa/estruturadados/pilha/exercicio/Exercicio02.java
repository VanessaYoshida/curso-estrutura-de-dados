package com.vanessa.estruturadados.pilha.exercicio;

import java.util.Scanner;

import com.vanessa.estruturadados.pilha.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String linha;
		int numero;

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();

		for (int i=1; i<=10; i++) {
			System.out.println("Entre com um número: ");
			linha = scan.nextLine();
			numero = Integer.parseInt(linha); 

			if ((numero % 2) == 0 && numero != 0) {
				System.out.println("Empilhando o número digitado na pilha de números pares: " + numero);
				par.empilha(numero);

			} else if (numero == 0){
				System.out.println("Desempilhando um elemento de cada pilha ");
				Integer desempilhaPar = par.desempilha();
				Integer desempilhaImpar =impar.desempilha();

				if (desempilhaPar == null) {
					System.out.println("Erro! Pilha Par está vazia");
				} else if (desempilhaImpar == null) {
					System.out.println("Erro! Pilha Impar está vazia");
				}

			} else {
				System.out.println("Empilhando o número digitado na pilha de números impares: " + numero);
				impar.empilha(numero);
			}

		}
		System.out.println("Todos os números foram lidos, desempilhando números da pilha");

		while (!par.estaVazia()) {
			System.out.println("Desempilhando a pilha par: " + par.desempilha());
		}
		
		while (!impar.estaVazia()) {
			System.out.println("Desempilhando a pilha impar: " + impar.desempilha());
		}
		
		System.out.println("Todos os elementos foram desempilhados");
	}

}


