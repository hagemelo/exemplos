package br.com.inmetrics.superheroi_api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.inmetrics.superheroi_api.modelo.SuperHeroi;

public class SuperHeroiTest {
	
	private final String SUPERHEROI = "BATMAN";
	
	@Test
	public void deveRetornarNomeBatman() {
		
		
		SuperHeroi heroi = new SuperHeroi(SUPERHEROI, "PRETO", "força");
		assertEquals(heroi.getNome(), SUPERHEROI);
	}
	

}
