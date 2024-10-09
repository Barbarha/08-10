package com.sesi._8._0.model;

import java.time.LocalDate;

public class Pedido {
    private Produto produto;
    private int quantidade;
    private LocalDate data;
    private float valor;
    private StatusEnum status;
    
    
    
    
	public Pedido(Produto produto, int quantidade, LocalDate data, float valor, StatusEnum status) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.data = data;
		this.valor = valor;
		this.status = status;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public StatusEnum getStatus() {
		return status;
	}
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
    
    
    
}

