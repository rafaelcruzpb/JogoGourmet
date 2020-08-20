package rafael.games.gourmet;

public class NodePrato {
	private String nome;
	private NodePrato opcaoMesmoTipo;
	private NodePrato opcaoOutroTipo;
	
	public NodePrato(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NodePrato getOpcaoMesmoTipo() {
		return opcaoMesmoTipo;
	}

	public void setOpcaoMesmoTipo(NodePrato opcaoMesmoTipo) {
		this.opcaoMesmoTipo = opcaoMesmoTipo;
	}

	public NodePrato getOpcaoOutroTipo() {
		return opcaoOutroTipo;
	}

	public void setOpcaoOutroTipo(NodePrato opcaoOutroTipo) {
		this.opcaoOutroTipo = opcaoOutroTipo;
	}
}
