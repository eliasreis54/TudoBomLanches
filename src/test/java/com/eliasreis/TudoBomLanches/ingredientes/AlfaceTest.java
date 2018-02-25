package com.eliasreis.TudoBomLanches.ingredientes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class AlfaceTest {
	
	private Alface alface;;
	
	@Test
	public void testVerificaPrecosOriginal() throws Exception {
		Alface alface1 = new Alface(1);
		assertEquals(0.40, alface1.getValorTotal(), 0.0);
	}
	
	@Test
	public void testVerificaPrecosAlterado() throws Exception {
		Alface alface2 = new Alface(1);
		
		alface2.setValor(5.00);
		alface2.setQuantidade(1);
		assertEquals(5.00, alface2.getValorTotal(), 0.0);
	}
	
	@Test
	public void testVerificaPrecosQuantidade() throws Exception {
		Alface alface3 = new Alface(2);
		assertEquals(0.80, alface3.getValorTotal(), 0.0);
	}
}