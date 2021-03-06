/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package database_final;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author victor
 */
public class PosicionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PosicionJPanel
     */
    public PosicionJPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField_idPosicion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_salario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_save = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jButton_show = new javax.swing.JButton();
        jButton_clear = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();

        jLabel1.setText("ID Posicion");

        jLabel2.setText("Nombre");

        jLabel3.setText("Salario");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id_posicion", "Nombre posicion", "Title Salario"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton_save.setText("Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jButton_update.setText("Update");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        jButton_show.setText("Show");
        jButton_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_showActionPerformed(evt);
            }
        });

        jButton_clear.setText("Clear");
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });

        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_idPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_nombre)
                            .addComponent(jTextField_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton_save)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_update)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_show)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_clear)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_delete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_idPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_save)
                    .addComponent(jButton_update)
                    .addComponent(jButton_show)
                    .addComponent(jButton_clear)
                    .addComponent(jButton_delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        // TODO add your handling code here:
        try{
            UpdateToDB();
        }catch (SQLException ex){
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        // TODO add your handling code here:
        try{
            SaveToDB();
        }catch (SQLException ex){
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_showActionPerformed
        // TODO add your handling code here:
        try{
            ShowData();
        }catch (SQLException ex){
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_showActionPerformed

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        // TODO add your handling code here:
            Clear();
    }//GEN-LAST:event_jButton_clearActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        // TODO add your handling code here:
        try{
            Delete();
        }catch (SQLException ex){
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private Connection con()throws SQLException {
        String usr = "logingui";
        String pss = "1234";
        String url = "jdbc:mysql://localhost:3306/Ferreteria";
        Connection connection = DriverManager.getConnection(url, usr, pss);
        return connection;
    }

    private void ShowData() throws SQLException {
        Connection con = con();
        try{
            Statement st = con.createStatement();
            String query = "SELECT * FROM  posicion ";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                String id_posicion = String.valueOf(rs.getInt("id_posicion"));
                String nombre = rs.getString("Nombre_posicion");
                String salario = String.valueOf(rs.getObject("salario"));
                String tbData[] ={id_posicion, nombre, salario};
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
    private void SaveToDB() throws SQLException{
        Connection con = con();
        try{
            String query = "INSERT INTO posicion VALUES(?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, Integer.parseInt(jTextField_idPosicion.getText()));
            st.setString(2, jTextField_nombre.getText());
            st.setInt(3, Integer.parseInt(jTextField_salario.getText()));
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
            String query = "UPDATE posicion "+
                    "SET Nombre_posicion " + "=IFNULL(?, Nombre_posicion),"+
                    "salario " + "=  IFNULL(?, salario)"+
                    "WHERE id_posicion = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, DefaultStr(jTextField_nombre));
            st.setObject(2, DefaultInt(jTextField_salario));
            st.setObject(3, DefaultInt(jTextField_idPosicion));
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
    private void Delete() throws SQLException {
        Connection con = con();
        try{
            String query= "DELETE FROM posicion WHERE id_posicion =?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, DefaultStr(jTextField_idPosicion));
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
    private void Clear(){
        jTextField_idPosicion.setText("");
        jTextField_nombre.setText("");
        jTextField_salario.setText("");
        DefaultTableModel tblModelVentas = (DefaultTableModel)jTable1.getModel();
        tblModelVentas.setRowCount(0);
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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_save;
    private javax.swing.JButton jButton_show;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_idPosicion;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_salario;
    // End of variables declaration//GEN-END:variables
}
