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
	

}
