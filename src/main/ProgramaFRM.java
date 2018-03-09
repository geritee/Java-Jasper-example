/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classDAO.ProductosDAO;
import classDAO.ProveedoresDAO;
import classVO.ProductosVO;
import classVO.ProveedoresVO;
import conexion.ConexionBD;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gerardomartinez
 */
public class ProgramaFRM extends javax.swing.JFrame {

    /**
     * Creates new form ProgramaFRM
     */
    public ProgramaFRM() {
        initComponents();
        cargarProveedores(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        p_clave = new javax.swing.JTextField();
        p_nombre = new javax.swing.JTextField();
        p_direccion = new javax.swing.JTextField();
        p_telefono = new javax.swing.JTextField();
        p_email = new javax.swing.JTextField();
        javax.swing.JButton registrarProveedor = new javax.swing.JButton();
        actualizarProveedor = new javax.swing.JButton();
        buscarProveedor = new javax.swing.JButton();
        eliminarProveedor = new javax.swing.JButton();
        limpiarProveedor = new javax.swing.JButton();
        p_status = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        registrarProducto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        d_clave = new javax.swing.JTextField();
        d_nombre = new javax.swing.JTextField();
        d_existencias = new javax.swing.JTextField();
        d_precioUnitario = new javax.swing.JTextField();
        d_precioVenta = new javax.swing.JTextField();
        actualizarProducto = new javax.swing.JButton();
        buscarProducto = new javax.swing.JButton();
        eliminarProducto = new javax.swing.JButton();
        limpiarProducto = new javax.swing.JButton();
        d_status = new javax.swing.JTextField();
        list_proveedores = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_general = new javax.swing.JTable();
        buscageneral = new javax.swing.JButton();
        JasperReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Telefono");

        jLabel4.setText("Direccion");

        jLabel5.setText("Email");

        p_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_claveActionPerformed(evt);
            }
        });

        p_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_telefonoActionPerformed(evt);
            }
        });

        registrarProveedor.setText("registrar");
        registrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProveedorActionPerformed(evt);
            }
        });

        actualizarProveedor.setText("actualizar");
        actualizarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarProveedorActionPerformed(evt);
            }
        });

        buscarProveedor.setText("buscar");
        buscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProveedorActionPerformed(evt);
            }
        });

        eliminarProveedor.setText("eliminar");
        eliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProveedorActionPerformed(evt);
            }
        });

        limpiarProveedor.setText("limpiar todo");
        limpiarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_nombre)
                            .addComponent(p_telefono)
                            .addComponent(p_direccion)
                            .addComponent(p_email, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(p_status, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(registrarProveedor)
                                .addGap(33, 33, 33)
                                .addComponent(actualizarProveedor)
                                .addGap(28, 28, 28)
                                .addComponent(buscarProveedor)
                                .addGap(48, 48, 48)
                                .addComponent(eliminarProveedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(limpiarProveedor)))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(p_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(p_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(p_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(p_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(p_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(p_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarProveedor)
                    .addComponent(actualizarProveedor)
                    .addComponent(buscarProveedor)
                    .addComponent(eliminarProveedor)
                    .addComponent(limpiarProveedor))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proveedores", jPanel1);

        registrarProducto.setText("Registrar");
        registrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProductoActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        jLabel7.setText("Nombre");

        jLabel8.setText("Existencias");

        jLabel9.setText("Precio Unitario");

        jLabel10.setText("Precio Venta");

        jLabel11.setText("Proveedor");

        d_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_claveActionPerformed(evt);
            }
        });

        actualizarProducto.setText("Actualizar");
        actualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarProductoActionPerformed(evt);
            }
        });

        buscarProducto.setText("Buscar");
        buscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProductoActionPerformed(evt);
            }
        });

        eliminarProducto.setText("Eliminar");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });

        limpiarProducto.setText("Limpiar Todo");
        limpiarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_nombre)
                            .addComponent(d_existencias)
                            .addComponent(d_precioUnitario)
                            .addComponent(d_precioVenta)
                            .addComponent(list_proveedores, 0, 262, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d_status, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(registrarProducto)
                                .addGap(30, 30, 30)
                                .addComponent(actualizarProducto)
                                .addGap(35, 35, 35)
                                .addComponent(buscarProducto)
                                .addGap(44, 44, 44)
                                .addComponent(eliminarProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(limpiarProducto)))
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(d_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(d_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(d_existencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(d_precioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(d_precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(list_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(d_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarProducto)
                    .addComponent(actualizarProducto)
                    .addComponent(buscarProducto)
                    .addComponent(eliminarProducto)
                    .addComponent(limpiarProducto))
                .addGap(71, 71, 71))
        );

        jTabbedPane1.addTab("Productos", jPanel2);

        jScrollPane1.setViewportView(tabla_general);

        buscageneral.setText("Buscar Todo");
        buscageneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscageneralActionPerformed(evt);
            }
        });

        JasperReport.setText("Jasper Report");
        JasperReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JasperReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(buscageneral)
                .addGap(48, 48, 48)
                .addComponent(JasperReport)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscageneral)
                    .addComponent(JasperReport))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabla Productos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_telefonoActionPerformed

    private void registrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProveedorActionPerformed
        ProveedoresVO prov = new ProveedoresVO();
        prov.setNombre(p_nombre.getText());
        prov.setTelefono(p_telefono.getText());
        prov.setDireccion(p_direccion.getText());
        prov.setEmail(p_email.getText());
        String resp = ProveedoresDAO.registrarProveedores(prov);
        p_status.setText(resp);
        p_nombre.setText("");
        p_telefono.setText("");
        p_direccion.setText("");
        p_email.setText("");
        cargarProveedores(0);
    }//GEN-LAST:event_registrarProveedorActionPerformed

    private void actualizarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProveedorActionPerformed
        ProveedoresVO prov = new ProveedoresVO();
        prov.setId_proveedor(Integer.parseInt(p_clave.getText()));
        prov.setNombre(p_nombre.getText());
        prov.setTelefono(p_telefono.getText());
        prov.setDireccion(p_direccion.getText());
        prov.setEmail(p_email.getText());
        String resp = ProveedoresDAO.actualizarProveedores(prov);
        p_status.setText(resp);
        p_clave.setText("");
        p_nombre.setText("");
        p_telefono.setText("");
        p_direccion.setText("");
        p_email.setText("");
        cargarProveedores(0);
    }//GEN-LAST:event_actualizarProveedorActionPerformed

    private void buscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProveedorActionPerformed
        ProveedoresVO prov = ProveedoresDAO.buscarProveedores(p_clave.getText());
        p_clave.setText(prov.getId_proveedor()+"");
        p_nombre.setText(prov.getNombre());
        p_telefono.setText(prov.getTelefono());
        p_direccion.setText(prov.getDireccion());
        p_email.setText(prov.getEmail());
        p_status.setText(prov.getResultado());
    }//GEN-LAST:event_buscarProveedorActionPerformed

    private void eliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProveedorActionPerformed
        String resp = ProveedoresDAO.eliminarProveedores(p_clave.getText());
        p_status.setText(resp);
        p_clave.setText("");
        p_nombre.setText("");
        p_telefono.setText("");
        p_direccion.setText("");
        p_email.setText("");
        cargarProveedores(0);
    }//GEN-LAST:event_eliminarProveedorActionPerformed

    private void limpiarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarProveedorActionPerformed
        p_status.setText("");
        p_clave.setText("");
        p_nombre.setText("");
        p_telefono.setText("");
        p_direccion.setText("");
        p_email.setText("");
    }//GEN-LAST:event_limpiarProveedorActionPerformed

    private void registrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProductoActionPerformed
        ProveedoresVO d = (ProveedoresVO) list_proveedores.getSelectedItem();
        ProductosVO producto = new ProductosVO();
        Integer p_productos = d.getId_proveedor();
        producto.setNombre(d_nombre.getText());
        producto.setExistencias(Integer.parseInt(d_existencias.getText()));
        producto.setPrecioUnitario(Double.parseDouble(d_precioUnitario.getText()));
        producto.setPrecioVenta(Double.parseDouble(d_precioVenta.getText()));
        producto.setId_proveedor(p_productos);
        String resp = ProductosDAO.registrarProducto(producto);
        d_clave.setText("");
        d_nombre.setText("");
        d_existencias.setText("");
        d_precioUnitario.setText("");
        d_precioVenta.setText("");
        d_status.setText(resp);
        cargarProveedores(0);
    }//GEN-LAST:event_registrarProductoActionPerformed

    private void buscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProductoActionPerformed
        ProductosVO producto = ProductosDAO.buscarProducto(d_clave.getText());
        d_clave.setText(producto.getId_producto()+"");
        d_nombre.setText(producto.getNombre());
        d_existencias.setText(producto.getExistencias()+"");
        d_precioUnitario.setText(producto.getPrecioUnitario()+"");
        d_precioVenta.setText(producto.getPrecioVenta()+"");
        d_status.setText(producto.getResultado());
        cargarProveedores(producto.getId_proveedor());
    }//GEN-LAST:event_buscarProductoActionPerformed

    private void limpiarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarProductoActionPerformed
        d_clave.setText("");
        d_nombre.setText("");
        d_existencias.setText("");
        d_precioUnitario.setText("");
        d_precioVenta.setText("");
        cargarProveedores(0);
    }//GEN-LAST:event_limpiarProductoActionPerformed

    private void actualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProductoActionPerformed
        ProveedoresVO d = (ProveedoresVO) list_proveedores.getSelectedItem();
        ProductosVO producto = new ProductosVO();
        Integer p_disc = d.getId_proveedor();
        producto.setId_producto(Integer.parseInt(d_clave.getText()));
        producto.setNombre(d_nombre.getText());
        producto.setExistencias(Integer.parseInt(d_existencias.getText()));
        producto.setPrecioUnitario(Double.parseDouble(d_precioUnitario.getText()));
        producto.setPrecioVenta(Double.parseDouble(d_precioVenta.getText()));
        producto.setId_proveedor(p_disc);
        String resp = ProductosDAO.registrarProducto(producto);
        d_clave.setText("");
        d_nombre.setText("");
        d_existencias.setText("");
        d_precioUnitario.setText("");
        d_precioVenta.setText("");
        d_status.setText(resp);
        cargarProveedores(0);
    }//GEN-LAST:event_actualizarProductoActionPerformed

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed
        String resp = ProductosDAO.eliminarProducto(d_clave.getText());
        d_clave.setText("");
        d_nombre.setText("");
        d_existencias.setText("");
        d_precioUnitario.setText("");
        d_precioVenta.setText("");
        d_status.setText(resp);
        cargarProveedores(0);
    }//GEN-LAST:event_eliminarProductoActionPerformed

    private void buscageneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscageneralActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Existencias");
        modelo.addColumn("PrecioVenta");
        tabla_general.setModel(modelo);
        Object[] arrProd = new Object[4];
        for(ProductosVO disc: ProductosDAO.getListProductos()){
            arrProd[0] = disc.getId_producto();
            arrProd[1] = disc.getNombre();
            arrProd[2] = disc.getExistencias();
            arrProd[3] = disc.getPrecioVenta();
            modelo.addRow(arrProd);
        }
        tabla_general.setModel(modelo);
    }//GEN-LAST:event_buscageneralActionPerformed

    private void p_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_claveActionPerformed

    private void JasperReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JasperReportActionPerformed
        // TODO add your handling code here:
        ConexionBD reporte = new ConexionBD();
        reporte.mostrarJasper(Integer.parseInt(this.d_clave.getText()));
    }//GEN-LAST:event_JasperReportActionPerformed

    private void d_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_claveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramaFRM().setVisible(true);
            }
        });
    }
    
    public void cargarProveedores(int busca){
        int index = 1;
        list_proveedores.removeAllItems();
        list_proveedores.addItem("Selecciona un proveedor");
        for(ProveedoresVO prov: ProveedoresDAO.getListProveedores()){
            list_proveedores.addItem(prov);
            if(prov.getId_proveedor() == busca){
                list_proveedores.setSelectedIndex(index);
            }
            index++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JasperReport;
    private javax.swing.JButton actualizarProducto;
    private javax.swing.JButton actualizarProveedor;
    private javax.swing.JButton buscageneral;
    private javax.swing.JButton buscarProducto;
    private javax.swing.JButton buscarProveedor;
    private javax.swing.JTextField d_clave;
    private javax.swing.JTextField d_existencias;
    private javax.swing.JTextField d_nombre;
    private javax.swing.JTextField d_precioUnitario;
    private javax.swing.JTextField d_precioVenta;
    private javax.swing.JTextField d_status;
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JButton eliminarProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiarProducto;
    private javax.swing.JButton limpiarProveedor;
    private javax.swing.JComboBox list_proveedores;
    private javax.swing.JTextField p_clave;
    private javax.swing.JTextField p_direccion;
    private javax.swing.JTextField p_email;
    private javax.swing.JTextField p_nombre;
    private javax.swing.JTextField p_status;
    private javax.swing.JTextField p_telefono;
    private javax.swing.JButton registrarProducto;
    private javax.swing.JTable tabla_general;
    // End of variables declaration//GEN-END:variables
}
