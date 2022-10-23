/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author BARATHI
 */
public class HospitalDirectory {
    private ArrayList <Hospital> HospitalDirectory;
    
    public HospitalDirectory()
    {
        this.HospitalDirectory= new ArrayList<Hospital>();
    }

    public void setHospitalDirectory(ArrayList<Hospital> HospitalDirectory) {
        this.HospitalDirectory = HospitalDirectory;
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return HospitalDirectory;
    }
    public Hospital addHospital()
    {
     Hospital h=new Hospital();
     HospitalDirectory.add(h);
     return h;
    }
    public void deleteHospital(Hospital h)
    {
        HospitalDirectory.remove(h);
    }

    
}
