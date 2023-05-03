package com.alura.jdbc.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class AdminRegistrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCorreo;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminRegistrar frame = new AdminRegistrar();
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
	public AdminRegistrar() {
		setFont(new Font("Times New Roman", Font.PLAIN, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 625, 34);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administrador");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel.setBounds(216, 0, 290, 34);
		panel.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 50, 625, 392);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Listado de Admin", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Registrar Admin", null, panel_2, null);
		panel_2.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtNombre.setBounds(223, 51, 191, 30);
		panel_2.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtApellido.setColumns(10);
		txtApellido.setBounds(223, 98, 191, 30);
		panel_2.add(txtApellido);
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(223, 139, 191, 30);
		panel_2.add(txtCorreo);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtPassword.setBounds(223, 180, 191, 30);
		panel_2.add(txtPassword);
		
		JComboBox cmbTipoPuesto = new JComboBox();
		cmbTipoPuesto.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cmbTipoPuesto.setBounds(223, 221, 191, 32);
		panel_2.add(cmbTipoPuesto);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAceptar.setBounds(267, 307, 116, 30);
		panel_2.add(btnAceptar);
	}
}
