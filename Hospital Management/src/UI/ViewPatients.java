/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Doctor.Doctor;
import Encounter.Encounter;
import Patient.Patient;
import Patient.PatientDirectory;
import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BARATHI
 */
public class ViewPatients extends javax.swing.JFrame {

    /**
     * Creates new form ViewPatients
     */
    PatientDirectory pd;
    //String Doctor;
    public ViewPatients(String loggedDoctor) {
        pd=new PatientDirectory();
        //pd.getDbPatientDirectory();
        pd.getDbDoctorPatientDirectory(loggedDoctor);
        initComponents();
        setDefaultCloseOperation(AddVitals.DISPOSE_ON_CLOSE);
        
    }
    public ViewPatients()
    {
        pd=new PatientDirectory();
        pd.getDbPatientDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVitals = new javax.swing.JTable();
        btnDeleteVital = new javax.swing.JButton();
        btnAddVitals = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnEditVital = new javax.swing.JButton();
        btnViewVitals = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnVitalRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tblVitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient ID", "Pulse", "Blood Pressure", "Temperature", "Time Registered"
            }
        ));
        jScrollPane2.setViewportView(tblVitals);

        btnDeleteVital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete (2).png"))); // NOI18N
        btnDeleteVital.setText("Delete Vitals");
        btnDeleteVital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVitalActionPerformed(evt);
            }
        });

        btnAddVitals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add (2).png"))); // NOI18N
        btnAddVitals.setText("Add Vitals");
        btnAddVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalsActionPerformed(evt);
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
        tblPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatients);

        btnEditVital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N
        btnEditVital.setText("Edit Vitals");
        btnEditVital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditVitalActionPerformed(evt);
            }
        });

        btnViewVitals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/heart-attack (2).png"))); // NOI18N
        btnViewVitals.setText("View Vitals");
        btnViewVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalsActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete (2).png"))); // NOI18N
        btnDelete.setText("Delete Patient");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N
        btnEdit.setText("Edit Patient");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        btnVitalRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        btnVitalRefresh.setText("Refresh");
        btnVitalRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitalRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(btnViewVitals)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddVitals)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVitalRefresh)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditVital)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteVital)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGo)
                            .addComponent(btnRefresh)
                            .addComponent(btnBack)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnEdit)
                            .addComponent(btnAddVitals)
                            .addComponent(btnViewVitals))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteVital)
                    .addComponent(btnEditVital)
                    .addComponent(btnVitalRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_formWindowOpened

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteVitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVitalActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblVitals.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a Vital to delete it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);

        for(Patient p: pd.getPatientDirectory())
        {
            if(p.getPatientID()==selectedPatient.getPatientID())
            {
                Object[] row = new Object[6];
                for(Encounter e: p.getEH().getEncounterHistory())
                {
                    if(e.getBloodPressure() == (int) model.getValueAt(selectedRowIndex, 3) && e.getPulse() == (int) model.getValueAt(selectedRowIndex, 2) && e.getTemperature() == (int) model.getValueAt(selectedRowIndex, 4) && e.getUpdateTime().equals((String) model.getValueAt(selectedRowIndex, 5)))
                    {
                        p.getEH().deleteEncounter(e);
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(this, "Selected Vital Signs was deleted.");
        model.setRowCount(0);

        for(Patient p: pd.getPatientDirectory())
        {
            if(p.getPatientID()==selectedPatient.getPatientID())
            {
                Object[] row = new Object[6];
                for(Encounter e: p.getEH().getEncounterHistory())
                {
                    row[0]=p;
                    row[1]=p.getPatientID();
                    row[2]=e.getPulse();
                    row[3]=e.getBloodPressure();
                    row[4]=e.getTemperature();
                    row[5]=e.getUpdateTime();

                    model.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteVitalActionPerformed

    private void btnAddVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalsActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblPatients.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to add Vital Sign.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 7);
        int PatientID = selectedPatient.getPatientID();
        AddVitals av=new AddVitals(PatientID,pd);
        av.setVisible(true);

        //AddVitals addVitalSigns = new AddVitals(SplitPane,patientDirectory,personDirectory,PatientID);
        //SplitPane.setRightComponent(addVitalSigns);
    }//GEN-LAST:event_btnAddVitalsActionPerformed

    private void btnEditVitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditVitalActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblVitals.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to Edit it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        int patientSelectedIndex = tblPatients.getSelectedRow();
        Patient selectedPatient = (Patient) model.getValueAt(patientSelectedIndex, 7);
        int PatientID = selectedPatient.getPatientID();
        //AddVitals av=new AddVitals(PatientID,pd);
        //av.setVisible(true);
        EditVitals ev=new EditVitals(PatientID,pd,selectedPatient,selectedRowIndex);
        ev.setVisible(true);

        //EditVitals editVitals = new EditVitals(SplitPane,patientDirectory,personDirectory,selectedPatient,selectedRowIndex);
        //SplitPane.setRightComponent(editVitals);
    }//GEN-LAST:event_btnEditVitalActionPerformed

    private void btnViewVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatients.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a patient to view Vital Signs.");
            return;
        }

        DefaultTableModel modelpat = (DefaultTableModel) tblPatients.getModel();
        Patient selectedPatient = (Patient) modelpat.getValueAt(selectedRowIndex, 7);
        int PatientID = selectedPatient.getPatientID();

        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        model.setRowCount(0);

        for(Patient p: pd.getPatientDirectory())
        {
            if(p.getPatientID()==PatientID)
            {
                Object[] row = new Object[6];
               // p.getEH().EncounterHistory(PatientID);
                //System.out.println(p.getEH());
                for(Encounter e: p.getEH().getEncounterHistory())
                {
                    System.out.print(e.getPulse());
                    row[0]=p;
                    row[1]=p.getPatientID();
                    row[2]=e.getPulse();
                    row[3]=e.getBloodPressure();
                    row[4]=e.getTemperature();
                    row[5]=e.getUpdateTime();

                    model.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_btnViewVitalsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int res=JOptionPane.showConfirmDialog(this, "Do you want to delete this patient?", "Confirm" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (res==JOptionPane.YES_OPTION)
        {
        int selectedRowIndex = tblPatients.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a Patient to delete it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 7);

        pd.deletePatient(selectedPatient);

        JOptionPane.showMessageDialog(this, "Selected Patient was deleted.");
        populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       // PatientDetails addPatientDetails = new PatientDetails(SplitPane,patientDirectory,personDirectory,-1);
        //SplitPane.setRightComponent(addPatientDetails);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatients.getSelectedRow();

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

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        String SearchString = txtSearch.getText();
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);

        for(Patient p: pd.getPatientDirectory())
        {
            System.out.println(SearchString);
            System.out.println(p.getName());
            if(p.getName().equals(SearchString))
            {
                Object[] row = new Object[7];
                row[0]=p;
                row[1]=p.getAge();
                row[2]=p.getGender();
                row[3]=p.getResidence();
                row[4]=p.getCity();
                row[5]=p.getCommunity();
                row[6]=p.getPatientID();

                model.addRow(row);
                break;
            }
        }
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnVitalRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitalRefreshActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnVitalRefreshActionPerformed

    private void tblPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientsMouseClicked
        // TODO add your handling code here:
         int selectedRowIndex = tblPatients.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a patient to view Vital Signs.");
            return;
        }

        DefaultTableModel modelpat = (DefaultTableModel) tblPatients.getModel();
        Patient selectedPatient = (Patient) modelpat.getValueAt(selectedRowIndex, 7);
        int PatientID = selectedPatient.getPatientID();

        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        model.setRowCount(0);

        for(Patient p: pd.getPatientDirectory())
        {
            if(p.getPatientID()==PatientID)
            {
                Object[] row = new Object[6];
               // p.getEH().EncounterHistory(PatientID);
                //System.out.println(p.getEH());
                for(Encounter e: p.getEH().getEncounterHistory())
                {
                    System.out.print(e.getPulse());
                    row[0]=p;
                    row[1]=p.getPatientID();
                    row[2]=e.getPulse();
                    row[3]=e.getBloodPressure();
                    row[4]=e.getTemperature();
                    row[5]=e.getUpdateTime();

                    model.addRow(row);
                }
            }
           
        }
        
    }//GEN-LAST:event_tblPatientsMouseClicked

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
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVitals;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteVital;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEditVital;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewVitals;
    private javax.swing.JButton btnVitalRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTable tblVitals;
    private javax.swing.JTextField txtSearch;
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
       /* try {
            int i;
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String query="select * from Patient";
            ResultSet rst=stmt.executeQuery(query);
            ResultSetMetaData mt=rst.getMetaData();
            int q=mt.getColumnCount();
            
            DefaultTableModel model=(DefaultTableModel) tblViewPatients.getModel();
            model.setRowCount(0);
            
            while(rst.next())
            {
                Vector columnData=new Vector();
                
                for(i=1; i<=q;i++)
                {
                    columnData.add(rst.getString("Name"));
                    columnData.add(rst.getString("Username"));
                    columnData.add(rst.getString("Age"));
                    columnData.add(rst.getString("Address"));
                    columnData.add(rst.getString("Phone Number"));
                    columnData.add(rst.getString("City"));
                    
                    
                }
                model.addRow(columnData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}
