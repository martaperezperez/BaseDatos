
package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class BorrarDatos {
    
    PreparedStatement ps =null;
    public void  borrarDatos(int DNI) {
        
        Connection con=null;
        try {
       
       con= Conectar.connect();
         ps = (PreparedStatement)con.prepareStatement("DELETE FROM datos where DNI=?"); 
         ps.setInt(1, DNI);
         ps.execute();
        JOptionPane.showMessageDialog(null, "Fila borrada con Exito");
        con.close();
        
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
      
}
    }

