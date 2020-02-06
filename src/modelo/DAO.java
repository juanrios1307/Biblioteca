package modelo;

import utilidades.*;
import java.sql.*;

public class DAO {
    ConexionBD con=new ConexionBD();
    Cliente client=new Cliente();
    SQLHelper sql=new SQLHelper();
    
    //Realizar metodos pertinentes y borrar lo que no sirve
    
    
    
    //buscar 1 persona en BD
    public Cliente buscarRadicado(String documento){
        try {
            
            PreparedStatement stm= con.getCon().prepareStatement(sql.buscarPersona(documento));
            ResultSet rs=stm.executeQuery();
            
           
            
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

    //metodo guardar 1 registro en bd
    public String registrarRadicado(Cliente client){
        try {
            
             PreparedStatement stm= con.getCon().prepareStatement(sql.guardarRadicadoSatisfaccion());
             
             
             
        } catch (Exception e) {
            System.err.println("Error al guardar registro: "+e.getMessage());
        }finally{
            try {
                con.cerrarBD();
            } catch (Exception e) {
            }
        }
        return "Hubo un error, intente mas tarde";
    }//cerrar guardar
    
    
}
