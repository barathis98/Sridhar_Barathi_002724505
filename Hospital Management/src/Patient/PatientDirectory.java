/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import java.util.ArrayList;

/**
 *
 * @author BARATHI
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        this.patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    public Patient addNewPatient(){
        Patient newPatient = new Patient();
        patientDirectory.add(newPatient);
        return newPatient;
    }
    public void deletePatient(Patient newPatient){
        patientDirectory.remove(newPatient);
    }
}
