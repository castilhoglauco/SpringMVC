package org.casadocodigo2.loja.models;

public class Produto {
	
	private String nome;
	private String descricao;
	private int paginas;
	private int isbn;
	private String genero;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", paginas=" + paginas + ", isbn=" + isbn
				+ ", genero=" + genero + "]";
	}
	

}
