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
		b.setCedulaUsuario("1545");
		b.setCodigo("3322");
		b.setNombreUsuario("Juan");
		b.setFechaEntrega(d);
		b.setFechaPrestamo(d);
		b.setEstado(true);
		
		System.out.println(bi.buscarLibro("3322").isDisponible());
		
		//bi.prestarLibro("3322", "1545");
		
		bi.prestarLibro("3322", "1545");
		
	}

}
