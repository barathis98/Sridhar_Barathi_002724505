/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Encounter.Encounter;
import Encounter.EncounterHistory;
import Patient.Patient;
import Patient.PatientDirectory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BARATHI
 */
public class ViewVitals extends javax.swing.JFrame {

    /**
     * Creates new form ViewVitals
     */
    PatientDirectory pd = new PatientDirectory();
    int loggedPatient;
    public ViewVitals(int loggedPatient) {
        initComponents();
       // this.pd=pd;
       pd.getDbPatientDirectory();
        this.loggedPatient=loggedPatient;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblVitals = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jButton1)
                .addContainerGap(419, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(112, 112, 112))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(183, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //populateTable();
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        model.setRowCount(0);
        for(Patient p: pd.getPatientDirectory())
        {
            if(p.getPatientID()==loggedPatient)
            {
         EncounterHistory eh;
                
                eh=p.getEH();
                eh.EncounterHistory(loggedPatient);
                //eh.deleteEncounterHistory(loggedPatient);
                System.out.println(p.getName());
                Object[] row = new Object[6];
               // p.getEH().EncounterHistory(PatientID);
                //System.out.println(p.getEH());
                
                for(Encounter e: eh.getEncounterHistory())
                {
                    //System.out.print(e.getPulse());
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
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      //  populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewVitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblVitals;
    // End of variables declaration//GEN-END:variables
public void populateTable()
{
    DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        model.setRowCount(0);

        for(Patient p: pd.getPatientDirectory())
        {
            if(p.getPatientID()==loggedPatient)
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
}
}