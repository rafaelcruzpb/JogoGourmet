package rafael.games.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rafael.games.gourmet.GourmetService;
import rafael.games.gourmet.NodePrato;

class GourmetServiceTest {

	@Test
	void preCadastrarPratosTest() {
		NodePrato prato = GourmetService.preCadastrarPratos();
		
		assertEquals(prato.getPratoEsquerda().getNome(), "lasanha");
		assertEquals(prato.getPratoDireita().getNome(), "bolo de chocolate");
	}
	
	@Test
	void adicionarPratoNoAnteriorTest() {
		NodePrato prato = GourmetService.preCadastrarPratos();
		
		GourmetService.adicionarPratoNoAnterior(prato.getPratoDireita(), "novoPrato");
		
		assertEquals(prato.getPratoDireita().getNome(), "novoPrato");
	}
	
	@Test
	void adicionarPratoEspecificoTest() {
		NodePrato prato = GourmetService.preCadastrarPratos();
		
		GourmetService.adicionarPratoEspecifico(prato.getPratoEsquerda(), "outra lasanha");
		
		assertEquals(prato.getPratoEsquerda().getPratoEsquerda().getNome(), "outra lasanha");
	}

}
