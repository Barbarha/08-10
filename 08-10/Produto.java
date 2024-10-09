package com.sesi._8._0.model;

public class Produto {
    private String nome;
    private int estoque;
    private float preco;
     
	public Produto(String nome, int estoque, float preco) {
		super();
		this.nome = nome;
		this.estoque = estoque;
		this.preco = preco;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
    
  
}