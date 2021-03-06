/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livestock2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import static livestock2.ShowFarms.current;

/**
 *
 * @author Sujoy
 */
public class ShowCaretaker extends javax.swing.JFrame {
    public static Owner current;

    /**
     * Creates new form ShowCaretaker
     */
    public ShowCaretaker() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        caretakertableforowner = new javax.swing.JTable();
        showallcaretaker = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        caretakertableforowner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Caretaker ID", "Name ", "Contact NO.", "Farm ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(caretakertableforowner);

        showallcaretaker.setText("Show All");
        showallcaretaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showallcaretakerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(showallcaretaker)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(showallcaretaker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showallcaretakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showallcaretakerActionPerformed
        ArrayList<Caretaker>caretakerList= new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=livestock", "sa", "123456");
            String query = "SELECT * FROM Caretaker WHERE FarmId IN (SELECT FarmId FROM FARMS WHERE OwnerId ="+ current.ownerId+")";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            Caretaker own;
            while (rs.next()) {
                own = new Caretaker(rs.getInt("caretakerid"), rs.getString("name"), 
                        rs.getString("Contactno"), rs.getString("Email"),
                        rs.getString("address"), rs.getInt("farmid"),
                        rs.getInt("token"));
                caretakerList.add(own);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        DefaultTableModel model = (DefaultTableModel) caretakertableforowner.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < caretakerList.size(); i++) {
            Caretaker tem = caretakerList.get(i);
            row[0] = tem.caretakerId;
            row[1] = tem.name;
            row[2] = tem.contactNo;
            row[3] = tem.farmId;
            model.addRow(row);
        }
    }//GEN-LAST:event_showallcaretakerActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable caretakertableforowner;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showallcaretaker;
    // End of variables declaration//GEN-END:variables
}
