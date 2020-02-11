package principal;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class InterfazMostrarLibro extends JFrame{
	
	public JPanel panel;
	
	public InterfazMostrarLibro() {
		this.setSize(500, 380);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Detalles Libro");
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		
		iniciarComponentes(l1);
	}
	
	Libro l1=new Libro();
	
	private void iniciarComponentes(Libro l1) {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Detalles Libro");
		etiqueta.setBounds(85, 10, 300, 80);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,35));
		panel.add(etiqueta);
		
		JLabel etiqueta2=new JLabel();
		etiqueta2.setText("Nombre: "+l1.getNombre());
		etiqueta2.setBounds(50, 80, 300, 30);
		etiqueta2.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta2);
		
		JLabel etiqueta3=new JLabel();
		etiqueta3.setText("Autor: "+l1.getAutor());
		etiqueta3.setBounds(50, 130, 300, 30);
		etiqueta3.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta3);
		
		JLabel etiqueta4=new JLabel();
		etiqueta4.setText("ISBN: "+l1.getCodigo());
		etiqueta4.setBounds(50, 180, 300, 30);
		etiqueta4.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta4);
		
		JLabel etiqueta5=new JLabel();
		etiqueta5.setText("Edición: "+l1.getEdicion());
		etiqueta5.setBounds(50, 230, 300, 30);
		etiqueta5.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta5);
		
		JLabel etiqueta8=new JLabel();
		etiqueta8.setText("Disponible: "+l1.isDisponible());
		etiqueta8.setBounds(50, 280, 300, 30);
		etiqueta8.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta8);
		
		
	}

}
