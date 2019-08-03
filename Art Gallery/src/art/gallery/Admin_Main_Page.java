/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

import java.util.Calendar;
import java.util.GregorianCalendar;
//import art.gallery.admin.view.Image_Table_Admin_Painting;
/**
 *
 * @author Deepak
 */
public class Admin_Main_Page extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Main_Page
     */
    public Admin_Main_Page() {
        initComponents();
        currentDate();
    }

     public void currentDate (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        jLabel4.setText((month+1)+"/"+day+"/"+year);
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Art Gallery");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 330, 100));

        jButton7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton7.setText("Exhibition");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, 40));

        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setText("Add Painting");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/bgimg/hqdefault.jpg"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 400, 200));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 150, 30));

        jButton8.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton8.setText("Gallery");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 150, 40));

        jButton9.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton9.setText("Add News");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 40));

        jButton6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 540, 100, 50));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setText("Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 60, 20));

        name.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 150, 20));

        id.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 60, 20));

        jButton10.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton10.setText("Paintings");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 150, 40));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel8.setText("ID:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 60, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/bgimg/free-vector-gallery-display-background-14-vector_016559_14.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Admin_Painting a1=new Admin_Painting();
        a1.a_id.setText(id.getText());
        a1.name.setText(name.getText());
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Admin_News a2=new Admin_News();
        a2.id.setText(id.getText());
        a2.name.setText(name.getText());
        a2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Admin_Exhibition a3=new Admin_Exhibition();
        a3.aid.setText(id.getText());
        a3.name.setText(name.getText());
        a3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Admin_Gallery a2=new Admin_Gallery();
        a2.a_id.setText(id.getText());
        a2.name.setText(name.getText());
        a2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Admin_View v1=new Admin_View();
        v1.aid.setText(id.getText());
        v1.name.setText(name.getText());
        v1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Main_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
