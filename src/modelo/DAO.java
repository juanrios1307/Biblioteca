package modelo;

import utilidades.*;
import java.sql.*;

import biblioteca.Boleta;
import biblioteca.Libro;

public class DAO {
    private ConexionBD con=new ConexionBD();
    private Libro libro=new Libro();
    private SQLHelper sql=new SQLHelper();
    
    //Realizar metodos pertinentes y borrar lo que no sirve
    public boolean addBoleta(Boleta b) {
    	try {
            PreparedStatement stm= con.getCon().prepareStatement(sql.addBoleta());
            
            stm.setString(1, b.getNombreUsuario());
            stm.setString(2, b.getCedulaUsuario());
            stm.setInt(3, b.getCodigo());
            stm.setInt(4, b.getCodigoBoleta());
            stm.setString(5, b.getNombreLibro());
            stm.setDate(6,  b.convert(b.getFechaPrestamo()));
            stm.setDate(7, b.convert(b.getFechaEntrega()));
            stm.setBoolean(8, b.isEstado());
            stm.execute();
            System.out.println("Registro exitoso");
            
            return true;
            
       } catch (Exception e) {
           System.err.println("Error al guardar registro: "+e.getMessage());
       }finally{
           try {
               con.cerrarBD();
           } catch (Exception e) {
           }
       }
       return false;
   }//cerrar guardar
   
   
    
    
    public Libro buscarLibro(int isbn) {
    	 try {
             
             PreparedStatement stm= con.getCon().prepareStatement(sql.buscarLibro(isbn));
             ResultSet rs=stm.executeQuery();
             
             while(rs.next()){
                 libro.setCodigo(rs.getInt(1));
                 libro.setNombre(rs.getString(2));
                 libro.setAutor(rs.getString(3));
                 libro.setEdicion(rs.getString(4));
                 libro.setDisponible(rs.getBoolean(5));
                 return libro;
             }
             
         } catch (Exception e) {
             System.err.println("Error al buscar registro: "+e.getMessage());
         }finally{
             try {
                 con.cerrarBD();
             } catch (Exception e) {
             }
         }
         return null;
     	}//cierro buscar 1 persona
    
    
    public boolean prestarLibro(int isbn,int cedula) {
    	try {
    		System.out.println("libro;: "+buscarLibro(isbn).isDisponible());
            if(buscarLibro(isbn).isDisponible()) {
            	 PreparedStatement stmL= con.getCon().prepareStatement(sql.prestarLibroTL(isbn));
                 
             
                 stmL.executeUpdate();
                 
                 PreparedStatement stmB=con.getCon().prepareStatement(sql.prestarLibroTB(isbn,cedula));
                 
                 stmB.executeUpdate();
                 
                 System.out.println("Se actualizo correctamente el registro"+buscarLibro(isbn).isDisponible());
                 return true;
            }
             
        } catch (Exception e) {
            System.err.println("Error al prestar registro: "+e.getMessage());
        }finally{
            try {
                con.cerrarBD();
            } catch (Exception e) {
            }
        }

        return false;
    	}//cierro prestar
    
 
    public boolean devolverLibro(int isbn,int cedula) {
    		try {
            
            PreparedStatement stmL= con.getCon().prepareStatement(sql.devolverLibroTL(isbn));
            stmL.executeUpdate();
            
            PreparedStatement stmB= con.getCon().prepareStatement(sql.devolverLibroTB(isbn,cedula));
            stmB.executeUpdate();
            
            System.out.println("Se actualizo correctamente el registro");
            return true;
           
            
        } catch (Exception e) {
            System.err.println("Error al devolver registro: "+e.getMessage());
        }finally{
            try {
                con.cerrarBD();
            } catch (Exception e) {
            }
        }
        return false;
    	}//cierro prestar

     
}
    

