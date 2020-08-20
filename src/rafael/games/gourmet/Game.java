package rafael.games.gourmet;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author rafael
 *
 */
public class Game extends JFrame {

	private static final long serialVersionUID = 1L;

	private NodePrato noPrincipal;
	
	private JLabel titulo;
	private JButton botaoIniciar;

	public void run() {
		this.preCadastrarPratos();
		
		setSize(300, 100);        
	    setTitle("Jogo Gourmet");
	    setLocationRelativeTo(null);
	    setVisible(true);
	    setLayout(new GridBagLayout());
	    
	    GridBagConstraints gridBagConstraints = new GridBagConstraints();
	    gridBagConstraints.gridx = 0;
	    
	    titulo = new JLabel("Pense em um prato que gosta");
	    botaoIniciar = new JButton("OK");
	    add(titulo, gridBagConstraints);
	    add(botaoIniciar, gridBagConstraints);
		
		IniciarJogoAction startAction = new IniciarJogoAction(noPrincipal);
		botaoIniciar.addActionListener(startAction);
		
	}
	
	private void preCadastrarPratos()
	{
		noPrincipal = new NodePrato("massa");
		noPrincipal.setEsquerda(new NodePrato("lasanha"));
		noPrincipal.setDireita(new NodePrato("bolo de chocolate"));
	}
}
