/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import java.util.ArrayList;

/**
 *
 * @author BARATHI
 */
public class DoctorDirectory {
    private ArrayList <Doctor> list;
    
    public DoctorDirectory(){
        this.list = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getPatientDirectory() {
        return list;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.list = doctorDirectory;
    }
    public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        list.add(newDoctor);
        return newDoctor;
    }
    public void deleteDoctor(Doctor newDoctor){
        list.remove(newDoctor);
    }
}
