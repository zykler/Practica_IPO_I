package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class nuevoPaciente {

	private JFrame frame;
	private final JMenuBar menuBar = new JMenuBar();
	private final JPanel pnlPaciente = new JPanel();
	private final JMenu mArchivo = new JMenu("Archivo");
	private final JMenuItem miSalir = new JMenuItem("Salir");
	private final JPanel pnlDatos = new JPanel();
	private final JLabel lblNombre = new JLabel("Nombre:");
	private final JTextField txtNombre = new JTextField();
	private final JLabel lblApellidos = new JLabel("Apellidos:");
	private final JTextField txtApellidos = new JTextField();
	private final JLabel lblSexo = new JLabel("Sexo:");
	private final JRadioButton rdbtnHombre = new JRadioButton("Hombre");
	private final JRadioButton rdbtnMujer = new JRadioButton("Mujer");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JLabel lblDireccion = new JLabel("Dirección:");
	private final JLabel lblDNI = new JLabel("DNI/NIF:");
	private final JTextField txtDireccion = new JTextField();
	private final JTextField textField = new JTextField();
	private final JLabel lblAnadirFoto = new JLabel("Añadir foto:");
	private final JButton btnExaminar = new JButton("Examinar...");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JTextArea textAreaAntecedentes = new JTextArea();
	private final JLabel label = new JLabel("");
	private final JButton btnCancelar = new JButton("Cancelar");
	private final JButton btnAceptar = new JButton("Aceptar");
	private final JButton btnBorrarTodo = new JButton("Borrar Todo");
	private final JMenu mAnadir = new JMenu("Añadir");
	private final JMenuItem miImagen = new JMenuItem("Imagen");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nuevoPaciente window = new nuevoPaciente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public nuevoPaciente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		txtDireccion.setColumns(10);
		txtNombre.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 423, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		{
			pnlPaciente.setBorder(new TitledBorder(null, "Ficha Paciente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			frame.getContentPane().add(pnlPaciente, BorderLayout.CENTER);
		}
		GridBagLayout gbl_pnlPaciente = new GridBagLayout();
		gbl_pnlPaciente.columnWidths = new int[]{130, 63, 42, 91, 0, 0};
		gbl_pnlPaciente.rowHeights = new int[]{198, 101, 39, 34, 0, 0};
		gbl_pnlPaciente.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlPaciente.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlPaciente.setLayout(gbl_pnlPaciente);
		{
			GridBagConstraints gbc_pnlDatos = new GridBagConstraints();
			gbc_pnlDatos.gridwidth = 3;
			gbc_pnlDatos.insets = new Insets(0, 0, 5, 5);
			gbc_pnlDatos.fill = GridBagConstraints.BOTH;
			gbc_pnlDatos.gridx = 0;
			gbc_pnlDatos.gridy = 0;
			pnlDatos.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			pnlPaciente.add(pnlDatos, gbc_pnlDatos);
		}
		GridBagLayout gbl_pnlDatos = new GridBagLayout();
		gbl_pnlDatos.columnWidths = new int[]{78, 64, 0, 0};
		gbl_pnlDatos.rowHeights = new int[]{14, 0, 21, 0, 0, 0, 0};
		gbl_pnlDatos.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlDatos.setLayout(gbl_pnlDatos);
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		pnlDatos.add(lblNombre, gbc_lblNombre);
		{
			GridBagConstraints gbc_txtNombre = new GridBagConstraints();
			gbc_txtNombre.gridwidth = 2;
			gbc_txtNombre.fill = GridBagConstraints.BOTH;
			gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
			gbc_txtNombre.gridx = 1;
			gbc_txtNombre.gridy = 0;
			pnlDatos.add(txtNombre, gbc_txtNombre);
		}
		{
			GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
			gbc_lblApellidos.anchor = GridBagConstraints.EAST;
			gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidos.gridx = 0;
			gbc_lblApellidos.gridy = 1;
			pnlDatos.add(lblApellidos, gbc_lblApellidos);
		}
		txtApellidos.setColumns(10);
		{
			GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
			gbc_txtApellidos.gridwidth = 2;
			gbc_txtApellidos.fill = GridBagConstraints.BOTH;
			gbc_txtApellidos.insets = new Insets(0, 0, 5, 0);
			gbc_txtApellidos.gridx = 1;
			gbc_txtApellidos.gridy = 1;
			pnlDatos.add(txtApellidos, gbc_txtApellidos);
		}
		{
			GridBagConstraints gbc_lblSexo = new GridBagConstraints();
			gbc_lblSexo.anchor = GridBagConstraints.EAST;
			gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
			gbc_lblSexo.gridx = 0;
			gbc_lblSexo.gridy = 2;
			pnlDatos.add(lblSexo, gbc_lblSexo);
		}
		{
			GridBagConstraints gbc_rdbtnHombre = new GridBagConstraints();
			gbc_rdbtnHombre.anchor = GridBagConstraints.WEST;
			gbc_rdbtnHombre.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnHombre.gridx = 1;
			gbc_rdbtnHombre.gridy = 2;
			buttonGroup.add(rdbtnHombre);
			pnlDatos.add(rdbtnHombre, gbc_rdbtnHombre);
		}
		{
			GridBagConstraints gbc_rdbtnMujer = new GridBagConstraints();
			gbc_rdbtnMujer.insets = new Insets(0, 0, 5, 0);
			gbc_rdbtnMujer.gridx = 2;
			gbc_rdbtnMujer.gridy = 2;
			buttonGroup.add(rdbtnMujer);
			pnlDatos.add(rdbtnMujer, gbc_rdbtnMujer);
		}
		{
			GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
			gbc_lblDireccion.anchor = GridBagConstraints.EAST;
			gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
			gbc_lblDireccion.gridx = 0;
			gbc_lblDireccion.gridy = 3;
			pnlDatos.add(lblDireccion, gbc_lblDireccion);
		}
		{
			GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
			gbc_txtDireccion.gridwidth = 2;
			gbc_txtDireccion.insets = new Insets(0, 0, 5, 0);
			gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtDireccion.gridx = 1;
			gbc_txtDireccion.gridy = 3;
			pnlDatos.add(txtDireccion, gbc_txtDireccion);
		}
		{
			GridBagConstraints gbc_lblDNI = new GridBagConstraints();
			gbc_lblDNI.anchor = GridBagConstraints.EAST;
			gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
			gbc_lblDNI.gridx = 0;
			gbc_lblDNI.gridy = 4;
			pnlDatos.add(lblDNI, gbc_lblDNI);
		}
		{
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 0);
			gbc_textField.gridwidth = 2;
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 4;
			pnlDatos.add(textField, gbc_textField);
		}
		{
			GridBagConstraints gbc_lblAnadirFoto = new GridBagConstraints();
			gbc_lblAnadirFoto.anchor = GridBagConstraints.EAST;
			gbc_lblAnadirFoto.insets = new Insets(0, 0, 0, 5);
			gbc_lblAnadirFoto.gridx = 0;
			gbc_lblAnadirFoto.gridy = 5;
			pnlDatos.add(lblAnadirFoto, gbc_lblAnadirFoto);
		}
		{
			GridBagConstraints gbc_btnExaminar = new GridBagConstraints();
			gbc_btnExaminar.anchor = GridBagConstraints.WEST;
			gbc_btnExaminar.insets = new Insets(0, 0, 0, 5);
			gbc_btnExaminar.gridx = 1;
			gbc_btnExaminar.gridy = 5;
			pnlDatos.add(btnExaminar, gbc_btnExaminar);
		}
		{
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.gridwidth = 2;
			gbc_label.fill = GridBagConstraints.BOTH;
			gbc_label.insets = new Insets(0, 0, 5, 0);
			gbc_label.gridx = 3;
			gbc_label.gridy = 0;
			label.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			pnlPaciente.add(label, gbc_label);
		}
		{
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridheight = 2;
			gbc_scrollPane.gridwidth = 5;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 1;
			pnlPaciente.add(scrollPane, gbc_scrollPane);
		}
		{
			textAreaAntecedentes.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Antecedentes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane.setViewportView(textAreaAntecedentes);
		}
		{
			GridBagConstraints gbc_btnBorrarTodo = new GridBagConstraints();
			gbc_btnBorrarTodo.insets = new Insets(0, 0, 0, 5);
			gbc_btnBorrarTodo.gridx = 1;
			gbc_btnBorrarTodo.gridy = 4;
			pnlPaciente.add(btnBorrarTodo, gbc_btnBorrarTodo);
		}
		{
			GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
			gbc_btnAceptar.gridwidth = 2;
			gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
			gbc_btnAceptar.gridx = 2;
			gbc_btnAceptar.gridy = 4;
			pnlPaciente.add(btnAceptar, gbc_btnAceptar);
		}
		{
			GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
			gbc_btnCancelar.gridx = 4;
			gbc_btnCancelar.gridy = 4;
			pnlPaciente.add(btnCancelar, gbc_btnCancelar);
		}
		{
			frame.setJMenuBar(menuBar);
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
	}

}
