/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Patient.Patient;
import Patient.PatientDirectory;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BARATHI
 */
public class ViewPerson extends javax.swing.JFrame {

    /**
     * Creates new form ViewPerson
     */
    String community;
     PatientDirectory pd;
    public ViewPerson(String community) {
        initComponents();
        pd=new PatientDirectory();
        pd.getDbCommunityPatientDirectory(community);
        this.community=community;
        System.out.print(community);
        populateTable();
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
        tblPatients = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnEdit1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtAddNewPatient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Residence", "City", "Community", "Patient ID", "Object"
            }
        ));
        jScrollPane1.setViewportView(tblPatients);

        btnEdit.setText("Edit Patient");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnEdit1.setText("Edit Patient");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtAddNewPatient.setText("Add New Patient");
        txtAddNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddNewPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAddNewPatient)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(btnEdit1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(293, 293, 293)
                    .addComponent(btnEdit)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit1)
                    .addComponent(jButton1)
                    .addComponent(txtAddNewPatient))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(171, 171, 171)
                    .addComponent(btnEdit)
                    .addContainerGap(171, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatients.getSelectedRow();
        System.out.print("Inside edit");

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to Edit it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 7);
        int PatientId=selectedPatient.getPatientID();
        EditPatient ep=new EditPatient(pd,selectedPatient,PatientId);
        ep.setVisible(true);

        // EditPatient editPatient = new EditPatient(SplitPane,patientDirectory,personDirectory,selectedPatient.getPatientID());
        //  SplitPane.setRightComponent(editPatient);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatients.getSelectedRow();
        System.out.print("Inside edit");

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to Edit it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 7);
        int PatientId=selectedPatient.getPatientID();
        EditPatient ep=new EditPatient(pd,selectedPatient,PatientId);
        ep.setVisible(true);
    }//GEN-LAST:event_btnEdit1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAddNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddNewPatientActionPerformed
        // TODO add your handling code here:
        Registration rs=new Registration(0);
        rs.setVisible(true);
        //MainScreen topFrame = (MainScreen) SwingUtilities.getWindowAncestor(this);
       // topFrame.dispose();
        //topFrame.setVisible(false);
    }//GEN-LAST:event_txtAddNewPatientActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEdit1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatients;
    private javax.swing.JButton txtAddNewPatient;
    // End of variables declaration//GEN-END:variables
public void populateTable()
    {
         
         DefaultTableModel model=(DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
       // System.out.println("Inside populate");
       // System.out.print(pd);
        for(Patient p: pd.getPatientDirectory())
        {
            //System.out.println("Inside loop");
             //System.out.println(p.getName());
             Object[] row=new Object[9];
             row[7]=p;
             row[0]=p.getName();
             row[1]=p.getAge();
             row[2]=p.getGender();
             row[3]=p.getResidence();
             System.out.println(p.getResidence());
             row[4]=p.getCity();
             row[5]=p.getCommunity();
             row[6]=p.getPatientID();
             
             
             model.addRow(row);
        }
}
}

