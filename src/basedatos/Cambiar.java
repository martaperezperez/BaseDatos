
package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
        
public class Cambiar {
     PreparedStatement ps =null;
    public void Modificar( int DNI, String Nombre, String Apellido) {
        Connection con=null;
        try {
          
           con= Conectar.connect();
            ps = (PreparedStatement)con.prepareStatement("UPDATE datos SET DNI=?, Nombre=?, Apellido=? where DNI=?");
           ps.setInt(1, DNI);
            ps.setString(2, Nombre);
            ps.setString(3, Apellido);
            ps.setInt(4, DNI);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado un alumno con exito!");
             con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }

   
}
