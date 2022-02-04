package com.vanessa.estruturadados.pilha.exercicio;

public class Livro {

	private String nomeLivro;
	private String isbn;
	private String anoLancamento;
	private String autor;
	
	
	
	public Livro() {
		super();
	}
	
	public Livro(String nomeLivro, String isbn, String anoLancamento, String autor) {
		super();
		this.nomeLivro = nomeLivro;
		this.isbn = isbn;
		this.anoLancamento = anoLancamento;
		this.autor = autor;
	}
	
	
	
	@Override
	public String toString() {
		return "Livro [nomeLivro=" + nomeLivro + ", isbn=" + isbn + ", anoLancamento=" + anoLancamento + ", autor="
				+ autor + "]";
	}

	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}	
	
	
}
