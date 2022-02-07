package com.vanessa.estruturadados.vetor.exercicios;

import com.vanessa.estruturadados.vetor.Lista;

public class Exercicio01 {

	public static void main(String[] args) {
		/* Melhorar a classe Lista e implementar o método contém
		   semelhante ao método contains da classe ArrayList */
		

		Lista<String> lista = new Lista<String>(5);
			
			lista.adiciona("V");
			lista.adiciona("A");
			lista.adiciona("N");
			
			System.out.println(lista.contem("A")); //true
			System.out.println(lista.contem("E")); //false
				
	}

}
