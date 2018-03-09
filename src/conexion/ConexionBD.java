package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gerardomartinez
 */
public class ConexionBD {
    Connection conectar = null;
    public ConexionBD(){
        try{
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection("jdbc:postgresql://localhost:5431/jasper",
            "java", "conector");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public Connection getConnection(){
        return conectar;
    }
    public void desconectar(){
        conectar = null;
    }
}
