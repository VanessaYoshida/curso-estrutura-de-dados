package com.vanessa.estruturadados.pilha.teste;

import com.vanessa.estruturadados.pilha.Pilha;
import java.util.Stack;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();

		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(1);//Empilhar
		stack.push(2);//Empilhar
		stack.push(3);//Empilhar
		
		System.out.println(stack.isEmpty());//Verificar se está vazio
		System.out.println(stack.size());//Verificar tamanho
		System.out.println(stack);//Ver a pilha
		
		System.out.println(stack.peek());//Espiar (mostra o que está no topo, no caso vai aparecer 3)
		
		System.out.println(stack.pop());//Remover elemento
		
		System.out.println(stack);//Ver a pilha
		}

}
