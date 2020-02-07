package modelo;

public class SQLHelper {
	 
	 
   
    //Cambiar consultas
    public String addBoleta() {
    	 return "INSERT INTO radicadosatisfaccion (radicado,lvlsatisfaccion,repservicio) VALUES (?,?,?);";
    }
    
    public String buscarLibro(String isbn) {
    	return "SELECT * FROM radicadodatos WHERE radicado = '"+isbn+"';";
    }
    public String prestarLibro(String isbn,String cedula) {
    	return "SS";
    }
    public String devolverLibro(String isbn,String cedula) {
    	return "SS";
    }

}
