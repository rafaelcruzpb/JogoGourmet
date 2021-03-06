package rafael.games.gourmet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class IniciarJogoAction implements ActionListener {

	private NodePrato primeiroPrato;
	
	public IniciarJogoAction(NodePrato primeiroPrato) {
		this.primeiroPrato = primeiroPrato;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		NodePrato pratoAtual = primeiroPrato;
		
		try {
			do {
				boolean respostaCerta = perguntarPrato(pratoAtual);
				
				NodePrato proximoPrato = respostaCerta ? pratoAtual.getPratoEsquerda() : pratoAtual.getPratoDireita();
				
				if (respostaCerta && proximoPrato == null) {
					acertar(pratoAtual);
				}
				
				if (!respostaCerta && proximoPrato == null) {
					desistir(pratoAtual);
				}
				
				pratoAtual = proximoPrato;
				
			} while (pratoAtual != null);
		} catch(Exception exception) {
			JOptionPane.showMessageDialog(
					null, 
					exception.getMessage(), 
					"Erro!", 
					JOptionPane.ERROR_MESSAGE
			);
		}
	}
	
	private boolean perguntarPrato(NodePrato prato)
	{
		return JOptionPane
				.showConfirmDialog(
						null, 
						"O prato que você pensou é "+prato.getNome()+"?", 
						"Pergunta", 
						JOptionPane.YES_NO_OPTION
				) == JOptionPane.YES_OPTION
		;
	}
	
	private void acertar(NodePrato prato)
	{
		JOptionPane.showMessageDialog(null, "Acertei de novo!");
	}
	
	private void desistir(NodePrato prato) throws Exception
	{
		String pratoEscolhido = JOptionPane.showInputDialog("Qual prato você pensou?");
		
		if (pratoEscolhido == null || pratoEscolhido.equals("")) {
			throw new Exception("É necessário informar o prato que você pensou!");
		}
		
		String tipoPrato = JOptionPane.showInputDialog(pratoEscolhido + " é _______ mas " + prato.getNome() + " não.");
		
		if (tipoPrato == null || tipoPrato.equals("")) {
			throw new Exception("É necessário informar o tipo de prato de " + pratoEscolhido + "!");
		}
		
		NodePrato novoTipoPrato = GourmetService.adicionarPratoNoAnterior(prato, tipoPrato);
		GourmetService.adicionarPratoEspecifico(novoTipoPrato, pratoEscolhido);
		
	}
	
	


}