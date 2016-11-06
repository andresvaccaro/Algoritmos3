package ar.com.fiuba.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharmanderTests {
	
	
	@Test
	public void test_charmanderSeCreaVivoYseVerificaSusPuntos(){
		
		Charmander charmander=new Charmander();
		
		assertEquals(170d,charmander.getPuntosDeVida(),0.000d);
		
	}
	
}
