package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class accesibilidad {

	private JFrame frmAccesibilidadFisioreal;
	private final JPanel pnlAccesibilidad = new JPanel();
	private final JLabel lblTamanoLetra = new JLabel("Tamaño letra:");
	private final JComboBox cmbTamano = new JComboBox();
	private final JLabel lblIdioma = new JLabel("Idioma:");
	private final JComboBox cmbIdioma = new JComboBox();
	private final JButton btnAplicar = new JButton("Aplicar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accesibilidad window = new accesibilidad();
					window.frmAccesibilidadFisioreal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public accesibilidad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAccesibilidadFisioreal = new JFrame();
		frmAccesibilidadFisioreal.setTitle("Accesibilidad - FISIOREAL");
		frmAccesibilidadFisioreal.setBounds(100, 100, 248, 159);
		frmAccesibilidadFisioreal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			frmAccesibilidadFisioreal.getContentPane().add(pnlAccesibilidad, BorderLayout.CENTER);
		}
		GridBagLayout gbl_pnlAccesibilidad = new GridBagLayout();
		gbl_pnlAccesibilidad.columnWidths = new int[]{85, 0, 0, 0};
		gbl_pnlAccesibilidad.rowHeights = new int[]{37, 0, 0, 0, 0};
		gbl_pnlAccesibilidad.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlAccesibilidad.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlAccesibilidad.setLayout(gbl_pnlAccesibilidad);
		{
			GridBagConstraints gbc_lblTamanoLetra = new GridBagConstraints();
			gbc_lblTamanoLetra.anchor = GridBagConstraints.EAST;
			gbc_lblTamanoLetra.insets = new Insets(0, 0, 5, 5);
			gbc_lblTamanoLetra.gridx = 0;
			gbc_lblTamanoLetra.gridy = 0;
			pnlAccesibilidad.add(lblTamanoLetra, gbc_lblTamanoLetra);
		}
		{
			GridBagConstraints gbc_cmbTamano = new GridBagConstraints();
			gbc_cmbTamano.insets = new Insets(0, 0, 5, 5);
			gbc_cmbTamano.fill = GridBagConstraints.HORIZONTAL;
			gbc_cmbTamano.gridx = 1;
			gbc_cmbTamano.gridy = 0;
			cmbTamano.setModel(new DefaultComboBoxModel(new String[] {"10px", "12px", "13px"}));
			pnlAccesibilidad.add(cmbTamano, gbc_cmbTamano);
		}
		{
			GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
			gbc_lblIdioma.anchor = GridBagConstraints.EAST;
			gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
			gbc_lblIdioma.gridx = 0;
			gbc_lblIdioma.gridy = 1;
			pnlAccesibilidad.add(lblIdioma, gbc_lblIdioma);
		}
		{
			GridBagConstraints gbc_cmbIdioma = new GridBagConstraints();
			gbc_cmbIdioma.insets = new Insets(0, 0, 5, 5);
			gbc_cmbIdioma.fill = GridBagConstraints.HORIZONTAL;
			gbc_cmbIdioma.gridx = 1;
			gbc_cmbIdioma.gridy = 1;
			cmbIdioma.setModel(new DefaultComboBoxModel(new String[] {"Spanish", "English", "French"}));
			pnlAccesibilidad.add(cmbIdioma, gbc_cmbIdioma);
		}
		{
			GridBagConstraints gbc_btnAplicar = new GridBagConstraints();
			gbc_btnAplicar.anchor = GridBagConstraints.WEST;
			gbc_btnAplicar.insets = new Insets(0, 0, 0, 5);
			gbc_btnAplicar.gridx = 1;
			gbc_btnAplicar.gridy = 3;
			pnlAccesibilidad.add(btnAplicar, gbc_btnAplicar);
		}
	}

}
