package ar.com.fiuba.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TipoDeAlgomonTests {
	
	
	@Test
	public void test_tipoDeAlgomonPlanta(){
		
		Planta planta=new Planta();
		
		assertEquals(2d,planta.obtenerMultiplicadorParaTipoAgua(),0.0d);
		assertEquals(0.5d,planta.obtenerMultiplicadorParaTipoFuego(),0.0d);
		assertEquals(1d,planta.obtenerMultiplicadorParaTipoNormal(),0.0d);
		assertEquals(0.5,planta.obtenerMultiplicadorParaTipoPlanta(),0.0d);	
	}
	
	
	@Test
	public void test_tipoDeAlgomonFuego(){
		
		Fuego fuego=new Fuego();
		
		assertEquals(2d,fuego.obtenerMultiplicadorParaTipoPlanta(),0.00d);
		assertEquals(0.5d,fuego.obtenerMultiplicadorParaTipoFuego(),0.00d);
		assertEquals(0.5d,fuego.obtenerMultiplicadorParaTipoAgua(),0.00d);
		assertEquals(1d,fuego.obtenerMultiplicadorParaTipoNormal(),0.00d);
		
	}
	

}
