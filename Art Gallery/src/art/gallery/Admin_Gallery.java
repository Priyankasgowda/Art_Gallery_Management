/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Deepak
 */
public class Admin_Gallery extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form Admin_Gallery
     */
    public Admin_Gallery() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gallery_lbl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        loc_lbl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        a_id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        aid1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gallery");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Exhibition ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, 30));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gallery Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, 30));

        gallery_lbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        gallery_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(gallery_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 156, -1));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Location:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 119, 30));

        loc_lbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        loc_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(loc_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 156, -1));

        jButton1.setText("Add Gallery");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, -1, -1));

        a_id.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        a_id.setForeground(new java.awt.Color(255, 255, 255));
        a_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(a_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, 81, 32));

        name.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 200, 40));

        jComboBox1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 156, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 516, 129));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 550, 70, 40));

        aid1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        aid1.setForeground(new java.awt.Color(255, 255, 255));
        aid1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid1.setText("Name:");
        getContentPane().add(aid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 81, 32));

        name1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("ID");
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 81, 32));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/bgimg/nathan-duck-725007-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void OpenDatabase()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pri?zeroDateTimeBehavior=convertToNull","root","");  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void CloseDatabase()
    {
        try 
        {
            conn.close();
        } 
        catch (SQLException e) 
        {
             e.printStackTrace();
        }           
    }
    private void jComboBox1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBox1AncestorAdded
                  try
        {
            OpenDatabase();
            String query="select * from exhibition";
            Statement st = conn.createStatement();
            ResultSet rs1 = st.executeQuery(query);
            while (rs1.next()) {
                jComboBox1.addItem(rs1.getString(1));
            }
            rs1.close();
            CloseDatabase();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }//GEN-LAST:event_jComboBox1AncestorAdded

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        try
        {

            OpenDatabase();
            String sql="select e_id as EXHIBITION_ID,g_id as GALLERY_ID,g_name as GALLERY_NAME,location as LOCATION from gallery where a_id='"+a_id.getText()+"'";
            ps=conn.prepareStatement(sql);
            //   dept_lbl.setText(res.getString(11));

            //                sem_lbl.setText(Integer.toString(res.getInt(12)));

            //
            rs=ps.executeQuery(sql);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            CloseDatabase();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Database Problem Connectivity");
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id=Integer.parseInt(a_id.getText());
        int e_id=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        String g_name=gallery_lbl.getText();
        String loc=loc_lbl.getText();
        try
        {
            OpenDatabase();
            Statement st=conn.createStatement();
            ps=conn.prepareStatement("insert into gallery values(?,?,?,?,?)");
            ps.setInt(1,id);
            ps.setInt(2,e_id);
            ps.setInt(3,0);
            ps.setString(4, g_name);
            ps.setString(5, loc);
            int val=ps.executeUpdate();
            if(val>=1)
            JOptionPane.showConfirmDialog(null, "Gallery has been inserted", "Signup", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
            Admin_Main_Page a2=new Admin_Main_Page();
            a2.id.setText(a_id.getText());
            a2.name.setText(name.getText());
            a2.setVisible(true);
            this.dispose();
            CloseDatabase();
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, "Gallery not inserted", "Result", JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Admin_Main_Page a2=new Admin_Main_Page();
        a2.id.setText(a_id.getText());
        a2.name.setText(name.getText());
        a2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Gallery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel a_id;
    public javax.swing.JLabel aid1;
    private javax.swing.JTextField gallery_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField loc_lbl;
    public javax.swing.JLabel name;
    public javax.swing.JLabel name1;
    // End of variables declaration//GEN-END:variables
}
