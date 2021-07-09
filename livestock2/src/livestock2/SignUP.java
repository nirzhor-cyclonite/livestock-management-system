/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livestock2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sujoy
 */
public class SignUP extends javax.swing.JFrame {

    public static String userType;

    /**
     * Creates new form SignUP
     */
    public SignUP() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        AddressTextField = new javax.swing.JTextField();
        ContactTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        NextButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(13, 21, 57));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 140, 33));

        jLabel2.setBackground(new java.awt.Color(13, 21, 57));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Address");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 86, 120, 29));

        jLabel3.setBackground(new java.awt.Color(13, 21, 57));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contact NO.");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 133, 110, 29));

        jLabel4.setBackground(new java.awt.Color(13, 21, 57));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, 28));

        nameTextField.setBackground(new java.awt.Color(222, 120, 31));
        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 288, 33));

        AddressTextField.setBackground(new java.awt.Color(222, 120, 31));
        AddressTextField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(AddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 288, 29));

        ContactTextField.setBackground(new java.awt.Color(222, 120, 31));
        ContactTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ContactTextField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ContactTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 288, 29));

        EmailTextField.setBackground(new java.awt.Color(222, 120, 31));
        EmailTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        EmailTextField.setForeground(new java.awt.Color(255, 255, 255));
        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 288, 28));

        NextButton.setBackground(new java.awt.Color(52, 178, 128));
        NextButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NextButton.setText("Sign UP");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, 60));

        jPanel1.setBackground(new java.awt.Color(13, 21, 57));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), java.awt.Color.white)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed

        try {
            String token="SELECT MAX(Token) AS val FROM Admin";
            ArrayList<Integer> tokenlist= new ArrayList();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=livestock", "sa", "123456");
            
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(token);
        
        while(rs.next()){
            int t= rs.getInt("val");
            tokenlist.add(t);
        }
        
        Integer temp = new Integer(tokenlist.get(tokenlist.size()-1));// tokenlist.get(tokenlist.size()-1);
            String query = "insert into "+SignUP.userType+"(name,token,address,contactno,email)values(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, nameTextField.getText());
            pst.setString(2, temp.toString());
            pst.setString(3, AddressTextField.getText());
            pst.setString(4, ContactTextField.getText());
            pst.setString(5, EmailTextField.getText());
            pst.executeUpdate();
            this.setVisible(false);
            new Thankyou().setVisible(true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_NextButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JTextField ContactTextField;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTextField;
    // End of variables declaration//GEN-END:variables
}