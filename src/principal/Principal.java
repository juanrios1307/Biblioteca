package principal;

import java.util.Date;

import biblioteca.Bibliotecario;
import biblioteca.Boleta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Bibliotecario bi=new Bibliotecario();
				
				bi.buscarBoleta(1);
				
				bi.buscarLibro(4444);
				
				/*Interfaz i1=new Interfaz(bi.buscarBoleta(1));
				
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
				
				i1.setVisible(true);
				
				
				
				bi.prestarLibro(b.getCodigo(), b.getCodigoBoleta());*/
				
		
	}

}
