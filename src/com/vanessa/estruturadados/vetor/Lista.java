package com.vanessa.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	
		private T[] elementos;
		private int tamanho;
		
		//solução mais elegante
		public Lista(int capacidade) {
			this.elementos = (T[]) new Object[capacidade]; //solução do livro Effective Java
			this.tamanho = 0;
		}
		
		//outra forma de fazer
		public Lista(int capacidade, Class<T> tipoClasse) {
			this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
			this.tamanho = 0;
		}
		
		public boolean adiciona(T elemento){
			
			this.aumentaCapacidade();
			
			if (this.tamanho < this.elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;
				return true;
			} 
			return false;
		}	
		
		// Add elemento em qualquer posição
		public boolean adiciona(int posicao, T elemento){
			
			if (!(posicao >= 0 && posicao < tamanho)) {
				throw new IllegalArgumentException("Posição inválida");
			}
			
			this.aumentaCapacidade();
			
			//mover todos os elementos
			for (int i=this.tamanho-1; i>=posicao; i--) {
				this.elementos[i+1] = this.elementos[i];
			}
			
			//atribuir o elemento na posição
			this.elementos[posicao] = elemento;
			this.tamanho++;

			return true;
		}	
		
		// Aumentar a capacidade do vetor, dobrando o valor do tamanho atual
		public void aumentaCapacidade() {
			if (this.tamanho == this.elementos.length) {
				T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
				for (int i=0; i<this.elementos.length; i++) {
					elementosNovos[i] = this.elementos[i];
				}
				this.elementos = elementosNovos;
			}
		}
		
		/* Obter elemento de uma determinada posição
		 * Se for uma posição que não existe, dispara um erro tratado
		 */
		public Object busca(int posicao) {
			if (!(posicao >= 0 && posicao < tamanho)) {
				throw new IllegalArgumentException("Posição inválida");
			}
			return this.elementos[posicao];
		}
		
		/* Verificar se elemento existe*/
		public int busca(T elemento){
			for (int i=0; i<this.tamanho; i++){
				if (this.elementos[i].equals(elemento)) {
					return i;
				}
			}
			return -1;
		}
		
		/* Melhoria da busca - exercicio 01 */
		public boolean contem(T elemento) {
			return  busca(elemento) > -1; // >=0
			
			/*int pos = busca(elemento);
			if (pos > -1){
				return true;
			}
			
			return false;*/
		}
		
		public int tamanho() {
			return this.tamanho;
		}
		
		/* Implemente o método ultimoIndice, 
		   semelhante ao método lastIndexOf da classe ArrayList */
		public int ultimoIndice(T elemento) {
			for (int i=this.tamanho-1; i>=0; i--) {
				if (this.elementos[i].equals(elemento)){
					return i;
				} // >=0
			}
			return -1;
		}

		
		/* Verificar tamanho e imprimir elementos do vetor
		 * Nesta classe fazemos a iteração dos dados do vetor, 
		 * e apresentamos na tela de acordo com o tamanho de dados preenchidos no vetor*/
		@Override
		public String toString() {
			
			StringBuilder s = new StringBuilder();
			s.append("[");
			
			for (int i=0; i<this.tamanho-1; i++){
				s.append(this.elementos[i]);
				s.append(", ");
			}
			
			if (this.tamanho>0) {
				s.append(this.elementos[this.tamanho-1]);
			}
			
			s.append("]");
			
			return s.toString();
		}
}
