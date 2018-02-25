package com.eliasreis.TudoBomLanches.ingredientes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueijoTest {
	@Test
	public void testVerificaPrecosOriginal() throws Exception {
		Queijo queijo = new Queijo(1);
		assertEquals(1.50, queijo.getValorTotal(), 0.0);
	}
	
	@Test
	public void testVerificaPrecosAlterado() throws Exception {
		Queijo queijo = new Queijo(1);
		
		queijo.setValor(4.75);
		queijo.setQuantidade(1);
		assertEquals(4.75, queijo.getValorTotal(), 0.0);
	}
	
	@Test
	public void testVerificaPrecosQuantidade() throws Exception {
		Queijo queijo = new Queijo(2);
		assertEquals(3.00, queijo.getValorTotal(), 0.0);
	}
}
