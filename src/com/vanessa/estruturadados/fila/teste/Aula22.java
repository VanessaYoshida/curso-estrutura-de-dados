package com.vanessa.estruturadados.fila.teste;

import com.vanessa.estruturadados.fila.Fila;

public class Aula22 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<>();

		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);

		System.out.println(fila); //[1, 2, 3]

		System.out.println(fila.desenfileirar()); //1

		System.out.println(fila); //[2, 3]

		System.out.println(fila.desenfileirar()); //2

		System.out.println(fila); //[3]

		System.out.println(fila.desenfileirar()); //3

		System.out.println(fila);//[]
	}

}
