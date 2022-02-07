package com.vanessa.estruturadados.pilha.exercicio;

import com.vanessa.estruturadados.pilha.Pilha;

public class Exercicio06 {

	public static void main(String[] args) {
		/* Verificar se uma expressão matemática 
		tem os parênteses agrupados de forma correta */
		/*imprimeResultado("A + B"); //true
		imprimeResultado("A + B + (C - D)"); //true
		imprimeResultado("{[()]}[](){()}"); //true
		imprimeResultado("{()]}[](){()}"); //false
		imprimeResultado("A + B + C -D)"); //false*/
		imprimeResultado("(}"); 
		
	}
	
	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " está balanceado? " +
				verificaSimbolosBalanceados(expressao));
	}
	
	final static String ABRE = "([{";
	final static String FECHA = ")]}";
	
	public static boolean verificaSimbolosBalanceados(String expressao) {
				
		Pilha<Character> pilha = new Pilha<Character>();
		int index = 0;
		char simbolo, topo;
		
		while (index < expressao.length()) {
			simbolo = expressao.charAt(index);
			
			if (ABRE.indexOf(simbolo) > -1) {
				pilha.empilha(simbolo);
			} else if (FECHA.indexOf(simbolo) > -1) {
				if (pilha.estaVazia()) {
					return false;
				} else {
					topo = pilha.desempilha();
					
					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
;				}
			}
			
			index++;
		}
		
		
		return true;
	}

}
