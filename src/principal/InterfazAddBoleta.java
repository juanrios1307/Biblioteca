package principal;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InterfazAddBoleta extends JFrame {
	
	public JPanel panel;

	
	public InterfazAddBoleta(){
		this.setSize(500, 380);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Añadir Boleta");
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		
		iniciarComponentes();
		
	}
	
	public void iniciarComponentes() {
		
		colocarPaneles();
		colocarEtiquetas();
		colocarBotones();
		colocarCajasdeTexto();
		
	}
	
	private void colocarPaneles() {
		panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
	}
	private void colocarEtiquetas() {
		
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Préstamo");
		etiqueta.setBounds(150, 5, 200, 60);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,35));
		panel.add(etiqueta);
		
		JLabel etiqueta2=new JLabel();
		etiqueta2.setText("Nombre: ");
		etiqueta2.setBounds(50, 80, 300, 30);
		etiqueta2.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta2);
		
		JLabel etiqueta3=new JLabel();
		etiqueta3.setText("Cédula: ");
		etiqueta3.setBounds(50, 130, 300, 30);
		etiqueta3.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta3);
		
		JLabel etiqueta4=new JLabel();
		etiqueta4.setText("Código del libro: ");
		etiqueta4.setBounds(50, 180, 300, 30);
		etiqueta4.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta4);
		
		JLabel etiqueta5=new JLabel();
		etiqueta5.setText("Fecha de préstamo: ");
		etiqueta5.setBounds(50, 230, 300, 30);
		etiqueta5.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta5);
	}
	private void colocarBotones() {
		JButton boton1 = new JButton();
		boton1.setBounds(100, 280, 300,40);
		boton1.setText("Confirmar");
		boton1.setEnabled(true);
		boton1.setFont(new Font("arial",3,20));
		panel.add(boton1);
	}
	private void colocarCajasdeTexto() {
		JTextField cajaTexto1=new JTextField();
		cajaTexto1.setBounds(270, 80, 170, 30);
		panel.add(cajaTexto1);
		
		JTextField cajaTexto2=new JTextField();
		cajaTexto2.setBounds(270, 130, 170, 30);
		panel.add(cajaTexto2);
		
		JTextField cajaTexto3=new JTextField();
		cajaTexto3.setBounds(270, 180, 170, 30);
		panel.add(cajaTexto3);
		
		JTextField cajaTexto4=new JTextField();
		cajaTexto4.setBounds(270, 230, 170, 30);
		panel.add(cajaTexto4);
	}

}
