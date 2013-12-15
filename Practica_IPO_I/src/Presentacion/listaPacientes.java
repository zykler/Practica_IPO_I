package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class listaPacientes {

	private JFrame frame;
	private final JPanel pnlLista = new JPanel();
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mArchivo = new JMenu("Archivo");
	private final JMenuItem miSalir = new JMenuItem("Salir");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JList list = new JList();
	private final JButton btnNuevoPaciente = new JButton("Nuevo paciente");
	private final JButton btnEliminarPaciente = new JButton("Eliminar paciente");
	private final JButton btnSalir = new JButton("Salir");
	private final JButton btnInspeccionar = new JButton("Inspeccionar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listaPacientes window = new listaPacientes();
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
	public listaPacientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 456, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			frame.getContentPane().add(pnlLista, BorderLayout.CENTER);
		}
		GridBagLayout gbl_pnlLista = new GridBagLayout();
		gbl_pnlLista.columnWidths = new int[]{286, 0, 0};
		gbl_pnlLista.rowHeights = new int[]{28, 37, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlLista.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlLista.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlLista.setLayout(gbl_pnlLista);
		{
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridheight = 8;
			gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 0;
			pnlLista.add(scrollPane, gbc_scrollPane);
		}
		list.setBorder(new TitledBorder(null, "Lista de pacientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setViewportView(list);
		{
			GridBagConstraints gbc_btnNuevoPaciente = new GridBagConstraints();
			gbc_btnNuevoPaciente.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnNuevoPaciente.insets = new Insets(0, 0, 5, 0);
			gbc_btnNuevoPaciente.gridx = 1;
			gbc_btnNuevoPaciente.gridy = 0;
			pnlLista.add(btnNuevoPaciente, gbc_btnNuevoPaciente);
		}
		{
			GridBagConstraints gbc_btnEliminarPaciente = new GridBagConstraints();
			gbc_btnEliminarPaciente.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnEliminarPaciente.insets = new Insets(0, 0, 5, 0);
			gbc_btnEliminarPaciente.gridx = 1;
			gbc_btnEliminarPaciente.gridy = 1;
			pnlLista.add(btnEliminarPaciente, gbc_btnEliminarPaciente);
		}
		{
			GridBagConstraints gbc_btnInspeccionar = new GridBagConstraints();
			gbc_btnInspeccionar.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnInspeccionar.insets = new Insets(0, 0, 5, 0);
			gbc_btnInspeccionar.gridx = 1;
			gbc_btnInspeccionar.gridy = 3;
			pnlLista.add(btnInspeccionar, gbc_btnInspeccionar);
		}
		{
			GridBagConstraints gbc_btnSalir = new GridBagConstraints();
			gbc_btnSalir.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnSalir.gridx = 1;
			gbc_btnSalir.gridy = 7;
			pnlLista.add(btnSalir, gbc_btnSalir);
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
	}

}
