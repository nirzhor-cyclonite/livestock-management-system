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
public class CaretakerInsertPage extends javax.swing.JFrame {

    public static int token;
    public static Caretaker current;

    /**
     * Creates new form CaretakerInsertPage
     */
    public CaretakerInsertPage() {
        initComponents();
    }

    private void clear() {
        System.out.println("Insert Complete!");
        ageTextField.setText("");
        requiredMedicineTextFeild.setText("");
        foodAmountTextField.setText("");
        weightTextField.setText("");
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
        animalTypeComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        requiredMedicineTextFeild = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        foodAmountTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        saveButtonCareInsert = new javax.swing.JButton();
        genderComboBox = new javax.swing.JComboBox();
        returnToHomePage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Animal Type");

        animalTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cow", "Sheep", "Goat" }));

        jLabel2.setText("Age");

        jLabel3.setText("Required Medicine");

        jLabel4.setText("Gender");

        jLabel5.setText("Food Amount");

        jLabel6.setText("Weight");

        saveButtonCareInsert.setText("Insert");
        saveButtonCareInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonCareInsertActionPerformed(evt);
            }
        });

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        returnToHomePage.setText("Return to Home page");
        returnToHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToHomePageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(animalTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageTextField)
                            .addComponent(requiredMedicineTextFeild)
                            .addComponent(foodAmountTextField)
                            .addComponent(weightTextField)
                            .addComponent(genderComboBox, 0, 199, Short.MAX_VALUE))
                        .addContainerGap(164, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(returnToHomePage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButtonCareInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(animalTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requiredMedicineTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButtonCareInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnToHomePage))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonCareInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonCareInsertActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=livestock", "sa", "123456");
            String query = "insert into ANIMAL(FarmID,animalType,age,requiredmedicine,foodamount,gender,weight)values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            Integer temp = new Integer(current.farmId);
            pst.setString(1, temp.toString());
            pst.setString(2, animalTypeComboBox.getSelectedItem().toString());
            pst.setString(3, ageTextField.getText());
            pst.setString(4, requiredMedicineTextFeild.getText());
            pst.setString(5, foodAmountTextField.getText());
            pst.setString(6, genderComboBox.getSelectedItem().toString());
            pst.setString(7, weightTextField.getText());
            pst.executeUpdate();
            updateFarm();

            clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonCareInsertActionPerformed

    private void returnToHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToHomePageActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CaretakerHomePage().setVisible(true);

    }//GEN-LAST:event_returnToHomePageActionPerformed

    private void updateFarm() {
        ArrayList<FarmUpdate> update = new ArrayList<>();
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=livestock", "sa", "123456");
            String query = "SELECT AnimalType, COUNT(AnimalId) AS 'Number' FROM "
                    + "Animal WHERE FarmId = " + current.farmId + "GROUP BY AnimalType";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            FarmUpdate up;
            while (rs.next()) {
                up = new FarmUpdate(rs.getString("AnimalType"), rs.getInt("Number"));
                update.add(up);
            }

            for (int i = 0; i < update.size(); i++) {
                FarmUpdate temp = update.get(i);
                if (temp.animalType.equalsIgnoreCase("cow")) {
                    String query1 = "UPDATE FARMS SET Cows = "+temp.quantity+" WHERE "
                            + "farmId ="+current.farmId;
                    PreparedStatement pst = con.prepareStatement(query1);
                    pst.executeUpdate();

                } else if (temp.animalType.equalsIgnoreCase("sheep")) {
                    String query1 = "UPDATE FARMS SET Sheep = "+temp.quantity+" WHERE "
                            + "farmId ="+current.farmId;
                    PreparedStatement pst = con.prepareStatement(query1);
                    pst.executeUpdate();

                } else {
                    String query1 = "UPDATE FARMS SET Goats = "+temp.quantity+" WHERE "
                            + "farmId ="+current.farmId;
                    PreparedStatement pst = con.prepareStatement(query1);
                    pst.executeUpdate();

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JComboBox animalTypeComboBox;
    private javax.swing.JTextField foodAmountTextField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField requiredMedicineTextFeild;
    private javax.swing.JButton returnToHomePage;
    private javax.swing.JButton saveButtonCareInsert;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
