package universidadULP.AccesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author MaRio
 */
public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "db_ulp";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Connection connection;
    
    private Conexion(){}
    
    public static Connection getConnection(){
    
        if(connection == null){
        
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                
                connection = DriverManager
                        .getConnection(URL+DB, USER, PASSWORD);
                System.out.println("Conectado a la base de datos!");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers" + ex.getMessage() );
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarce a la Base de datos" + ex.getMessage() );
            }             
        }
        return connection;  
    }
    
}
