package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

public class version {

	private JFrame frmVersinFisioreal;
	private final JPanel pnlver = new JPanel();
	private final JLabel lblVersion = new JLabel("Versión:");
	private final JLabel lblVactual = new JLabel("1.1");
	private final JButton btnComprobarVersion = new JButton("Comprobar versión");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					version window = new version();
					window.frmVersinFisioreal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public version() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVersinFisioreal = new JFrame();
		frmVersinFisioreal.setTitle("Versión - FISIOREAL");
		frmVersinFisioreal.setBounds(100, 100, 301, 120);
		frmVersinFisioreal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			frmVersinFisioreal.getContentPane().add(pnlver, BorderLayout.CENTER);
		}
		GridBagLayout gbl_pnlver = new GridBagLayout();
		gbl_pnlver.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlver.rowHeights = new int[]{0, 0, 0};
		gbl_pnlver.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlver.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pnlver.setLayout(gbl_pnlver);
		{
			GridBagConstraints gbc_lblVersion = new GridBagConstraints();
			gbc_lblVersion.insets = new Insets(0, 0, 0, 5);
			gbc_lblVersion.gridx = 2;
			gbc_lblVersion.gridy = 1;
			pnlver.add(lblVersion, gbc_lblVersion);
		}
		{
			GridBagConstraints gbc_lblVactual = new GridBagConstraints();
			gbc_lblVactual.insets = new Insets(0, 0, 0, 5);
			gbc_lblVactual.gridx = 3;
			gbc_lblVactual.gridy = 1;
			pnlver.add(lblVactual, gbc_lblVactual);
		}
		{
			GridBagConstraints gbc_btnComprobarVersion = new GridBagConstraints();
			gbc_btnComprobarVersion.insets = new Insets(0, 0, 0, 5);
			gbc_btnComprobarVersion.gridx = 5;
			gbc_btnComprobarVersion.gridy = 1;
			pnlver.add(btnComprobarVersion, gbc_btnComprobarVersion);
		}
	}

}
