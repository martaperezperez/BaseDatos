
package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class IntroducirDatos {

  PreparedStatement ps =null;
 

   
    public void  insert(int DNI, String Nombre, String Apellido) {
    
        Connection con=null;
        
        try {
    
           con= Conectar.connect();
               ps = (PreparedStatement)con.prepareStatement( "INSERT INTO datos(DNI,Nombre,Apellido) VALUES(?,?,?)"); 
            ps.setInt(1, DNI);
            ps.setString(2, Nombre);
            ps.setString(3, Apellido);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se ha añadido un Alumno");
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }

   
}