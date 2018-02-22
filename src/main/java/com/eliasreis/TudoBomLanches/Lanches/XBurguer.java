package com.eliasreis.TudoBomLanches.Lanches;

import com.eliasreis.TudoBomLanches.ingredientes.Hamburguer;
import com.eliasreis.TudoBomLanches.ingredientes.Queijo;

public class XBurguer {
	public String nome = "XBurguer";
	Hamburguer hamburguer = new Hamburguer(1);
	Queijo queijo = new Queijo(1);
	
	public double getValorDoLanche() {
		return (hamburguer.getValorTotal()+queijo.getValorTotal());
	}
	public String getNome() {
		return nome;
	}
}
