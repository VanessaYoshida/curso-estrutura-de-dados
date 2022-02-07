package com.vanessa.estruturadados.pilha.exercicio;

import java.util.Stack;

public class Exercicio07 {

	public static void main(String[] args) {
		/* Usando a classe Pilha ou Stack, desenvolva um algoritmo
		que faça a conversão de números decimais para binários */

		imprimeResultado(2); //10
		imprimeResultado(4); //100
		imprimeResultado(10); //1010
		imprimeResultado(25); //11001
		imprimeResultado(10035); //10011100110011

		imprimeResultadoQualquerBase(25, 16); //19
		imprimeResultadoQualquerBase(10035, 8); //23463
		imprimeResultadoQualquerBase(10035, 16); //2733
		
	}
	
	public static void imprimeResultado(int numero) {
		System.out.println(numero + " em binario é: " + decimalBinario(numero));
	}
	
	public static void imprimeResultadoQualquerBase(int numero, int base) {
		System.out.println(numero + " na base " +base + " é: " + decimalQualquerBase(numero, base));
	}

	public static String decimalBinario(int numero) {
		
		Stack<Integer> pilha = new Stack<>();
		
		String numBinario = "";
		int resto;
		
		while (numero > 0) {
			resto = numero % 2;
			pilha.push(resto);
			numero /= 2; // numero = numero / 2
		}
		
		while (!pilha.isEmpty()) {
			numBinario += pilha.pop();
		}
		
		return numBinario;
	}
	
public static String decimalQualquerBase(int numero, int base) {
		
		if (base > 16) {
			throw new IllegalArgumentException();
		}
	
		Stack<Integer> pilha = new Stack<>();
		
		String numBase = "";
		int resto;
		String bases = "0123456789ABCDEF";
		
		while (numero > 0) {
			resto = numero % base;
			pilha.push(resto);
			numero /= base; // numero = numero / base
		}
		
		while (!pilha.isEmpty()) {
			numBase += bases.charAt(pilha.pop());
		}
		
		return numBase;
	}
}
