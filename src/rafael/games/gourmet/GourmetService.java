package rafael.games.gourmet;

public class GourmetService {
	
	public static NodePrato preCadastrarPratos()
	{
		NodePrato primeiroPrato = new NodePrato("massa");
		NodePrato segundoPrato = new NodePrato("lasanha");
		primeiroPrato.setPratoEsquerda();
		segundoPrato.setPratoAnterior(primeiroPrato);
		
		primeiroPrato.setPratoEsquerda(segundoPrato);
		primeiroPrato.setPratoDireita(new NodePrato("bolo de chocolate"));
		
		return primeiroPrato;
	}
	
	public static NodePrato criarNovoPrato(String nomePrato, String tipoPrato)
	{
		NodePrato novoTipoPrato = new NodePrato(tipoPrato);
		NodePrato novoPrato = new NodePrato(nomePrato);
		novoTipoPrato.setPratoEsquerda(novoPrato);
		
		return novoTipoPrato;
	}
	
	public static void adicionarNovoPrato(NodePrato pratoBase, String nomePrato, String tipoPrato)
	{
		NodePrato novoTipoPrato = criarNovoPrato(nomePrato, tipoPrato);
		
		/**
		 * Inserindo novos pratos antes do ultimo prato
		 */
		if (pratoBase.getPratoAnterior() != null) {
			novoTipoPrato.setPratoAnterior(pratoBase.getPratoAnterior());
			pratoBase.getPratoAnterior().setPratoDireita(novoTipoPrato);
		}
		
		pratoBase.setPratoAnterior(novoTipoPrato);
	}
}
