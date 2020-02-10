package modelo;

import utilidades.*;
import java.sql.*;

import biblioteca.Boleta;
import biblioteca.Libro;

public class DAO {
    private ConexionBD con=new ConexionBD();
    private Libro libro=new Libro();
    private Boleta boleta=new Boleta();
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
   }//cerrar guardar boleta
   
   
    
    
    public Libro buscarLibro(int isbn) {
    	 try {
             System.out.println(sql.buscarLibro(isbn));
             PreparedStatement stm= con.getCon().prepareStatement(sql.buscarLibro(isbn));
             ResultSet rs=stm.executeQuery();
             
             while(rs.next()){
                 
                 libro.setNombre(rs.getString(1));
                 libro.setAutor(rs.getString(2));
                 libro.setCodigo(rs.getInt(3));
                 libro.setEdicion(rs.getString(4));
                 libro.setDisponible(rs.getBoolean(5));
                 System.out.println("Libro encontrado");
                 return libro;
             }
             System.out.println("Libro encontrado 2");
             
         } catch (Exception e) {
             System.err.println("Error al buscar registro: "+e.getMessage());
         }finally{
             try {
                 con.cerrarBD();
             } catch (Exception e) {
             }
         }
         return null;
     	}//cierro buscar 1 libro
    
    public Boleta buscarBoleta(int codBoleta) {
   	 try {
            System.out.println(sql.buscarBoleta(codBoleta));
            PreparedStatement stm= con.getCon().prepareStatement(sql.buscarBoleta(codBoleta));
            ResultSet rs=stm.executeQuery();
            
            while(rs.next()){
                
                boleta.setNombreUsuario(rs.getString(1));
                boleta.setCedulaUsuario(rs.getString(2));
                boleta.setCodigo(rs.getInt(3));
                boleta.setCodigoBoleta(rs.getInt(4));
                boleta.setNombreLibro(rs.getString(5));
                boleta.setFechaEntrega(rs.getDate(6));
                boleta.setFechaPrestamo(rs.getDate(7));
                boleta.setEstado(rs.getBoolean(8));
                
                System.out.println("Boleta Encontrada");
                return boleta;
            }
            System.out.println("Boleta Encontrada 2");
            
        } catch (Exception e) {
            System.err.println("Error al buscar registro: "+e.getMessage());
        }finally{
            try {
                con.cerrarBD();
            } catch (Exception e) {
            }
        }
        return null;
    	}//cierro buscar 1 boleta
    
    
    public boolean prestarLibro(int isbn,int codigoBoleta) {
    	try {
    		System.out.println("libro;: "+buscarLibro(isbn).isDisponible());
            if(buscarLibro(isbn).isDisponible()) {
            	 PreparedStatement stmL= con.getCon().prepareStatement(sql.prestarLibroTL(isbn));
                 
             
                 stmL.executeUpdate();
                 
                 PreparedStatement stmB=con.getCon().prepareStatement(sql.prestarLibroTB(isbn,codigoBoleta));
                 
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
    
 
    public boolean devolverLibro(int isbn,int codigoBoleta) {
    		try {
            
            PreparedStatement stmL= con.getCon().prepareStatement(sql.devolverLibroTL(isbn));
            stmL.executeUpdate();
            
            PreparedStatement stmB= con.getCon().prepareStatement(sql.devolverLibroTB(isbn,codigoBoleta));
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
    	}//cierro devolver

     
}
    

