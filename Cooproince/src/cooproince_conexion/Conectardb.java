package cooproince_conexion;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Esneldy
 */
public class Conectardb {
    
    Connection conectar=null; /*Esto es un objeto de Connection*/
    
public Connection conexiondb(){   /*Metodo de la conexion*/
   
    try {   /*Atrapar errores de la BD*/
        //Cargar nuestro driver
        Class.forName("com.mysql.jdbc.Driver");
        conectar=DriverManager.getConnection("jdbc:mysql://localhost/sc_cooproince","cooproince","q123");
        System.out.println("Conexion establecida"); //MOstrar en la consola
        /*JOptionPane.showMessageDialog(null,"Conexion establecida"); //Mostrar Mensaje*/
    
    } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Error de conexion");
        JOptionPane.showMessageDialog(null,"Error de Conexion"+e);
    }
    return conectar;
}
    
    public static void main(String[] args) {
      
    }
    
}
