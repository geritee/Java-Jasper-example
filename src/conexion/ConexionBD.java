package conexion;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

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
    public void mostrarJasper(int clave){
        try{
            JasperReport report = JasperCompileManager.compileReport(System.getProperty("user.dir")+"\\report1.jrxml");
            Map parametro = new HashMap();
            parametro.put("clave", clave);
            JasperPrint print = JasperFillManager.fillReport(report, parametro, conectar);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Mi reporte");
            view.setExtendedState(Frame.MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
