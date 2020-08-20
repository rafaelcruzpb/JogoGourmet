package rafael.games.gourmet;

public class GourmetService {
	
	public static NodePrato preCadastrarPratos()
	{
		NodePrato primeiroPrato = new NodePrato("massa");
		primeiroPrato.setOpcaoMesmoTipo(new NodePrato("lasanha"));
		primeiroPrato.setOpcaoOutroTipo(new NodePrato("bolo de chocolate"));
		
		return primeiroPrato;
	}
	
	public static void adicionarNovoPrato(NodePrato pratoBase, String nomePrato, String tipoPrato)
	{
		NodePrato novoTipoPrato = new NodePrato(tipoPrato);
		NodePrato novoPrato = new NodePrato(nomePrato);
		novoTipoPrato.setOpcaoMesmoTipo(novoPrato);
		
		pratoBase.setOpcaoOutroTipo(novoTipoPrato);
	}
}
