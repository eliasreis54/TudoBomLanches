package com.eliasreis.TudoBomLanches.Responses;

import java.util.ArrayList;
import java.util.List;

public class ResponseProdutos<T> {

	private ArrayList<T> produtos;
	private List<String> erros;
	
	public ResponseProdutos() {
		
	}
	public ArrayList<T> getJava() {
		return produtos;
	}
	public void setJava(ArrayList<T> java) {
		this.produtos = java;
	}
	public List<String> getErros() {
		if (this.erros == null) {
			this.erros = new ArrayList<String>();
		}
		return erros;
	}
	public void setErros(List<String> erros) {
		this.erros = erros;
	} 
	
	
}
