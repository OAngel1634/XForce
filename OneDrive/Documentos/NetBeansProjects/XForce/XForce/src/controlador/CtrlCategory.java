package controlador;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import conexion.Conexion;
import modelo.Category;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CtrlCategory {
  
   public boolean guardar(Category objet){
      boolean respuesta = false;
      Connection cn = (Connection) conexion.Conexion.conectar();
      try{
      
          PreparedStatement consulta = cn.prepareStatement("insert into tb_categoria values(?,?,?)");
          consulta.setInt(1, 0);
          consulta.setString(2, objet.getDescripcion());
          consulta.setInt(3, objet.getEstado());
          
          if (consulta.executeUpdate()>0 ){
            respuesta = true;
          }
          
          cn.close();
      }catch (SQLException e){
          System.out.println("Error al guardar:" + e);
      } 
      return respuesta;
   }    
   
 
  
   public boolean existCategory(String category){
      boolean respuesta = false;
      String sql = "select descripcion from tb_categoria where descripcion = '" + category+ "';";
      Statement st;
  
      try{
      
          Connection cn= Conexion.conectar();
          st = cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
              respuesta = true;
          }
      }catch (SQLException e){
          System.out.println("Error al consultar:" + e);
      } 
      return respuesta;
   } 
   }

