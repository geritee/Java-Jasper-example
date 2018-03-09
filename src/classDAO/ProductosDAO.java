package classDAO;

import classVO.ProductosVO;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author gerardomartinez
 */
public class ProductosDAO {
     public static String registrarProducto(ProductosVO productoVO) {
        String result = null, last = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO productos VALUES(null,?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1, productoVO.getNombre());
                pst.setInt(2, productoVO.getExistencias());
                pst.setDouble(3, productoVO.getPrecioUnitario());
                pst.setDouble(4, productoVO.getPrecioVenta());
                pst.setInt(5, productoVO.getId_proveedor());
                pst.executeUpdate();
                pst = cn.prepareStatement("SELECT MAX(id_producto) AS id FROM productos");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    last = rs.getString(1);
                }
                result = "Producto registrado con exito, ID: " + last;
            }
        } catch (SQLException e) {
            result = "Error durante el registro: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }

    public static String actualizarProducto(ProductosVO productoVO) {
        String result = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE productos SET nombre=?,existencias=?,precioUnitario=?,precioVenta=?,id_proveedor=? WHERE id_producto=?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1, productoVO.getNombre());
                pst.setInt(2, productoVO.getExistencias());
                pst.setDouble(3, productoVO.getPrecioUnitario());
                pst.setDouble(4, productoVO.getPrecioVenta());
                pst.setInt(5, productoVO.getId_proveedor());
                pst.setInt(6, productoVO.getId_producto());
                pst.executeUpdate();
                result = "Producto Actualizado con exito, ID: " + productoVO.getId_producto();
            }
        } catch (SQLException e) {
            result = "Error durante el registro: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }

    public static ProductosVO buscarProducto(String clave) {
        ProductosVO productoVO = new ProductosVO();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM productos WHERE id_producto = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(clave));
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    productoVO.setId_producto(Integer.parseInt(rs.getString(1)));
                    productoVO.setNombre(rs.getString(2));
                    productoVO.setExistencias(rs.getInt(3));
                    productoVO.setPrecioUnitario(Double.parseDouble(rs.getString(4)));
                    productoVO.setPrecioVenta(Double.parseDouble(rs.getString(5)));
                    productoVO.setId_proveedor(Integer.parseInt(rs.getString(6)));
                }
                productoVO.setResultado("Busqueda exitosa");
            }
        } catch (SQLException e) {
            productoVO.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                productoVO.setResultado("Error " + e);
            }
        }
        return productoVO;
    }
    
    public static String eliminarProducto(String clave) {
        String result = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "DELETE FROM productos WHERE id_producto = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(clave));
                pst.executeUpdate();
                result = "Producto eliminado con exito";
            }
        } catch (SQLException e) {
            result = "Error en la consulta: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }
    
    public static ArrayList<ProductosVO> getListProductos(){
        ArrayList<ProductosVO> arrProductos = new ArrayList<ProductosVO>();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        ProductosVO productoVO = null;
        String sql = "SELECT * FROM productos";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                    productoVO = new ProductosVO();
                    productoVO.setId_producto(Integer.parseInt(rs.getString(1)));
                    productoVO.setNombre(rs.getString(2));
                    productoVO.setExistencias(rs.getInt(3));
                    productoVO.setPrecioVenta(Double.parseDouble(rs.getString(5)));
                    arrProductos.add(productoVO);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        }
        return arrProductos;
    }
}
