/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Deepak
 */
public class Admin_View extends javax.swing.JFrame {

    /**
     * Creates new form Admin_View
     */
    public Admin_View() {
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
        jPanel1 = new javax.swing.JPanel();
        aid = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        name1 = new javax.swing.JLabel();
        aid1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/bgimg/dimitar-belchev-295156-unsplash.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aid.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        aid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(aid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 81, 32));

        name.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 81, 32));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, -1, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 750, 380));

        name1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("ID");
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 81, 32));

        aid1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        aid1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid1.setText("Name:");
        jPanel1.add(aid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 81, 32));

        jLabel2.setFont(new java.awt.Font("Blackadder ITC", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Paintings");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 220, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     public void populateJTable(){
        MyQuery mq = new MyQuery();
        ArrayList<Product2> list = mq.BindTable();
        String[] columnName = {"Paint_ID","Caption","Year","Object","Cost","Image"};
        Object[][] rows = new Object[list.size()][7];
        for(int i = 0; i < list.size(); i++){
            
            rows[i][0] = list.get(i).getPID();
            rows[i][1] = list.get(i).getCaption();
            rows[i][2] = list.get(i).getYrs();
            rows[i][3] = list.get(i).getObject();
            rows[i][4] = list.get(i).getCost();
            if(list.get(i).getMyImage1() != null){
                
             ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage1()).getImage()
             .getScaledInstance(150, 120, Image.SCALE_SMOOTH) );   
                
            rows[i][5] = image;
            }
            else{
                rows[i][5] = null;
            }
            rows[i][6] = list.get(i).getMyImage1();
            
        }
        
        TheModel model = new TheModel(rows, columnName);
        jTable1.setModel(model);
        jTable1.setRowHeight(120);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
    }
     
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                Admin_Main_Page a2=new Admin_Main_Page();
            a2.id.setText(aid.getText());
            a2.name.setText(name.getText());
            a2.setVisible(true);
            this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        populateJTable();
    }//GEN-LAST:event_jTable1AncestorAdded

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
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel aid;
    public javax.swing.JLabel aid1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel name;
    public javax.swing.JLabel name1;
    // End of variables declaration//GEN-END:variables

    
    public class Product2 {

    private String caption;
    private int yrs;
    private String Categories;
    private String object;
    private int cost;
    private byte[] Image1;
    private int pid;
    public Product2(){}
    
    public Product2(int pid,String caption, int yrs, String Category, String object,byte[] image1, int cost){
        this.pid=pid;
        this.caption = caption;
        this.yrs = yrs;
        this.Categories = Category;
        this.object = object;
        this.Image1 = image1;
        this.cost = cost;
       
    }
    
    
    public String getCaption(){
      return caption;
    }
    
    public void setCaption(String Caption){
        this.caption = Caption;
    }
    
    public int getPID(){
      return pid;
    }
    
    public void setPID(int pid){
        this.pid = pid;
    }
    
    
    public int getYrs(){
        return yrs;
    }
    
    public void setYrs(int yrs){
        this.yrs = yrs;
    }
    
    public String getCategory(){
        return Categories;
    }
    
    public void setCategory(String ctg){
        this.Categories = ctg;
    }
    
    public String getObject(){
        return object;
    }
    
    public void setObject(String obj){
        this.object = obj;
    }
    
    public int getCost(){
        return cost;
    }
    
    public void setCost(int cost){
        this.cost = cost;
    }
    
    public byte[] getMyImage1(){
        return Image1;
    }
}



public class MyQuery {
    
   public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pri?zeroDateTimeBehavior=convertToNull", "root","");
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public ArrayList<Product2> BindTable(){
        
   ArrayList<Product2> list = new ArrayList<Product2>();
   Connection con = getConnection();
   Statement st;
   ResultSet rs;
   
   try {
   st = con.createStatement();
   rs = st.executeQuery("SELECT `p_id`,`caption`, `yrs`, `category`, `object`, `painting_pic`, `cost` FROM `painting` where a_id='"+aid.getText()+"'");
   
   Product2 p;
   while(rs.next()){
   p = new Product2(
   rs.getInt("p_id"),
   rs.getString("caption"),
   rs.getInt("yrs"),
   rs.getString("category"),
   rs.getString("object"),
   rs.getBytes("painting_pic"),
   rs.getInt("cost")
   );
   list.add(p);
   }
   
   } catch (SQLException ex) {
   Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
   }
   return list;
   }
}







public class TheModel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public TheModel(){}
    
    public TheModel(Object[][] data, String[] columnName){
    
        this.rows = data;
        this.columns = columnName;
    }

    
    public Class getColumnClass(int column){
// 4 is the index of the column image
        if(column == 5){
            return Icon.class;
        }
        else{
            return getValueAt(0,column).getClass();
        }
    }
    
    
    public int getRowCount() {
     return this.rows.length;
    }

    public int getColumnCount() {
     return this.columns.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
    return this.rows[rowIndex][columnIndex];
    }
    public String getColumnName(int col){
        return this.columns[col];
    }


}






}
