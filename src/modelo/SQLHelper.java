package modelo;

public class SQLHelper {
	 
	final String tablaLibro="libros";
	final String tablaBoleta="boletas";
   
    //Cambiar consultas
    public String addBoleta() {
    	 return "INSERT INTO "+tablaBoleta+" (cedula,nombre,codigo,fechaPrestamo,fechaEntrega,estado) VALUES (?,?,?,?,?,?);";
    }
    
    public String buscarLibro(String isbn) {

    	return "SELECT * FROM "+tablaLibro+" WHERE codigo = '"+isbn+"';";
    }
    public String prestarLibro(String isbn,String cedula) {
    	 return "UPDATE FROM "+tablaLibro+" SET disponible=0 WHERE codigo= '"+isbn+"'; UPDATE FROM "+tablaBoleta+" SET estado=1 WHERE cedula= '"+cedula+"' AND codigo='"+isbn+"';";
    }
    public String devolverLibro(String isbn,String cedula) {
    	return "UPDATE FROM "+tablaLibro+" SET disponible=1 WHERE codigo= '"+isbn+"'; UPDATE FROM "+tablaBoleta+" SET estado=0 WHERE cedula= '"+cedula+"' AND codigo='"+isbn+"';";
    }
 

}
