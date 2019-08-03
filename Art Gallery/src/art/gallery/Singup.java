/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Deepak
 */
public class Singup extends javax.swing.JFrame {

    String filename=null;
    String filepath=null;
    Connection conn;
    byte[] person_image = null;
    PreparedStatement ps;
    /**
     * Creates new form Painting
     */
    public Singup() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_lbl = new javax.swing.JTextField();
        address_lbl = new javax.swing.JTextField();
        dob_lbl = new com.toedter.calendar.JDateChooser();
        check2 = new java.awt.Checkbox();
        check1 = new java.awt.Checkbox();
        check3 = new java.awt.Checkbox();
        jLabel6 = new javax.swing.JLabel();
        email_lbl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pwd_lbl = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        phone_lbl = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pic = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Signup");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Art Gallery");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 20, 150, 50));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setText("Address:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setText("Categories:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setText("Gender:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        name_lbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        name_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(name_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 210, -1));

        address_lbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        address_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(address_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 210, -1));

        dob_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dob_lbl.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(dob_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 210, 30));

        check2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        check2.setLabel("Pencil Sketch");
        jPanel1.add(check2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 210, -1));

        check1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        check1.setLabel("Potrait");
        jPanel1.add(check1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 210, -1));

        check3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        check3.setLabel("Oil Painting");
        jPanel1.add(check3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 210, -1));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 30));

        email_lbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        email_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(email_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 210, -1));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel7.setText("Password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        pwd_lbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        pwd_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(pwd_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 210, -1));

        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setText("Signup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 110, 30));

        jButton2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton2.setText("Clear");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 110, 30));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel9.setText("Phone No:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        phone_lbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        phone_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        phone_lbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone_lblKeyTyped(evt);
            }
        });
        jPanel1.add(phone_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 210, -1));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel10.setText("DOB:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        buttonGroup1.add(female);
        female.setText("Female");
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        buttonGroup1.add(male);
        male.setText("Male");
        male.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        male.setName(""); // NOI18N
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 100, 30));

        jButton4.setText("Browse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        pic.setBackground(new java.awt.Color(255, 102, 204));
        pic.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        pic.setForeground(new java.awt.Color(204, 255, 204));
        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/bgimg/timthumb.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Art_Gallery().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 /*JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        filename =f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_DEFAULT));
        pic.setIcon(imageIcon);
      try {

            File image = new File(filename);
            FileInputStream fis = new FileInputStream (image);
            ByteArrayOutputStream bos= new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for(int readNum; (readNum=fis.read(buf))!=-1; ){

                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
       */
 
 
 
JFileChooser chooser=new JFileChooser(new File("E:\\"));
  
chooser.setMultiSelectionEnabled(false);
chooser.setVisible(true);

chooser.showOpenDialog(this);

File file=chooser.getSelectedFile();
if(file!=null){filepath=file.getPath();}
if(filepath!=null){
ImageIcon imageIcon = new ImageIcon(new ImageIcon(filepath).getImage().getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_DEFAULT));
pic.setIcon(imageIcon);
 
}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        String name=name_lbl.getText();
        int phno=Integer.parseInt(phone_lbl.getText());
        String address=address_lbl.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startDateString = dateFormat.format(dob_lbl.getDate());
        String gender=null;
                        if(male.isSelected())
                            gender="male";
                        if(female.isSelected())
                            gender="female";
       String c1=null;
       String c2=null;
        String c3=null;
        if(check1.getState()){
            c1=check1.getLabel();
        }
        else
            c1="";
       
        
        if(check2.getState()){
            c2=check2.getLabel();
        }
        else
            c2="";
       
        
        if(check3.getState()){
            c3=check3.getLabel();
        }
        else
            c3="";
       
        String email=email_lbl.getText();
        String pwd=pwd_lbl.getText();
        
        
       
        
        
        try
        {
            
             FileInputStream fileInputStream=new FileInputStream(filepath);
            byte b[]=new byte[fileInputStream.available()];
            fileInputStream.read(b);
            fileInputStream.close();
            OpenDatabase();
           // Statement st=conn.createStatement();
            ps=conn.prepareStatement("insert into artist values(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, name);
            ps.setInt(3, phno);
            ps.setString(4, address);
            ps.setString(5, startDateString);
            ps.setString(6, gender);
            ps.setString(7, c1);
            ps.setString(8, c2);
            ps.setString(9, c3);
            ps.setString(10, email);
            ps.setString(11, pwd);
            ps.setBytes(12, b);
            int val=ps.executeUpdate();
            if(val>=1)
            JOptionPane.showConfirmDialog(null, "Artist Has been Added", "Signup", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
            new Login().setVisible(true);
            this.dispose();
            CloseDatabase();
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, "Artist has not added", "Result", JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void phone_lblKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_lblKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_phone_lblKeyTyped

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
            java.util.logging.Logger.getLogger(Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Singup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_lbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Checkbox check1;
    private java.awt.Checkbox check2;
    private java.awt.Checkbox check3;
    private com.toedter.calendar.JDateChooser dob_lbl;
    private javax.swing.JTextField email_lbl;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name_lbl;
    private javax.swing.JTextField phone_lbl;
    private javax.swing.JLabel pic;
    private javax.swing.JPasswordField pwd_lbl;
    // End of variables declaration//GEN-END:variables
}