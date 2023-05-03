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
import com.toedter.calendar.JCalendar;
import javax.swing.JCheckBox;

public class AdminReservar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtCorreo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminReservar frame = new AdminReservar();
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
	public AdminReservar() {
		setFont(new Font("Times New Roman", Font.PLAIN, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 59, 620, 555);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtNombre.setBounds(275, 32, 248, 30);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtApellidos.setBounds(275, 84, 248, 30);
		panel.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTelefono.setBounds(275, 145, 248, 30);
		panel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtCorreo.setBounds(275, 199, 248, 30);
		panel.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JCalendar calendarioIngreso = new JCalendar();
		calendarioIngreso.setBounds(58, 292, 184, 153);
		panel.add(calendarioIngreso);
		
		JCalendar calendarioSalida = new JCalendar();
		calendarioSalida.setBounds(339, 292, 184, 153);
		panel.add(calendarioSalida);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(58, 42, 152, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(58, 84, 152, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(58, 145, 152, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(58, 199, 152, 30);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fecha de Salida");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(387, 251, 152, 30);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Fecha de Ingreso");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(86, 251, 152, 30);
		panel.add(lblNewLabel_3_2);
		
		JCheckBox chbReservar = new JCheckBox("Reservacion indefinida");
		chbReservar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		chbReservar.setBounds(339, 452, 215, 23);
		panel.add(chbReservar);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReservar.setBounds(143, 502, 296, 30);
		panel.add(btnReservar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 620, 37);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Reservacion");
		lblNewLabel_4.setBounds(241, 0, 134, 30);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		panel_1.add(lblNewLabel_4);
	}
}
