package modelo;

public class SQLHelper {
	 
	final String tablaLibro="libros";
	final String tablaBoleta="boletas";
   
    //Cambiar consultas
    public String addBoleta() {
    	 return "INSERT INTO "+tablaBoleta+" (codigoBoleta,cedula,nombre,codigo,nombreLibro,fechaPrestamo,fechaEntrega,estado) VALUES (?,?,?,?,?,?);";
    }
    
    public String buscarLibro(String isbn) {

    	return "SELECT * FROM "+tablaLibro+" WHERE codigo = '"+isbn+"';";
    }
    public String prestarLibroTL(String isbn) {
    	 return "UPDATE "+tablaLibro+" SET disponible=0 WHERE codigo= '"+isbn+"';";
    }
    public String prestarLibroTB(String isbn,String cedula) {
   	 return "UPDATE "+tablaBoleta+" SET estado=1 WHERE cedula= '"+cedula+"' AND codigo= '"+isbn+"' ;";
   }
    
    public String devolverLibroTL(String isbn) {
    	return "UPDATE "+tablaLibro+" SET disponible=1 WHERE codigo= '"+isbn+"';";
    }
    public String devolverLibroTB(String isbn,String cedula) {
    	return "UPDATE "+tablaBoleta+" SET estado=0 WHERE cedula= '"+cedula+"' AND codigo='"+isbn+"';";
    }

}
