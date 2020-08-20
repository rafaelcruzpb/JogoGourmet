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
		assertEquals(prato.getOpcaoOutroTipo().getNome(), "bolo de chocolate");
	}
	
	@Test
	void adicionarNovoPratoTest() {
		NodePrato prato = new NodePrato("Hortaliças");
		prato.setOpcaoMesmoTipo(new NodePrato("alface"));
		GourmetService.adicionarNovoPrato(prato, "pimentão", "legume");
		
		assertEquals(prato.getOpcaoOutroTipo().getNome(), "legume");
		assertEquals(prato.getOpcaoOutroTipo().getPratoEsquerda().getNome(), "pimentão");
	}

}
