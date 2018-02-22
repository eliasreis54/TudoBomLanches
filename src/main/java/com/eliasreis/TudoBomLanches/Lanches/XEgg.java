package com.eliasreis.TudoBomLanches.Lanches;

import com.eliasreis.TudoBomLanches.ingredientes.Hamburguer;
import com.eliasreis.TudoBomLanches.ingredientes.Ovo;
import com.eliasreis.TudoBomLanches.ingredientes.Queijo;

public class XEgg {
	public String nome = "XEgg";
	Ovo ovo = new Ovo(1);
	Hamburguer hamburguer = new Hamburguer(1);
	Queijo queijo = new Queijo(1);
	
	public double getValorDoLanche() {
		return (ovo.getValorTotal()+hamburguer.getValorTotal()+queijo.getValorTotal());
	}
	public String getNome() {
		return nome;
	}
}
