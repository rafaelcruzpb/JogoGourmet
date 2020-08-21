package rafael.games.gourmet;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 * 
 * @author rafael
 *
 */
public class Game extends JFrame {

	private static final long serialVersionUID = 1L;

	private NodePrato primeiroPrato;
	
	private JLabel titulo;
	private JButton botaoIniciar;

	public void run() {
		primeiroPrato = GourmetService.preCadastrarPratos();
		this.configureFrame();
	}
	
	private void configureFrame()
	{
		setSize(300, 130);        
	    setTitle("Jogo Gourmet");
	    setLocationRelativeTo(null);
	    setLayout(new GridBagLayout());
	    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    
	    GridBagConstraints gridBagConstraints = new GridBagConstraints();
	    gridBagConstraints.gridx = 0;
	    
	    titulo = new JLabel("Pense em um prato que gosta");
	    botaoIniciar = new JButton("OK");
	    add(titulo, gridBagConstraints);
	    add(botaoIniciar, gridBagConstraints);
	    
	    IniciarJogoAction startAction = new IniciarJogoAction(primeiroPrato);
		botaoIniciar.addActionListener(startAction);
		setVisible(true);
	}
}
