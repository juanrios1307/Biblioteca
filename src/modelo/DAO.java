package modelo;

import utilidades.*;
import java.sql.*;

import biblioteca.Boleta;
import biblioteca.Libro;

public class DAO {
    ConexionBD con=new ConexionBD();
    Libro libro=new Libro();
    SQLHelper sql=new SQLHelper();
    
    //Realizar metodos pertinentes y borrar lo que no sirve
    public boolean addBoleta(Boleta b) {
    	try {
            PreparedStatement stm= con.getCon().prepareStatement(sql.addBoleta());
            
            stm.setString(1, b.getCedulaUsuario());
            stm.setString(2, b.getNombreUsuario());
            stm.setString(3, b.getCodigo());
            stm.setDate(4,  b.convert(b.getFechaPrestamo()));
            stm.setDate(5, b.convert(b.getFechaEntrega()));
            stm.setBoolean(6, b.isEstado());
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
   
   
    
    
    public Libro buscarLibro(String isbn) {
    	 try {
             
             PreparedStatement stm= con.getCon().prepareStatement(sql.buscarLibro(isbn));
             ResultSet rs=stm.executeQuery();
             
             while(rs.next()){
                 libro.setCodigo(rs.getString(1));
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
    
    
    public boolean prestarLibro(String isbn,String cedula) {
    	try {
    		System.out.println("libro;: "+libro.isDisponible());
            if(libro.isDisponible()) {
            	 PreparedStatement stm= con.getCon().prepareStatement(sql.prestarLibro(isbn,cedula));
                 ResultSet rs=stm.executeQuery();
                 
                 stm.setBoolean(5, libro.isDisponible());
                 
             
                 stm.executeUpdate();
                 System.out.println("Se actualizó correctamente el registro");
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
    
 
    public boolean devolverLibro(String isbn,String cedula) {
    		try {
            
            PreparedStatement stm= con.getCon().prepareStatement(sql.devolverLibro(isbn,cedula));
            ResultSet rs=stm.executeQuery();
            
            stm.setBoolean(5, libro.isDisponible());
            
            System.out.println("Se actualizó correctamente el registro");
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
    

