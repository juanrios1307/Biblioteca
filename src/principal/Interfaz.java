package principal;

import javax.swing.JFrame;

public class Interfaz extends JFrame {
	
	public Interfaz() {
		this.setSize(500, 380);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Boleta");
		//this.setLocation(400, 150);
		//this.setBounds(400, 150, 500,500);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		
		iniciarComponentes();
	}
	
	Boleta b1=new Boleta();
	
	private void iniciarComponentes() {
		JPanel panel=new JPanel();
		//panel.setBackground(Color.green);
		panel.setLayout(null);
		this.getContentPane().add(panel);
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Boleta");
		etiqueta.setBounds(85, 10, 300, 80);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,35));
		panel.add(etiqueta);
		
		JLabel etiqueta2=new JLabel();
		etiqueta2.setText("Libro: "+b1.getNombreLibro());
		etiqueta2.setBounds(50, 80, 300, 30);
		etiqueta2.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta2);
		
		JLabel etiqueta3=new JLabel();
		etiqueta3.setText("Codigo de la Boleta: "+b1.getCodigoBoleta());
		etiqueta3.setBounds(50, 110, 300, 30);
		etiqueta3.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta3);
		
		JLabel etiqueta4=new JLabel();
		etiqueta4.setText("ISBN: "+b1.getCodigo());
		etiqueta4.setBounds(50, 140, 300, 30);
		etiqueta4.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta4);
		
		JLabel etiqueta5=new JLabel();
		etiqueta5.setText("Nombre: "+b1.getNombreUsuario());
		etiqueta5.setBounds(50, 170, 300, 30);
		etiqueta5.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta5);
		
		JLabel etiqueta8=new JLabel();
		etiqueta8.setText("Cedula: "+b1.getCedulaUsuario());
		etiqueta8.setBounds(50, 200, 300, 30);
		etiqueta8.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta8);
		
		JLabel etiqueta6=new JLabel();
		etiqueta6.setText("Fecha de prestamo: "+b1.getFechaPrestamo());
		etiqueta6.setBounds(50, 230, 300, 30);
		etiqueta6.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta6);
		
		JLabel etiqueta7=new JLabel();
		etiqueta7.setText("Fecha de entrega: "+b1.getFechaEntrega());
		etiqueta7.setBounds(50, 260, 300, 30);
		etiqueta7.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta7);
	}

}
