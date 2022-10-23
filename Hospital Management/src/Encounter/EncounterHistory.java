/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encounter;

import java.util.ArrayList;

/**
 *
 * @author BARATHI
 */
public class EncounterHistory {
    private ArrayList <Encounter> EncounterHistory;

    public void setEncounterHistory(ArrayList<Encounter> EncounterHistory) {
        this.EncounterHistory = EncounterHistory;
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return EncounterHistory;
    }
    public EncounterHistory() {
        this.EncounterHistory = new ArrayList <Encounter>();
    }
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        EncounterHistory.add(newEncounter);
        return newEncounter;
    }
    public void deleteEncounter(Encounter E)
    {
        EncounterHistory.remove(E);
    }
}
