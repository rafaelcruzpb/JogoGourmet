package rafael.games.gourmet;

public class GourmetService {
	
	public static NodePrato preCadastrarPratos()
	{
		NodePrato primeiroPrato = new NodePrato("massa");
		adicionarPratoEsquerda(primeiroPrato, "lasanha");
		adicionarPratoDireita(primeiroPrato, "bolo de chocolate");
		
		return primeiroPrato;
	}
	
	public static NodePrato adicionarPratoEsquerda(NodePrato pratoBase, String nomeNovoPrato)
	{
		NodePrato novoPrato = new NodePrato(nomeNovoPrato);
		pratoBase.setPratoEsquerda(novoPrato);
		return novoPrato;
	}
	
	public static NodePrato adicionarPratoDireita(NodePrato pratoBase, String nomeNovoPrato)
	{
		NodePrato novoPrato = new NodePrato(nomeNovoPrato);
		pratoBase.setPratoDireita(novoPrato);
		return novoPrato;
	}
}
