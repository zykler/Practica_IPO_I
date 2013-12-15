package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class nuevoInforme {

	private JFrame frmNuevoInforme;
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mArchivo = new JMenu("Archivo");
	private final JMenuItem miSalir = new JMenuItem("Salir");
	private final JMenu mAnadir = new JMenu("Añadir");
	private final JMenuItem miImagen = new JMenuItem("Imagen");
	private final JPanel pnlInforme = new JPanel();
	private final JPanel panel = new JPanel();
	private final JLabel lblPaciente = new JLabel("Paciente:");
	private final JLabel lblDoctor = new JLabel("Doctor:");
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JFormattedTextField formattedTextField = new JFormattedTextField();
	private final JLabel lblFecha = new JLabel("Fecha:");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JTextArea txtArDiagnostico = new JTextArea();
	private final JButton btnCancelar = new JButton("Cancelar");
	private final JButton btnAceptar = new JButton("Aceptar");
	private final JButton btnHoy = new JButton("Hoy");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nuevoInforme window = new nuevoInforme();
					window.frmNuevoInforme.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public nuevoInforme() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		frmNuevoInforme = new JFrame();
		frmNuevoInforme.setTitle("Nuevo Informe - FISIOREAL");
		frmNuevoInforme.setBounds(100, 100, 417, 317);
		frmNuevoInforme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			frmNuevoInforme.getContentPane().add(menuBar, BorderLayout.NORTH);
		}
		{
			menuBar.add(mArchivo);
		}
		{
			mArchivo.add(miSalir);
		}
		{
			menuBar.add(mAnadir);
		}
		{
			mAnadir.add(miImagen);
		}
		{
			frmNuevoInforme.getContentPane().add(pnlInforme, BorderLayout.CENTER);
		}
		GridBagLayout gbl_pnlInforme = new GridBagLayout();
		gbl_pnlInforme.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 80, 0};
		gbl_pnlInforme.rowHeights = new int[]{107, 0, 0, 0, 0, 0, 0};
		gbl_pnlInforme.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlInforme.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlInforme.setLayout(gbl_pnlInforme);
		{
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridwidth = 7;
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			panel.setBorder(new TitledBorder(null, "Informaci\u00F3n General", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			pnlInforme.add(panel, gbc_panel);
		}
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		{
			GridBagConstraints gbc_lblPaciente = new GridBagConstraints();
			gbc_lblPaciente.gridwidth = 2;
			gbc_lblPaciente.insets = new Insets(0, 0, 5, 5);
			gbc_lblPaciente.anchor = GridBagConstraints.EAST;
			gbc_lblPaciente.gridx = 0;
			gbc_lblPaciente.gridy = 0;
			panel.add(lblPaciente, gbc_lblPaciente);
		}
		{
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.gridwidth = 2;
			gbc_textField.insets = new Insets(0, 0, 5, 0);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 2;
			gbc_textField.gridy = 0;
			panel.add(textField, gbc_textField);
		}
		{
			GridBagConstraints gbc_lblDoctor = new GridBagConstraints();
			gbc_lblDoctor.anchor = GridBagConstraints.EAST;
			gbc_lblDoctor.gridwidth = 2;
			gbc_lblDoctor.insets = new Insets(0, 0, 5, 5);
			gbc_lblDoctor.gridx = 0;
			gbc_lblDoctor.gridy = 1;
			panel.add(lblDoctor, gbc_lblDoctor);
		}
		{
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.gridwidth = 2;
			gbc_textField_1.insets = new Insets(0, 0, 5, 0);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 2;
			gbc_textField_1.gridy = 1;
			textField_1.setColumns(10);
			panel.add(textField_1, gbc_textField_1);
		}
		{
			GridBagConstraints gbc_lblFecha = new GridBagConstraints();
			gbc_lblFecha.anchor = GridBagConstraints.EAST;
			gbc_lblFecha.gridwidth = 2;
			gbc_lblFecha.insets = new Insets(0, 0, 0, 5);
			gbc_lblFecha.gridx = 0;
			gbc_lblFecha.gridy = 2;
			panel.add(lblFecha, gbc_lblFecha);
		}
		{
			GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
			gbc_formattedTextField.insets = new Insets(0, 0, 0, 5);
			gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
			gbc_formattedTextField.gridx = 2;
			gbc_formattedTextField.gridy = 2;
			panel.add(formattedTextField, gbc_formattedTextField);
		}
		{
			GridBagConstraints gbc_btnHoy = new GridBagConstraints();
			gbc_btnHoy.anchor = GridBagConstraints.WEST;
			gbc_btnHoy.gridx = 3;
			gbc_btnHoy.gridy = 2;
			panel.add(btnHoy, gbc_btnHoy);
		}
		{
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridwidth = 8;
			gbc_scrollPane.gridheight = 3;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 1;
			pnlInforme.add(scrollPane, gbc_scrollPane);
		}
		{
			txtArDiagnostico.setBorder(new TitledBorder(null, "Diagn\u00F3stico", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane.setViewportView(txtArDiagnostico);
		}
		{
			GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
			gbc_btnAceptar.gridheight = 2;
			gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
			gbc_btnAceptar.gridx = 6;
			gbc_btnAceptar.gridy = 4;
			pnlInforme.add(btnAceptar, gbc_btnAceptar);
		}
		{
			GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
			gbc_btnCancelar.gridheight = 2;
			gbc_btnCancelar.gridx = 7;
			gbc_btnCancelar.gridy = 4;
			pnlInforme.add(btnCancelar, gbc_btnCancelar);
		}
	}

}
