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
public class VechiculosJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VechiculosJPanel
     */
    public VechiculosJPanel() {
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldPlacas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAño = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Save_button = new javax.swing.JButton();
        Update_button = new javax.swing.JButton();
        Show_button = new javax.swing.JButton();
        Clear_bttn = new javax.swing.JButton();
        Delete_bttn = new javax.swing.JButton();

        jLabel1.setText("Placas");

        jLabel2.setText("Modelo");

        jLabel3.setText("Marca");

        jLabel4.setText("Año");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Placas", "Modelo", "Marca", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Save_button.setText("Save");
        Save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_buttonActionPerformed(evt);
            }
        });

        Update_button.setText("Update");
        Update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_buttonActionPerformed(evt);
            }
        });

        Show_button.setText("Show");
        Show_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_buttonActionPerformed(evt);
            }
        });

        Clear_bttn.setText("Clear");
        Clear_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_bttnActionPerformed(evt);
            }
        });

        Delete_bttn.setText("Delete");
        Delete_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_bttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPlacas, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jTextFieldModelo)
                            .addComponent(jTextFieldMarca)
                            .addComponent(jTextFieldAño))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Update_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Show_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Clear_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Save_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(Delete_bttn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Delete_bttn))
                    .addComponent(Save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Show_button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAño, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Clear_bttn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_buttonActionPerformed
        // TODO add your handling code here:
        try{
            SaveToDB();
        }catch (SQLException e){
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_Save_buttonActionPerformed

    private void Update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_buttonActionPerformed
        // TODO add your handling code here:
        try{
            Update();
        }catch (SQLException e){
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_Update_buttonActionPerformed

    private void Show_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_buttonActionPerformed
        // TODO add your handling code here:
        try{
            ShowData();
        }catch (SQLException e){
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_Show_buttonActionPerformed

    private void Clear_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_bttnActionPerformed
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_Clear_bttnActionPerformed

    private void Delete_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_bttnActionPerformed
        // TODO add your handling code here:
        try{
            Delete();
        }catch (SQLException e){
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_Delete_bttnActionPerformed

    private Connection con()throws SQLException {
        String usr = "logingui";
        String pss = "1234";
        String url = "jdbc:mysql://localhost:3306/Ferreteria";
        Connection connection = DriverManager.getConnection(url, usr, pss);
        return connection;
    }
    private void SaveToDB() throws SQLException{
        Connection con = con();
        try{
            String query = "INSERT INTO vehiculos values(?,?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, jTextFieldPlacas.getText());
            st.setString(2, jTextFieldModelo.getText());
            st.setString(3, jTextFieldMarca.getText());
            st.setInt(4, Integer.parseInt(jTextFieldAño.getText()));
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

    private void Update() throws SQLException{
        Connection con =con();
        try{
            String query = "UPDATE vehiculos " +
                    "SET modelo_vehiculo =IFNULL(?, modelo_vehiculo)," +
                    "marca = IFNULL(?, marca)," +
                    "año = IFNULL(?, año)" +
                    "WHERE placas =?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, DefaultStr(jTextFieldModelo));
            st.setString(2, DefaultStr(jTextFieldMarca));
            st.setObject(3, DefaultInt(jTextFieldAño));
            st.setString(4, DefaultStr(jTextFieldPlacas));
            st.execute();
            con.close();
            st.close();
            JOptionPane.showMessageDialog(this, "updated");
            Clear();
            ShowData();
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    private void Delete() throws SQLException{
        Connection con =con();
        try{
            String query = "Delete from vehiculos where placas =?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, jTextFieldPlacas.getText());
            st.execute();
            JOptionPane.showMessageDialog(this, "deleted");
            st.close();
            con.close();
            Clear();
            ShowData();
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void ShowData() throws SQLException{
        Connection con = con();
        try{
            Statement st = con.createStatement();
            String query = "Select * FROM vehiculos";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String placas = rs.getString("placas");
                String modelo_vehiculo = rs.getString("modelo_vehiculo");
                String marca = rs.getString("marca");
                String año = rs.getString("año");
                String tblData [] = {placas, modelo_vehiculo, marca,año};
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tblData);
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void Clear(){
        jTextFieldPlacas.setText("");
        jTextFieldMarca.setText("");
        jTextFieldAño.setText("");
        jTextFieldModelo.setText("");
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
    private javax.swing.JButton Clear_bttn;
    private javax.swing.JButton Delete_bttn;
    private javax.swing.JButton Save_button;
    private javax.swing.JButton Show_button;
    private javax.swing.JButton Update_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAño;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldPlacas;
    // End of variables declaration//GEN-END:variables
}