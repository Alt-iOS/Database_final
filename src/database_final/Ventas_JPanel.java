/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package database_final;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.*;
/**
 *
 * @author victor
 */
public class Ventas_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form Ventas_JPanel
     */
    public Ventas_JPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_IdVenta = new javax.swing.JLabel();
        jLabel_productModel = new javax.swing.JLabel();
        jLabel_idEmpleado = new javax.swing.JLabel();
        jLabel_idCliente = new javax.swing.JLabel();
        jTextField_idVenta = new javax.swing.JTextField();
        jTextField_modeloProduct = new javax.swing.JTextField();
        jTextField_idEmpleado = new javax.swing.JTextField();
        jTextField_idCliente = new javax.swing.JTextField();
        jTextField_cantidad = new javax.swing.JTextField();
        jTextField_idSucursal = new javax.swing.JTextField();
        jLabel_IdVenta1 = new javax.swing.JLabel();
        jLabel_productModel1 = new javax.swing.JLabel();
        jLabel_idEmpleado1 = new javax.swing.JLabel();
        jTextField_idEnvio = new javax.swing.JTextField();
        jButton_Save = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jButton_Show = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Delete = new javax.swing.JButton();

        jLabel_IdVenta.setText("ID_Venta");

        jLabel_productModel.setText("Modelo producto");

        jLabel_idEmpleado.setText("ID_Empleado");

        jLabel_idCliente.setText("ID_Cliente");

        jLabel_IdVenta1.setText("ID Envio");

        jLabel_productModel1.setText("Sucursal");

        jLabel_idEmpleado1.setText("Cantidad");

        jButton_Save.setText("Save");
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });

        jButton_Clear.setText("Clear");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jButton_Show.setText("Show");
        jButton_Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ShowActionPerformed(evt);
            }
        });

        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "# Venta", "Modelo del product", "ID vendedor", "ID cliente", "ID envio", "Sucursal", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_IdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_idVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_productModel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_modeloProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_IdVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_idEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel_idEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_productModel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_idSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Delete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Save)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Clear)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Show)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Update))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_IdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_idVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_modeloProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_productModel)
                                    .addComponent(jLabel_idEmpleado1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_idEmpleado)
                                    .addComponent(jTextField_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton_Delete)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_idCliente)
                            .addComponent(jTextField_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Save)
                            .addComponent(jButton_Clear)
                            .addComponent(jButton_Show)
                            .addComponent(jButton_Update)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_IdVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_idEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_productModel1)
                            .addComponent(jTextField_idSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        Clear();
        
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed
        try {
            SaveToDB();
        } catch (SQLException ex) {
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_SaveActionPerformed

    private void jButton_ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ShowActionPerformed
        try {
            ShowData();
        } catch (SQLException ex) {
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_ShowActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        try {
            UpdateToDB();
        } catch (SQLException ex) {
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        try {
            // TODO add your handling code here:
            Delete();
        } catch (SQLException ex) {
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private Connection con() throws SQLException {
    String usr = "logingui";
    String pss = "1234";
    String url = "jdbc:mysql://localhost:3306/Ferreteria";
    Connection connection = DriverManager.getConnection(url, usr, pss);
    return connection;
    }
    
    private void SaveToDB() throws SQLException{
    Connection con = con();
    try{
        String query = "insert into Ventas values(?,?,?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, Integer.parseInt(jTextField_idVenta.getText()));
        st.setString(2, jTextField_modeloProduct.getText());
        st.setString(3, jTextField_idEmpleado.getText());
        st.setInt(4, Integer.parseInt(jTextField_idCliente.getText()));
        st.setInt(5, Integer.parseInt(jTextField_idEnvio.getText()));
        st.setInt(6, Integer.parseInt(jTextField_idSucursal.getText()));
        st.setInt(7, Integer.parseInt(jTextField_cantidad.getText()));
        st.execute();
        JOptionPane.showMessageDialog(this, "saved");
        st.close();
        con.close();
        Clear();
        ShowData();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());


        }
    }

    private void UpdateToDB() throws SQLException{
        Connection con = con();
        try{
            String query = "UPDATE Ventas " +
                "SET modelo_producto"  + "=IFNULL(?, modelo_producto),"+
                "id_empleado"  + "=IFNULL(?, id_empleado),"+
                "id_cliente"  + "=IFNULL(?, id_cliente),"+
                "id_envio"+ "=IFNULL(?, id_envio),"+
                "id_sucursal"+ "=IFNULL(?, id_sucursal),"+
                "cantidad" + "=IFNULL(?, cantidad)"+
                "  WHERE id_venta = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, DefaultStr(jTextField_modeloProduct));
            st.setString(2, DefaultStr(jTextField_idEmpleado));
            st.setObject(3, DefaultInt(jTextField_idCliente));
            st.setObject(4, DefaultInt(jTextField_idEnvio));
            st.setObject(5, DefaultInt(jTextField_idSucursal));
            st.setObject(6, DefaultInt(jTextField_cantidad));
            st.setObject(7, DefaultInt(jTextField_idVenta));
            st.execute();
            JOptionPane.showMessageDialog(this, "updated");
            st.close();
            con.close();
            Clear();
            ShowData();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private String DefaultStr(JTextField jtf){
        if(jtf.getText().equals(""))
            return null;
        else{
            return jtf.getText();
        }
    }
    private java.lang.Integer DefaultInt(JTextField jtf){
        if(jtf.getText().equals("")){
            return null;
         }
        else{
            return Integer.parseInt(jtf.getText());
        }
    }
    

    private void Clear(){
        jTextField_idVenta.setText("");
        jTextField_modeloProduct.setText("");
        jTextField_idEmpleado.setText("");
        jTextField_idCliente.setText("");
        jTextField_idEnvio.setText("");
        jTextField_idSucursal.setText("");
        jTextField_cantidad.setText("");
        DefaultTableModel tblModelVentas = (DefaultTableModel)jTable1.getModel();
        tblModelVentas.setRowCount(0);
    }
    
    private void ShowData() throws SQLException{
        Connection con = con();
        try{
            Statement st = con.createStatement();
            String query = "select * from Ventas";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String id_venta = String.valueOf(rs.getInt("id_venta"));
                String modelo_producto = rs.getString("modelo_producto");
                String id_empleado = rs.getString("id_empleado");
                String id_cliente = String.valueOf(rs.getInt("id_cliente"));
                String id_envio = String.valueOf(rs.getInt("id_envio"));
                String id_sucursal = String.valueOf(rs.getInt("id_sucursal"));
                String cantidad = String.valueOf(rs.getInt("cantidad"));
                String tbDataVentas [] = {id_venta, modelo_producto, id_empleado, id_cliente, id_envio, id_sucursal,cantidad };
                DefaultTableModel tblModelVentas = (DefaultTableModel)jTable1.getModel();
                tblModelVentas.addRow(tbDataVentas);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }
    
    private void Delete() throws SQLException{
        Connection con = con();
        try{
            String query = "DELETE FROM ventas WHERE id_venta = ?  ";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, DefaultInt(jTextField_idVenta));
            st.execute();
            JOptionPane.showMessageDialog(this, "deleted");
            st.close();
            con.close();
            Clear();
            ShowData();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());


        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JButton jButton_Show;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel_IdVenta;
    private javax.swing.JLabel jLabel_IdVenta1;
    private javax.swing.JLabel jLabel_idCliente;
    private javax.swing.JLabel jLabel_idEmpleado;
    private javax.swing.JLabel jLabel_idEmpleado1;
    private javax.swing.JLabel jLabel_productModel;
    private javax.swing.JLabel jLabel_productModel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_cantidad;
    private javax.swing.JTextField jTextField_idCliente;
    private javax.swing.JTextField jTextField_idEmpleado;
    private javax.swing.JTextField jTextField_idEnvio;
    private javax.swing.JTextField jTextField_idSucursal;
    private javax.swing.JTextField jTextField_idVenta;
    private javax.swing.JTextField jTextField_modeloProduct;
    // End of variables declaration//GEN-END:variables
}
