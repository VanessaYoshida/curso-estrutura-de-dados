package com.vanessa.estruturadados.vetor.exercicios;

import com.vanessa.estruturadados.vetor.teste.Contato;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio07 extends Exercicio06 {

	public static void main(String[] args) {

		/* 
		 * Utilize a classe ArrayList e desenvolva os seguintes itens:
		 * 1 - Crie uma lista utilizando a classe ArrayList da API do Java;
		 * 2 - Passe todos os contatos do vetor para o Array List;
		 * 3 - Crie um exemplo para utilizar cada método da classe ArrayList (somente
		 *     os métodos que implementamos de forma similar na classe ArrayList)
		 */
		
		

		Scanner scan = new Scanner(System.in);

		ArrayList<Contato> lista = new ArrayList<Contato>(20);

		criarContatosDinamicamente(30, lista);

		int opcao = 1;
		
		while (opcao !=0) {
			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			
			case 1:
				adicionarContatoFinal(scan, lista);
				System.out.println("\n============\n");
				break;
				
			case 2:
				adicionarContatoPosicao(scan, lista);
				System.out.println("\n============\n");
				break;
				
			case 3:
				obtemContatoPosicao(scan, lista);
				System.out.println("\n============\n");
				break;
				
			case 4:
				obtemContato(scan, lista);
				System.out.println("\n============\n");
				break;
				
			case 5:
				pesquisarUltimoIndice(scan, lista);
				System.out.println("\n============\n");
				break;
				
			case 6:
				pesquisarContatoExiste(scan, lista);
				System.out.println("\n============\n");
				break;
				
			case 7:
				excluirPorPosicao(scan, lista);
				System.out.println("\n============\n");
				break;
				
			case 8:
				excluirContato(scan, lista);
				System.out.println("\n============\n");
				break;
				
			case 9:
				imprimeTamanhoVetor(lista);
				System.out.println("\n============\n");
				break;
				
			case 10:
				limparVetor(lista);
				System.out.println("\n============\n");
				break;
				
			case 11:
				imprimirVetor(lista);
				System.out.println("\n============\n");
				break;
				
			case 0:
				System.out.println("Usuário digitou 0, programa terminado");
				System.exit(0);
				break;
				
			default:
				System.out.println("Usuário digitou uma opção inválida");
				System.out.println("\n============\n");
				break;
			}
		}
	}
	
	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {
		
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacaoStr("Entre com o nome: ", scan);
		String telefone = leInformacaoStr("Entre com o telefone: ", scan);
		String email = leInformacaoStr("Entre com o e-mail: ", scan);

		Contato contato = new Contato(nome, telefone, email);

		lista.add(contato);

		System.out.println("Contato adicionado com sucesso.");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacaoStr("Entre com o nome: ", scan);
		String telefone = leInformacaoStr("Entre com o telefone: ", scan);
		String email = leInformacaoStr("Entre com o e-mail: ", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = leInformacaoInt("Entre com a posição a adicionar contato: ", scan);

		try {			

			lista.add(pos, contato);
			System.out.println("Contato adicionado com sucesso.");
			System.out.println(contato);

		} catch(Exception e) {
			System.out.println("Posição inválida, contato não adicionado");
		}
	}

	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

		} catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado...");
			pos = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição " + pos);

		} catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado...");
			pos = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posição " + pos);

		} catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.get(pos);


			boolean existe = lista.contains(contato);
			if (existe) {
				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);				
			} else {
				System.out.println("Contato não existe.");
			}
		} catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a posição a ser removida: ", scan);

		try {
			lista.remove(pos);

			System.out.println("Contato excluído");
		} catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a posição a ser removida: ", scan);

		try {
			Contato contato = lista.get(pos);

			lista.remove(contato);

			System.out.println("Contato excluído");
		} catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
		
		System.out.println("Tamanho do vetor é de: " + lista.size());
	}

	private static void limparVetor(ArrayList<Contato> lista) {
		
		lista.clear();
		System.out.println("Todos os contatos do vetor foram excluídos");
	}

	private static void imprimirVetor(ArrayList<Contato> lista) {
		
		System.out.println("Imprimindo todos os dados do vetor" + lista);
	}

	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

		Contato contato;

		for (int i=1; i<=quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("12345678" + i);
			contato.setEmail("contato"+i+"@email.com");

			lista.add(contato);
		}
	}

}
