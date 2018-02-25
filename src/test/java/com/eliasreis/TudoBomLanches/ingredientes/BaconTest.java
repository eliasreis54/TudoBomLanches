package com.eliasreis.TudoBomLanches.ingredientes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BaconTest {
	@Test
	public void testVerificaPrecosOriginal() throws Exception {
		Bacon bacon = new Bacon(1);
		assertEquals(2.00, bacon.getValorTotal(), 0.0);
	}
	
	@Test
	public void testVerificaPrecosAlterado() throws Exception {
		Bacon bacon = new Bacon(1);
		
		bacon.setValor(15.00);
		bacon.setQuantidade(1);
		assertEquals(15.00, bacon.getValorTotal(), 0.0);
	}
	
	@Test
	public void testVerificaPrecosQuantidade() throws Exception {
		Bacon bacon = new Bacon(2);
		assertEquals(4.00, bacon.getValorTotal(), 0.0);
	}
}
