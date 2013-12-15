package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class practicaIPO1 extends JFrame {
	private final JMenuBar menuBar = new JMenuBar();
	private final JPanel pnlIni = new JPanel();
	private final JMenu mArchivo = new JMenu("Archivo");
	private final JMenu mClientes = new JMenu("Clientes");
	private final JMenu mInformes = new JMenu("Informes");
	private final JMenu mAyuda = new JMenu("Ayuda");
	private final JMenu mNuevo = new JMenu("Nuevo...");
	private final JMenuItem miCliente = new JMenuItem("Cliente");
	private final JMenuItem mntmInforme = new JMenuItem("Informe");
	private final JMenuItem miAbrir = new JMenuItem("Abrir");
	private final JSeparator separator = new JSeparator();
	private final JMenuItem miSalir = new JMenuItem("Salir");
	private final JMenuItem miNuevoInforme = new JMenuItem("Nuevo Informe");
	private final JMenuItem miListaDeInformes = new JMenuItem("Lista de Informes");
	private final JMenuItem miNuevoCliente = new JMenuItem("Nuevo Cliente");
	private final JMenuItem miListaClientes = new JMenuItem("Lista Clientes");
	private final JMenuItem miAccesibilidad = new JMenuItem("Accesibilidad");
	private final JMenuItem miAcercaDe = new JMenuItem("Acerca de...");
	private final JMenuItem miComprobarVersin = new JMenuItem("Comprobar versión");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JLabel lblFotoInicio = new JLabel("");
	private final JLabel lblNombre = new JLabel("FISIOREAL");
	private final JLabel lblDesc = new JLabel("FISIOTERAPIA - CIUDAD REAL");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practicaIPO1 frame = new practicaIPO1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public practicaIPO1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 170);
		getContentPane().setLayout(null);
		{
			pnlIni.setBorder(new LineBorder(new Color(0, 0, 0)));
			pnlIni.setBounds(0, 0, 444, 111);
			getContentPane().add(pnlIni);
		}
		GridBagLayout gbl_pnlIni = new GridBagLayout();
		gbl_pnlIni.columnWidths = new int[]{179, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlIni.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlIni.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlIni.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlIni.setLayout(gbl_pnlIni);
		{
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridheight = 5;
			gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 0;
			scrollPane.setBorder(null);
			pnlIni.add(scrollPane, gbc_scrollPane);
		}
		lblFotoInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoInicio.setIcon(new ImageIcon(practicaIPO1.class.getResource("/presentacion/039.png")));
		scrollPane.setViewportView(lblFotoInicio);
		{
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.gridwidth = 5;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 2;
			gbc_lblNombre.gridy = 1;
			lblNombre.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 16));
			pnlIni.add(lblNombre, gbc_lblNombre);
		}
		{
			GridBagConstraints gbc_lblDesc = new GridBagConstraints();
			gbc_lblDesc.gridwidth = 7;
			gbc_lblDesc.insets = new Insets(0, 0, 5, 5);
			gbc_lblDesc.gridx = 1;
			gbc_lblDesc.gridy = 2;
			lblDesc.setFont(new Font("SansSerif", Font.BOLD, 14));
			pnlIni.add(lblDesc, gbc_lblDesc);
		}
		{
			menuBar.setBorder(new LineBorder(new Color(0, 0, 0)));
			setJMenuBar(menuBar);
		}
		{
			menuBar.add(mArchivo);
		}
		{
			mArchivo.add(mNuevo);
		}
		{
			mNuevo.add(miCliente);
		}
		{
			mNuevo.add(mntmInforme);
		}
		{
			mArchivo.add(miAbrir);
		}
		{
			mArchivo.add(separator);
		}
		{
			mArchivo.add(miSalir);
		}
		{
			menuBar.add(mClientes);
		}
		{
			mClientes.add(miNuevoCliente);
		}
		{
			mClientes.add(miListaClientes);
		}
		{
			menuBar.add(mInformes);
		}
		{
			mInformes.add(miNuevoInforme);
		}
		{
			mInformes.add(miListaDeInformes);
		}
		{
			menuBar.add(mAyuda);
		}
		{
			mAyuda.add(miAccesibilidad);
		}
		{
			mAyuda.add(miComprobarVersin);
		}
		{
			mAyuda.add(miAcercaDe);
		}
	}
}
