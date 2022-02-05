package com.vanessa.estruturadados.fila.teste;

import com.vanessa.estruturadados.fila.Fila;

public class Aula21 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileira(3); //vai imprimir o primeiro iotem da fila
		fila.enfileira(1);
		fila.enfileira(2);
		
		System.out.println(fila.espiar());

	}

}
