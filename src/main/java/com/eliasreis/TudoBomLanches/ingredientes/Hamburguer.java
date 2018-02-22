package com.eliasreis.TudoBomLanches.ingredientes;

public class Hamburguer {
	private static final String nome = "Hamburguer";
	private int quantidade;
	private double valor = 3.00;
	private double valorTotal;
	
	public Hamburguer(int Quantidade) {
		this.setQuantidade(Quantidade);
	}
	public int getQuantidade() {
		return quantidade;
	}
	public static String getNome() {
		return nome;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		this.valorTotal = (valor*quantidade);
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValorTotal() {
		return valorTotal;
	}
}