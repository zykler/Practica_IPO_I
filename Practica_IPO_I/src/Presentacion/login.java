package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class login {

	private JFrame frmLogin;
	private final JPanel pnlLogin = new JPanel();
	private final JLabel lblUsuario = new JLabel("Usuario:");
	private final JTextField txtUsuario = new JTextField();
	private final JLabel lblPassword = new JLabel("Contraseña:");
	private final JButton btnNewButton = new JButton("Entrar");
	private final JButton btnSalir = new JButton("Salir");
	private final JPasswordField txtPassword = new JPasswordField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtUsuario.setColumns(10);
		frmLogin = new JFrame();
		frmLogin.setTitle("Registro - FISIOREAL");
		frmLogin.setBounds(100, 100, 350, 160);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(new BorderLayout(0, 0));
		{
			frmLogin.getContentPane().add(pnlLogin, BorderLayout.CENTER);
		}
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlLogin.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlLogin.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlLogin.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlLogin.setLayout(gbl_pnlLogin);
		{
			GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
			gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblUsuario.anchor = GridBagConstraints.EAST;
			gbc_lblUsuario.gridx = 2;
			gbc_lblUsuario.gridy = 1;
			pnlLogin.add(lblUsuario, gbc_lblUsuario);
		}
		{
			GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
			gbc_txtUsuario.gridwidth = 5;
			gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtUsuario.gridx = 3;
			gbc_txtUsuario.gridy = 1;
			pnlLogin.add(txtUsuario, gbc_txtUsuario);
		}
		{
			GridBagConstraints gbc_lblPassword = new GridBagConstraints();
			gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
			gbc_lblPassword.gridx = 2;
			gbc_lblPassword.gridy = 2;
			pnlLogin.add(lblPassword, gbc_lblPassword);
		}
		{
			GridBagConstraints gbc_txtPassword = new GridBagConstraints();
			gbc_txtPassword.gridwidth = 3;
			gbc_txtPassword.insets = new Insets(0, 0, 5, 5);
			gbc_txtPassword.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtPassword.gridx = 5;
			gbc_txtPassword.gridy = 2;
			pnlLogin.add(txtPassword, gbc_txtPassword);
		}
		{
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton.gridx = 6;
			gbc_btnNewButton.gridy = 3;
			pnlLogin.add(btnNewButton, gbc_btnNewButton);
		}
		{
			GridBagConstraints gbc_btnSalir = new GridBagConstraints();
			gbc_btnSalir.insets = new Insets(0, 0, 5, 5);
			gbc_btnSalir.gridx = 7;
			gbc_btnSalir.gridy = 3;
			pnlLogin.add(btnSalir, gbc_btnSalir);
		}
	}

}
