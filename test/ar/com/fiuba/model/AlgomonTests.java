package ar.com.fiuba.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class AlgomonTests {

	@Test
	public void testCharmanderAtacaABulbasaurAmbosEnEstadoNormal() {
		Algomon charmander= new Charmander();
		Algomon bulbasaur = new Bulbasaur();
		AtaqueRapido ataque= new AtaqueRapido();
		charmander.atacar(bulbasaur,ataque);
		assertEquals(120d,bulbasaur.getPuntosDeVida(),0.001d);		
		
	}
	
	// ATAQUES SIMPLES.
	
	@Test
	public void test1_SquirtleAtacaConBurbujaYconCañonDeAguaYleQuita20y40PuntosDeVidaACharmander(){
		
		Squirtle squirtle=new Squirtle();
		
		Charmander charmander=new Charmander();
		
		squirtle.burbuja(charmander);
		
		assertEquals(150d,charmander.getPuntosDeVida(),0.001d);
		
		squirtle.cañonDeAgua(charmander);
		
		assertEquals(110d,charmander.getPuntosDeVida(),0.001d);
		
	}
	
	@Test
	public void test2_SquirtleAtacaConBurbujaYcañonDeAguaAbulbasaurYleQuita5y10PuntosDeVida(){
		
		Squirtle squirtle=new Squirtle();
		Bulbasaur bulbasaur=new Bulbasaur();
		
		squirtle.burbuja(bulbasaur);
		
		assertEquals(135d,bulbasaur.getPuntosDeVida(),0.000d);
		
		squirtle.cañonDeAgua(bulbasaur);
		
		assertEquals(125d,bulbasaur.getPuntosDeVida(),0.000d);
		
	}
	
	@Test
	public void test3_SquirtleAtacaConBurbujaYcañonDeAguaAotrosAlgomones(){
		
		Squirtle squirtle=new Squirtle();	
		
		Charmander charmander=new Charmander();
		Bulbasaur bulbasaur=new Bulbasaur();
		Chansey chansey=new Chansey();
		Jigglypuff jigglypuff=new Jigglypuff();
		Rattata rattata=new Rattata();
		
		
		squirtle.burbuja(charmander);
		squirtle.burbuja(bulbasaur);
		squirtle.burbuja(chansey );
		squirtle.burbuja(jigglypuff);
		squirtle.burbuja(rattata);
		
		
		assertEquals(150d,charmander.getPuntosDeVida(),0.000d);
		assertEquals(135d,bulbasaur.getPuntosDeVida(),0.000d);
		assertEquals(120d,chansey.getPuntosDeVida(),0.000d);
		assertEquals(120d,jigglypuff.getPuntosDeVida(),0.000d);
		assertEquals(160d,rattata.getPuntosDeVida(),0.000d);
		
		squirtle.cañonDeAgua(charmander);
		squirtle.cañonDeAgua(bulbasaur);
		squirtle.cañonDeAgua(chansey);
		squirtle.cañonDeAgua(jigglypuff);
		squirtle.cañonDeAgua(rattata );
		

		assertEquals(110d,charmander.getPuntosDeVida(),0.000d);
		assertEquals(125d,bulbasaur.getPuntosDeVida(),0.000d);
		assertEquals(100d,chansey.getPuntosDeVida(),0.000d);
		assertEquals(100d,jigglypuff.getPuntosDeVida(),0.000d);
		assertEquals(140d,rattata.getPuntosDeVida(),0.000d);
		
	}
	
	@Test
	public void test4_BulbasaurYchanseyAtacanConLatigoCepaAsquirtle(){
		
		Bulbasaur bulbasaur=new Bulbasaur();
		
		Chansey chansey=new Chansey();
		
		Squirtle squirtle=new Squirtle();
		
		bulbasaur.latigoCepa(squirtle);
		
		chansey.latigoCepa(squirtle);
		 
		assertEquals(105d,squirtle.getPuntosDeVida(),0.000d);
		
	}
	

	@Test
	public void test5_BulbasaurYchanseyAtacanConLatigoCepaAcharmanderYleQuita7PuntosDeVida(){
		
		Bulbasaur bulbasaur=new Bulbasaur();
		Chansey chansey=new Chansey();
		
		Charmander charmander=new Charmander();
		
		
		bulbasaur.latigoCepa(charmander);
		chansey.latigoCepa(charmander);
		
	
		assertEquals(147.5d,charmander.getPuntosDeVida(),0.000d);
	}
	
	@Test
	public void test6_BulbasaurYchanseyAtacanConLatigoCepaAotrosAlgomonesYleQuita15PuntosDeVidaAcadaUno(){
	
		
		Bulbasaur bulbasaur=new Bulbasaur();
		
		Chansey chansey=new Chansey();
		
		
		Charmander charmander=new Charmander();
		Jigglypuff jigglypuff=new Jigglypuff();
		Rattata rattata=new Rattata();
		
		bulbasaur.latigoCepa(charmander);
		bulbasaur.latigoCepa(jigglypuff);
		bulbasaur.latigoCepa(rattata);
		
		assertEquals(162.5d,charmander.getPuntosDeVida(),0.000d);
		assertEquals(115d,jigglypuff.getPuntosDeVida(),0.000d);
		assertEquals(155d,rattata.getPuntosDeVida(),0.000d);
		
		chansey.latigoCepa(charmander);
		chansey.latigoCepa(jigglypuff);
		chansey.latigoCepa(rattata);
		
		assertEquals(147.5d,charmander.getPuntosDeVida(),0.000d);
		assertEquals(100d,jigglypuff.getPuntosDeVida(),0.000d);
		assertEquals(140d,rattata.getPuntosDeVida(),0.000d);

	}
	
	
	@Test
	public void test7_CharmanderAtacaConBrasasAbulbasaurYleQuita32PuntosDeVida(){
		
		Charmander charmander=new Charmander();
		
		Bulbasaur bulbasaur=new Bulbasaur();
		
		charmander.brasas(bulbasaur);
		
		assertEquals(108d,bulbasaur.getPuntosDeVida(),0.000d);
		
	}
	
	
	@Test
	public void test8_CharmanderAtacaConBrasasAsquirtleYleQuita8PuntosDeVida(){
		
		Charmander charmander=new Charmander();
		
		Squirtle squirtle=new Squirtle();
		
		charmander.brasas(squirtle);
		
		assertEquals(142d,squirtle.getPuntosDeVida(),0.000d);

	}
	
	
	@Test
	public void test9_CharmanderAtacaConBrasasAotrosAlgomonesYlesQuita16PuntosDeVidaAcadaUno(){
		
		Charmander charmander=new Charmander();
		
		
		Squirtle squirtle=new Squirtle();
		Bulbasaur bulbasaur=new Bulbasaur();
		Chansey chansey=new Chansey();
		Rattata rattata=new Rattata();
		Jigglypuff jigglypuff=new Jigglypuff();
		
		
		charmander.brasas(squirtle);
		charmander.brasas(bulbasaur);
		charmander.brasas(chansey);
		charmander.brasas(rattata);
		charmander.brasas(jigglypuff);
		
		
		assertEquals(142d,squirtle.getPuntosDeVida(),0.000d);
		assertEquals(108d,bulbasaur.getPuntosDeVida(),0.000d);		
		assertEquals(114d,chansey.getPuntosDeVida(),0.000d);
		assertEquals(154d,rattata.getPuntosDeVida(),0.000d);
		assertEquals(114d,jigglypuff.getPuntosDeVida(),0.000d);
	
		
	}
	
	
	@Test
	public void test10_AlgomonesAgotanLaCantidadDisponibleDeCadaAtaque(){
		
		Algomon charmander=new Charmander();
		Algomon bulbasaur=new Bulbasaur();
		
		Ataque fogonazo=new Fogonazo();
		
		
		charmander.atacar(bulbasaur, fogonazo);
		charmander.atacar(bulbasaur, fogonazo);
		charmander.atacar(bulbasaur, fogonazo);
		charmander.atacar(bulbasaur, fogonazo);
		
		assertEquals(0d,fogonazo.getCantidadDeAtaques(),0.000d);
		
	}
	
	
	@Test(expected=SeTerminoLaCantidadDeEsteAtaqueException.class)
	public void test11_unAlgomonNoPuedeSeguirAtacandoCuandoNoTieneMasCantidadDeAtaques(){
		
		Algomon charmander=new Charmander();
		Algomon bulbasaur=new Bulbasaur();
		
		Ataque fogonazo=new Fogonazo();
		
		charmander.atacar(bulbasaur, fogonazo);
		charmander.atacar(bulbasaur, fogonazo);
		charmander.atacar(bulbasaur, fogonazo);
		charmander.atacar(bulbasaur, fogonazo);
		charmander.atacar(bulbasaur, fogonazo);
		
		
		assertEquals(0d,fogonazo.getCantidadDeAtaques(),0.000d);
		
	}
	
}
