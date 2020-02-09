package biblioteca;

import java.util.Date;

public class Boleta {

	private String nombreUsuario;
	private Date fechaPrestamo;
	private Date fechaEntrega;
	private String cedulaUsuario;
	private String codigo;
	private String codigoBoleta;
	private String nombreLibro;
	private boolean estado;
	
	
	
	public String getCodigoBoleta() {
		return codigoBoleta;
	}
	public void setCodigoBoleta(String codigoBoleta) {
		this.codigoBoleta = codigoBoleta;
	}
	public String getNombreLibro() {
		return nombreLibro;
	}
	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getCedulaUsuario() {
		return cedulaUsuario;
	}
	public void setCedulaUsuario(String cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public java.sql.Date convert(Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
	

}
