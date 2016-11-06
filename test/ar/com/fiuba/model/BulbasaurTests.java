package ar.com.fiuba.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class BulbasaurTests {
	

	@Test
	public void test_bulbasaurSeCreaVivoYseVerificaSusPuntosDeVida(){
		
		Bulbasaur bulbasaur=new Bulbasaur();
			
		assertEquals(140d,bulbasaur.getPuntosDeVida(),0.000d);
		
	} 
	
	
	@Test
	public void test_bulbasarRecibeUnAtaqueConBrasasDeCharmander(){
		
		Charmander charmander=new Charmander();
		Bulbasaur bulbasaur=new Bulbasaur();
		
		Ataque brasas=new Brasas();
		
		bulbasaur.recibirAtaque(charmander, brasas);
		
		assertEquals(108d,bulbasaur.getPuntosDeVida(),0.000d);	 	
	
	}
	

}
