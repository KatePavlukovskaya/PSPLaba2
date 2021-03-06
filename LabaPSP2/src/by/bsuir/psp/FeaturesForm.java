/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.psp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class FeaturesForm extends javax.swing.JFrame {

   
    private MyDBConnection mdbc;
    private java.sql.Statement stmt;
  
    
    public FeaturesForm() throws SQLException{
        mdbc=new MyDBConnection();
        mdbc.init();
        Connection conn=mdbc.getMyConnection();
        try {
            stmt= conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(FlowerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        magazinflowersPUEntityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("magazinflowersPU").createEntityManager();
        featuresQuery = java.beans.Beans.isDesignTime() ? null : magazinflowersPUEntityManager0.createQuery("SELECT f FROM Features f");
        featuresList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : featuresQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(140, 200, 140, 30);

        jTextField2.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(140, 240, 140, 30);

        jTextField3.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(140, 280, 140, 30);

        jButton2.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(450, 240, 110, 30);

        jLabel5.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Color");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 240, 70, 20);

        jLabel4.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Life Time");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 280, 110, 20);

        jLabel6.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("ID Feature");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 200, 96, 33);

        jLabel2.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("ID Feature");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 200, 110, 33);

        jTextField4.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(440, 200, 140, 30);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, featuresList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idFeature}"));
        columnBinding.setColumnName("Id Feature");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${color}"));
        columnBinding.setColumnName("Color");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lifetime}"));
        columnBinding.setColumnName("Lifetime");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 60, 490, 120);

        jLabel7.setFont(new java.awt.Font("Curlz MT", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Features");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 10, 150, 30);

        jButton3.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("Previous table");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(430, 370, 160, 30);

        jButton1.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 370, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/by/bsuir/psp/833266387320.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, -10, 650, 444);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id_feature=jTextField4.getText();
        
        
        String insertStr="";        
        try{
            
            insertStr="DELETE FROM features WHERE id_features="+quotate(id_feature)+";";
            
            int done=stmt.executeUpdate(insertStr);         
           
           
            getContentPane().removeAll();
            initComponents();
        
        }
        catch(Exception e){           
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String id_feature=jTextField1.getText();
        String color=jTextField2.getText();        
        String lifetime=jTextField3.getText();   
      
        
        String insertStr="";        
        try{
            
            insertStr="INSERT INTO features (id_features, color, lifetime) VALUES("
                    +quotate(id_feature)+","
                    +quotate(color)+","
                    +quotate(lifetime)+");";
            
            int done=stmt.executeUpdate(insertStr);
                     
           
            getContentPane().removeAll();
            initComponents();        
        }
        catch(Exception e){           
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        FlowerForm flowerForm;
        flowerForm = new FlowerForm();
        flowerForm.setVisible(true);
       
        dispose(); 
    }//GEN-LAST:event_jButton3ActionPerformed

     public ResultSet getResultFromCars() {
        
        ResultSet rs=null;
        
        try{
            rs=stmt.executeQuery("Select * from features");
        
        }
        catch(SQLException e){}
        
        return rs;
        
    }
    /**
     * @param args the command line arguments
     */
      public String quotate(String content){
    
        return "'"+content+"'";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<by.bsuir.psp.Features> featuresList;
    private javax.persistence.Query featuresQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.persistence.EntityManager magazinflowersPUEntityManager0;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
