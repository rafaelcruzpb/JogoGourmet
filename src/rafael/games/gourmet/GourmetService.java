package rafael.games.gourmet;

public class GourmetService {
	
	public static NodePrato preCadastrarPratos()
	{
		NodePrato primeiroPrato = new NodePrato("massa");
		NodePrato segundoPrato = new NodePrato("bolo de chocolate");
		primeiroPrato.setPratoDireita(segundoPrato);
		primeiroPrato.setPratoEsquerda(new NodePrato("lasanha"));
		
		return primeiroPrato;
	}
	
	public static NodePrato adicionarPratoEspecifico(NodePrato pratoBase, String nomeNovoPratoEspecifico)
	{
		NodePrato novoPratoEspecifico = new NodePrato(nomeNovoPratoEspecifico);
		pratoBase.setPratoEsquerda(novoPratoEspecifico);
		
		return novoPratoEspecifico;
	}
	
	public static NodePrato adicionarPratoNoAnterior(NodePrato pratoBase, String nomeNovoPrato)
	{
		NodePrato novoPrato = new NodePrato(nomeNovoPrato);
		
		/**
		 * Descobrir qual sentido o nó veio, para setar o ponteiro correto do nó anterior
		 */
		if (pratoBase.getPratoAnterior().getPratoEsquerda().equals(pratoBase)) {
			pratoBase.getPratoAnterior().setPratoEsquerda(novoPrato);
		} else {
			pratoBase.getPratoAnterior().setPratoDireita(novoPrato);
		}
		
		novoPrato.setPratoDireita(pratoBase);
		
		return novoPrato;
	}
}
