package rafael.games.gourmet;

public class NodePrato {
	private String nome;
	private NodePrato pratoAnterior;
	private NodePrato pratoEsquerda;
	private NodePrato pratoDireita;
	
	public NodePrato(String nome) {
		super();
		this.nome = nome;
	}
	
	public NodePrato(String nome, NodePrato pratoAnterior) {
		super();
		this.nome = nome;
		this.pratoAnterior = pratoAnterior;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NodePrato getPratoAnterior() {
		return pratoAnterior;
	}

	public void setPratoAnterior(NodePrato pratoAnterior) {
		this.pratoAnterior = pratoAnterior;
	}

	public NodePrato getPratoEsquerda() {
		return pratoEsquerda;
	}

	public void setPratoEsquerda(NodePrato pratoEsquerda) {
		this.pratoEsquerda = pratoEsquerda;
	}

	public NodePrato getPratoDireita() {
		return pratoDireita;
	}

	public void setPratoDireita(NodePrato pratoDireita) {
		this.pratoDireita = pratoDireita;
	}
}
