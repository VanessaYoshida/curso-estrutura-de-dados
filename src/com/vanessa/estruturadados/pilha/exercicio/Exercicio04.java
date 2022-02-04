package com.vanessa.estruturadados.pilha.exercicio;

import java.util.Stack;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Stack<Livro> pilha = new Stack<Livro>();

		Livro livro1 = new Livro();
		livro1.setNomeLivro("Estruturas de Dados e Algoritmos com JavaScript");
		livro1.setAutor("Loiane Groner");
		livro1.setIsbn("8575226932");
		livro1.setAnoLancamento("2019");

		Livro livro2 = new Livro();
		livro2.setNomeLivro("Java para Iniciantes: Crie, Compile e Execute Programas Java Rapidamente");
		livro2.setAutor("Herbert Schildt");
		livro2.setIsbn("8582603363");
		livro2.setAnoLancamento("2015");

		Livro livro3 = new Livro();
		livro3.setNomeLivro("Java: como programar");
		livro3.setAutor("Paul Deitel e Harvey Deitel");
		livro3.setIsbn("B01IPIN4WO");
		livro3.setAnoLancamento("2016");

		Livro livro4 = new Livro();
		livro4.setNomeLivro("Java: The Complete Reference, Eleventh Edition");
		livro4.setAutor("Herbert Schildt");
		livro4.setIsbn("978-1260440232");
		livro4.setAnoLancamento("2018");

		Livro livro5 = new Livro();
		livro5.setNomeLivro("Use a cabeça!: Java");
		livro5.setAutor("Bert Bates e Kathy Sierra");
		livro5.setIsbn("8576081733");
		livro5.setAnoLancamento("2007");

		Livro livro6 = new Livro();
		livro6.setNomeLivro("Effective Java");
		livro6.setAutor("loch Joshua");
		livro6.setIsbn("B078H61SCH");
		livro6.setAnoLancamento("2017");

		System.out.println("Pilha de livros criada, pilha está vazia?" + pilha.isEmpty());

		System.out.println("Empilhando livros na pilha...");

		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		pilha.push(livro6);

		System.out.println(pilha.size() + " livros foram empilhados.");
		System.out.println(pilha);

		System.out.println("Pilha de livros criada, pilha está vazia?" + pilha.isEmpty());

		System.out.println("Espiando o topo da pilha: " + pilha.peek());

		System.out.println("Desempilhando livros da pilha: ");

		while (!pilha.isEmpty()) {
			System.out.println("Desempilhando livro: " + pilha.pop());
		}

		System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.isEmpty());


	}

}
