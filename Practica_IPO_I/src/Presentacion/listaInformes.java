package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class listaInformes {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JButton brnNuevoInforme = new JButton("Nuevo informe");
	private final JButton btnEliminarInforme = new JButton("Eliminar informe");
	private final JButton btnInspeccionar = new JButton("Inspeccionar");
	private final JButton btnSalir = new JButton("Salir");
	private final JMenuBar menuBar = new JMenuBar();
	private final JList listInformes = new JList();
	private final JMenu mArchivo = new JMenu("Archivo");
	private final JMenuItem menuItem = new JMenuItem("Salir");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listaInformes window = new listaInformes();
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
	public listaInformes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{455, 0};
		gridBagLayout.rowHeights = new int[]{236, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		{
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.anchor = GridBagConstraints.NORTH;
			gbc_panel.fill = GridBagConstraints.HORIZONTAL;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			frame.getContentPane().add(panel, gbc_panel);
		}
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{286, 149, 0};
		gbl_panel.rowHeights = new int[]{35, 37, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		{
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridheight = 8;
			gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 0;
			panel.add(scrollPane, gbc_scrollPane);
		}
		{
			listInformes.setBorder(new TitledBorder(null, "Lista de informes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane.setViewportView(listInformes);
		}
		{
			GridBagConstraints gbc_brnNuevoInforme = new GridBagConstraints();
			gbc_brnNuevoInforme.fill = GridBagConstraints.HORIZONTAL;
			gbc_brnNuevoInforme.insets = new Insets(0, 0, 5, 0);
			gbc_brnNuevoInforme.gridx = 1;
			gbc_brnNuevoInforme.gridy = 0;
			panel.add(brnNuevoInforme, gbc_brnNuevoInforme);
		}
		{
			GridBagConstraints gbc_btnEliminarInforme = new GridBagConstraints();
			gbc_btnEliminarInforme.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnEliminarInforme.insets = new Insets(0, 0, 5, 0);
			gbc_btnEliminarInforme.gridx = 1;
			gbc_btnEliminarInforme.gridy = 1;
			panel.add(btnEliminarInforme, gbc_btnEliminarInforme);
		}
		{
			GridBagConstraints gbc_btnInspeccionar = new GridBagConstraints();
			gbc_btnInspeccionar.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnInspeccionar.insets = new Insets(0, 0, 5, 0);
			gbc_btnInspeccionar.gridx = 1;
			gbc_btnInspeccionar.gridy = 3;
			panel.add(btnInspeccionar, gbc_btnInspeccionar);
		}
		{
			GridBagConstraints gbc_btnSalir = new GridBagConstraints();
			gbc_btnSalir.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnSalir.gridx = 1;
			gbc_btnSalir.gridy = 7;
			panel.add(btnSalir, gbc_btnSalir);
		}
		{
			frame.setJMenuBar(menuBar);
		}
		{
			menuBar.add(mArchivo);
		}
		{
			mArchivo.add(menuItem);
		}
	}

}
