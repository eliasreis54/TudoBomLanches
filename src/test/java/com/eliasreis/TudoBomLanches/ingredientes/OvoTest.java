package com.eliasreis.TudoBomLanches.ingredientes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OvoTest {
	@Test
	public void testVerificaPrecosOriginal() throws Exception {
		Ovo ovo = new Ovo(1);
		assertEquals(0.80, ovo.getValorTotal(), 0.0);
	}
	
	@Test
	public void testVerificaPrecosAlterado() throws Exception {
		Ovo ovo = new Ovo(1);
		
		ovo.setValor(6.50);
		ovo.setQuantidade(1);
		assertEquals(6.50, ovo.getValorTotal(), 0.0);
	}
	
	@Test
	public void testVerificaPrecosQuantidade() throws Exception {
		Ovo ovo = new Ovo(2);
		assertEquals(1.60, ovo.getValorTotal(), 0.0);
	}
}
