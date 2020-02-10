package principal;

import java.util.Date;

import biblioteca.Bibliotecario;
import biblioteca.Boleta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bibliotecario bi=new Bibliotecario();
		Interfaz i1=new Interfaz();
		
		i1.setVisible(true);
		
		Boleta b=new Boleta();
		
		Date d=new Date();
		d.getDate();
		
		b.setNombreUsuario("Juan");
		b.setCedulaUsuario("1234");
		b.setCodigo(4444);
		b.setCodigoBoleta(2);
		b.setNombreLibro("la hormiga");
		b.setFechaEntrega(d);
		b.setFechaPrestamo(d);
		b.setEstado(false);
		
		bi.addBoleta(b);
		
		bi.prestarLibro(b.getCodigo(), b.getCodigoBoleta());
		
		
	}

}
