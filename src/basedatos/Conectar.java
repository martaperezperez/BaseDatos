package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

 
public class Conectar {
   
   
    public static  Connection connect()  {
        Connection con = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basedatos";
            // create a connection to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url,"root","20033007mpp.");
            
            System.out.println("Conexion= True");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion= False");
            System.out.println("Conexion= False");
        } 
   return con;
    }
}

