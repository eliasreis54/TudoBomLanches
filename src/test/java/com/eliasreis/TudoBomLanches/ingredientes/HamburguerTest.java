package com.eliasreis.TudoBomLanches.ingredientes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HamburguerTest {
	@Test
	public void testVerificaPrecosOriginal() throws Exception {
		Hamburguer hamburguer = new Hamburguer(1);
		assertEquals(3.00, hamburguer.getValorTotal(), 0.0);
	}
	
	@Test
	public void testVerificaPrecosAlterado() throws Exception {
		Hamburguer hamburguer = new Hamburguer(1);
		
		hamburguer.setValor(6.00);
		hamburguer.setQuantidade(1);
		assertEquals(6.00, hamburguer.getValorTotal(), 0.0);
	}
	
	@Test
	public void testVerificaPrecosQuantidade() throws Exception {
		Hamburguer hamburguer = new Hamburguer(2);
		assertEquals(6.00, hamburguer.getValorTotal(), 0.0);
	}
}
