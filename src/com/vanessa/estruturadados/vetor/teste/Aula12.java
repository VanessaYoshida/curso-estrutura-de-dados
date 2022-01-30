package com.vanessa.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		// API Java: ArrayList
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//Similar ao aciona que criamos na classe vetor
		arrayList.add("A");
		arrayList.add("C");
		System.out.println(arrayList);
		
		//similar ao Add elemento em qualquer posição
		arrayList.add(1, "B");
		System.out.println(arrayList);
		
		//Similar ao busca que criamos na classe vetor
		boolean existe = arrayList.contains("A");
		if (existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}
		
		//Similar ao busca que criamos na classe vetor retornando o índice
		int pos = arrayList.indexOf("B");
		if (pos > -1) {
			System.out.println("Elemento existe no array " + pos);
		} else {
			System.out.println("Elemento não existe no array " + pos);
		}
		
		//Similar ao busca por posição que criamos na classe vetor
		System.out.println(arrayList.get(2));
		
		//Similar ao remove que criamos na classe vetor
		arrayList.remove(0);
		arrayList.remove("B");
		System.out.println(arrayList);
		
		
		//Para descobrir o tamanho
		System.out.println(arrayList.size());
		
	}

}
