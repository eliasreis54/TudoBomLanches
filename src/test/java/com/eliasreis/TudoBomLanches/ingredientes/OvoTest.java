package com.eliasreis.TudoBomLanches.ingredientes;

public class OvoTest {
	private static final String nome = "Ovo";
	private int quantidade;
	private double valor = 0.80;
	private double valorTotal;
	
	public OvoTest(int Quantidade) {
		this.setQuantidade(Quantidade);
	}
	public static String getNome() {
		return nome;
	}
	public int getQuantidade() {
		return quantidade;
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
