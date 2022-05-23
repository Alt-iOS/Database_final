/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package database_final;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victor
 */
public class Proveedor extends javax.swing.JPanel {

    /**
     * Creates new form Proveedor
     */
    public Proveedor() {
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

        jPanelProveedores = new javax.swing.JPanel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_idProveedores = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_idProveedores = new javax.swing.JTextField();
        jTextField_correo = new javax.swing.JTextField();
        jLabel_Celular = new javax.swing.JLabel();
        jLabel_Correo = new javax.swing.JLabel();
        jTextField_Celular = new javax.swing.JTextField();
        jButton_Save = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jButton_Show = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Delete = new javax.swing.JButton();

        jLabel_nombre.setText("Nombre");

        jLabel_idProveedores.setText("ID_proveedores");

        jLabel_Celular.setText("Celular");

        jLabel_Correo.setText("Correo");

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "iD proveedores", "Nombre", "Celular", "Correo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProveedoresLayout = new javax.swing.GroupLayout(jPanelProveedores);
        jPanelProveedores.setLayout(jPanelProveedoresLayout);
        jPanelProveedoresLayout.setHorizontalGroup(
            jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                                .addComponent(jLabel_idProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_idProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                                .addComponent(jLabel_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                                .addComponent(jLabel_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                                .addComponent(jLabel_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton_Delete)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Save)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Clear)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Show)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Update)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelProveedoresLayout.setVerticalGroup(
            jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_idProveedores)
                    .addComponent(jTextField_idProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jLabel_Correo)
                    .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Save)
                    .addComponent(jButton_Clear)
                    .addComponent(jButton_Show)
                    .addComponent(jButton_Update)
                    .addComponent(jButton_Delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        try {
            // TODO add your handling code here:
            Delete();
        } catch (SQLException ex) {
            Logger.getLogger(Clientes_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        try {
            UpdateToDB();
        } catch (SQLException ex) {
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ShowActionPerformed
        try {
            ShowData();
        } catch (SQLException ex) {
            Logger.getLogger(Ventas_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_ShowActionPerformed

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
            String query = "insert into proveedores values(?,?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,  Integer.parseInt(jTextField_idProveedores.getText()));
            st.setString(2, jTextField_nombre.getText());
            st.setObject(3, (jTextField_Celular.getText()));
            st.setString(4, jTextField_correo.getText());
            st.execute();
            JOptionPane.showMessageDialog(this, "saved");
            con.close();
            Clear();
            ShowData();
            st.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
    private void UpdateToDB() throws SQLException{
        Connection con = con();
        try{
            String query = "UPDATE proveedores "+
                    "SET nombre" +"=IFNULL(?, nombre)," +
                    "telefono" + "=IFNULL(?, telefono)," +
                    "correo" + "=IFNULL(?, correo)" +
                    "WHERE id_proveedor = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, jTextField_nombre.getText());
            st.setObject(2, jTextField_Celular.getText());
            st.setString(3, jTextField_correo.getText());
            st.setObject(4, jTextField_idProveedores.getText());
            st.execute();
            JOptionPane.showMessageDialog(this, "updated");
            st.close();
            con.close();
            Clear();
            ShowData();
        }catch(Exception e){

        }

    }
    private void ShowData() throws SQLException{
        Connection con = con();
        try{
            Statement st = con.createStatement();
            String query = "select * from proveedores";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String id_cliente = String.valueOf(rs.getObject("id_proveedor"));
                String nombre =rs.getString("nombre");
                String telefono = String.valueOf(rs.getObject("telefono"));
                String correo = rs.getString("correo");
                String tbData[] ={id_cliente, nombre, telefono, correo};
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbData);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        }  

    }
    
    private void Delete() throws SQLException{
        Connection con = con();
        try{
            String query = "DELETE FROM proveedores WHERE id_proveedor = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, Integer.parseInt(jTextField_idProveedores.getText()));
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
        jTextField_correo.setText("");
        jTextField_nombre.setText("");
        jTextField_idProveedores.setText("");
        jTextField_Celular.setText("");
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
    private java.lang.Long DefaultInt(JTextField jtf){
        if(jtf.getText().equals("")){
            return null;
        }
        else{
            return Long.parseLong(jtf.getText());
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JButton jButton_Show;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel_Celular;
    private javax.swing.JLabel jLabel_Correo;
    private javax.swing.JLabel jLabel_idProveedores;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JPanel jPanelProveedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Celular;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_idProveedores;
    private javax.swing.JTextField jTextField_nombre;
    // End of variables declaration//GEN-END:variables
}
