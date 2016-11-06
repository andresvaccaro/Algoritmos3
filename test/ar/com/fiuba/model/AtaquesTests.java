package ar.com.fiuba.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class AtaquesTests {
	
	
	@Test
	public void test_AtaqueRapido(){
		
		AtaqueRapido ataqueRapido=new AtaqueRapido();
		
		assertEquals(10d,ataqueRapido.getPotencia(),0.00d);
		assertEquals(16d,ataqueRapido.getCantidad(),0.00d);	
	}
	
	@Test
	public void test_AtaqueConBrasas(){
		
		Brasas brasas=new Brasas();
		
		assertEquals(16d,brasas.getPotencia(),0.00d);
		assertEquals(10d,brasas.getCantidad(),0.00d);
	}
	
	
	@Test
	public void test_ataqueCa�onDeAgua(){
		
		Ca�onDeAgua ca�on=new Ca�onDeAgua();
		
		assertEquals(20d,ca�on.getPotencia(),0.00d);
		assertEquals(8d,ca�on.getCantidad(),0.00d);
		
	}

}
