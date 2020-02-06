package biblioteca;

import java.util.Date;

public class Boleta {

	private String nombreUsuario;
	private Date fechaPrestamo;
	private Date fechaEntrega;
	private String cedulaUsuario;
	private Ejemplar ejem;
	
	public Boleta(String nombreUsuario, Date fechaPrestamo,Date fechaEntrega,String cedulaUsuario) {
		this.nombreUsuario=nombreUsuario;
		this.fechaPrestamo=fechaPrestamo;
		this.fechaEntrega=fechaEntrega;
		this.cedulaUsuario=cedulaUsuario;
	}
}
