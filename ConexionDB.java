
import java.sql.*;

public class ConexionDB {

    //libreria de mysql
    public String driver = "com.mysql.jdbc.Driver";
    //nombre de la base de datos
    public String database = "ejemplo_crud";
    //host
    public String hostname = "localhost";
    //puerto
    public String port = "3306";
    //ruta de nuestra base de datos (desasctivamos el uso de SSL
    public String URL = "jdbc:mysql://"+ hostname + ":" +port+"/"+ database + "?useSSL=false";
    //nombre de usuario
    public String username = "root";
    //clave
    public String password = "0401";
    
    public Connection conectarMySQL(){
        Connection conn = null;

        try{
            Class.forName(driver);
            conn= DriverManager.getConnection( URL , username, password);
            System.out.println("se establecio conexion");
                
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion");
            e.printStackTrace();
        }
        return conn;
    }
}