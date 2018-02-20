package com.eliasreis.TudoBomLanches.Lanches;

import com.eliasreis.TudoBomLanches.ingredientes.Bacon;
import com.eliasreis.TudoBomLanches.ingredientes.Hamburguer;
import com.eliasreis.TudoBomLanches.ingredientes.Ovo;
import com.eliasreis.TudoBomLanches.ingredientes.Queijo;

public class XEggBacon {
	Ovo ovo = new Ovo(1);
	Hamburguer hamburguer = new Hamburguer(1);
	Queijo queijo = new Queijo(1);
	Bacon bacon = new Bacon(1);
	
	public double getValorDoLanche() {
		return (ovo.getValorTotal()+hamburguer.getValorTotal()+queijo.getValorTotal()+bacon.getValorTotal());
	}
}
