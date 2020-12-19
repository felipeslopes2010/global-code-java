/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 *
 * Esta classe representa um Panel de cadastro de clientes, 
 * para ser visualizada deve ser adicionada a um JFrame ou
 * outro container que possa ser visualizado.
 */
package br.com.globalcode.aj4.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.globalcode.util.GlobalcodeException;

/**
 * Esta classe monta um painel para cadastro de clientes. Para ser visualizada,
 * ela deve ser adicionada a um JFrame ou outro container.
 * 
 */
public class PainelCadastroClientes extends JPanel {

	private JLabel lNome;
	private JTextField tfNome;
	private JLabel lTelefone;
	private JTextField tfTelefone;
	private JLabel lID;
	private JTextField tfID;
	private JLabel lCPF;
	private JTextField tfCPF;
	private JPanel pCadastroCliente;
	private JPanel pBotoesCadastro;
	private JButton bExcluir;
	private JButton bSalvar;
	private JButton bNovo;

	/**
	 * Este construtor monta um Panel para insercao de dados de Cadastro de
	 * Clientes.
	 */
	public PainelCadastroClientes() throws GlobalcodeException {
		this.setLayout(new BorderLayout());
		pCadastroCliente = montaPanelCadastroCliente();
		pBotoesCadastro = montaPanelBotoesCadastro();
		this.add(pCadastroCliente, BorderLayout.CENTER);
		this.add(pBotoesCadastro, BorderLayout.SOUTH);
	}

	/**
	 * Metodo utilizado internamente para montagem do JPanel com o botao Salvar,
	 * por isto ele foi declarado como private.
	 * 
	 * @return JPanel com o botao Salvar, para salvar um cliente
	 */
	private JPanel montaPanelBotoesCadastro() {
		JPanel pBotoesCadastro = new JPanel();
		pBotoesCadastro.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton bSalvar = (new JButton("Salvar"));
		bSalvar.setMnemonic (KeyEvent.VK_S);
		pBotoesCadastro.add(bSalvar);
		
		JButton bExcluir = (new JButton("Excluir"));
		bExcluir.setMnemonic (KeyEvent.VK_E);
		pBotoesCadastro.add(bExcluir);
		
		JButton bNovo = (new JButton("Novo"));
		bNovo.setMnemonic (KeyEvent.VK_N);
		pBotoesCadastro.add(bNovo);
		
		return pBotoesCadastro;
		/*
		 *
		 * a)Implemente aqui o codigo para a montagem do painel de botoes
		 * (conforme tela apresentada na apostila).
		 * 
		 * Dica: Para associar uma tecla de atalho ao botao, utilize o metodo
		 * setMnemonic() usando como parametro KeyEvent.VK_(Letra desejada)
		 */

		
	}

	/**
	 * Metodo utilizado internamente para montagem do JPanel para cadastro ou
	 * edicao de um cliente, por isto ele foi declarado como private.
	 * 
	 * @return JPanel para cadastro ou edicao de um cliente
	 */
	private JPanel montaPanelCadastroCliente() {
		
		JPanel pCadastroCliente = new JPanel();
		JTextField tfNome = new JTextField("",10);
		JTextField tfTelefone = new JTextField("",10);
		JTextField tfCPF = new JTextField("",10);
		JTextField tfID = new JTextField("",10);
		tfID.setEditable(false);
		
		pCadastroCliente.setLayout(new GridLayout(8, 1));
		
		pCadastroCliente.add(new JLabel ("Nome"));
		pCadastroCliente.add(tfNome);
		pCadastroCliente.add(new JLabel ("Telefone"));
		pCadastroCliente.add(tfTelefone);
		pCadastroCliente.add(new JLabel ("CPF"));
		pCadastroCliente.add(tfCPF);
		pCadastroCliente.add(new JLabel ("ID"));
		pCadastroCliente.add(tfID);/*
		 * b) Implemente aqui o codigo para montagem do painel de cadastro de
		 * clientes (conforme tela apresentada na apostilas).
		 */

		return pCadastroCliente;
	}
}