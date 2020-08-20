package rafael.games.gourmet;

public class NodePrato {
	private String nome;
	private NodePrato esquerda;
	private NodePrato direita;
	
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

	public NodePrato getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(NodePrato esquerda) {
		this.esquerda = esquerda;
	}

	public NodePrato getDireita() {
		return direita;
	}

	public void setDireita(NodePrato direita) {
		this.direita = direita;
	}
}
