/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Encounter.Encounter;
import Patient.Patient;
import Patient.PatientDirectory;
import Person.PersonDirectory;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;


/**
 *
 * @author BARATHI
 */
public class AddVitalSigns extends javax.swing.JPanel {

    /**
     * Creates new form AddVitalSigns
     */
    PatientDirectory patientDirectory;
    private JSplitPane SplitPane;
    PersonDirectory personDirectory;
    private int PatientID;
    public AddVitalSigns(JSplitPane SplitPane,PatientDirectory patientDirectory,PersonDirectory personDirectory,int PatientID) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.SplitPane = SplitPane;
        this.PatientID = PatientID;
        this.personDirectory = personDirectory;
        
        for(Patient p: patientDirectory.getPatientDirectory())
         {
             if(p.getPatientID()==PatientID)
             {
             txtName.setText(p.getName());
             txtPatientID.setText(String.valueOf(p.getPatientID()));
             }
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPatientID = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Vital Signs");

        lblName.setText("Name:");

        lblPatientID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatientID.setText("Patient ID:");

        lblPulse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPulse.setText("Pulse:");

        lblBloodPressure.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBloodPressure.setText("Blood Pressure:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Temperature:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblName)
                        .addComponent(lblPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addComponent(lblPulse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtName)
                        .addComponent(txtPatientID)
                        .addComponent(txtPulse)
                        .addComponent(txtBloodPressure)
                        .addComponent(txtTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientID)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
    }
    // only got here if we didn't return false
    return true;
}
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(txtPulse.getText().equals("") || !isInteger(txtPulse.getText()))
        {
            JOptionPane.showMessageDialog(this, "Pulse Feild is invalid.");
        }
        else if(txtTemperature.getText().equals("") || !isInteger(txtTemperature.getText()))
        {
            JOptionPane.showMessageDialog(this, "Temperature Feild is invalid.");
        }
        else if(txtBloodPressure.getText().equals("") || !isInteger(txtBloodPressure.getText()))
        {
            JOptionPane.showMessageDialog(this, "Blood pressure Feild is invalid.");
        }
        else
        {
        Encounter pe;
        for(Patient p: patientDirectory.getPatientDirectory())
         {
             if(p.getPatientID()==PatientID)
             {
             p.setName(txtName.getText());
             p.setPatientID(Integer.parseInt(txtPatientID.getText()));
             pe = p.getEH().addNewEncounter();
             pe.setBloodPressure(Integer.parseInt(txtBloodPressure.getText()));
             pe.setTemperature(Integer.parseInt(txtTemperature.getText()));
             pe.setPulse(Integer.parseInt(txtPulse.getText()));
             DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
             LocalDateTime now = LocalDateTime.now();
             String UpdateTime = dtf.format(now);
             pe.setUpdateTime(UpdateTime);
             if(pe.getBloodPressure()>120 || pe.getBloodPressure()<80 || pe.getPulse()<60 || pe.getPulse()>100 || pe.getTemperature()>103 || pe.getTemperature()<96)
             p.setAbnormal(true);
             else
             p.setAbnormal(false);    
             
             if(pe.getBloodPressure()>120 || pe.getBloodPressure()<80)
                 p.setAbnormalBloodPressure(true);
             else
                 p.setAbnormalBloodPressure(false);
             
             if(pe.getPulse()<60 || pe.getPulse()>100)
             p.setAbnormalPulse(true);
             else
             p.setAbnormalPulse(false);
             
             if(pe.getTemperature()>103 || pe.getTemperature()<96)
                 p.setAbnormalTemperature(true);
             else
                 p.setAbnormalTemperature(false);
             
             JOptionPane.showMessageDialog(this, "New Encounter added.");
             
            txtBloodPressure.setText("");
            txtTemperature.setText("");
            txtPulse.setText(""); 
            }
        }
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
