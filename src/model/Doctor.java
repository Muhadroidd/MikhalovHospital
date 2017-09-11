package model;


import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String name;

    public Doctor(String name) {
        this.name = name;
    }

    List<Patient> patients = new ArrayList<>();

    public void addPatient (Patient patient){
        patients.add(patient);
    }

    public void removePatient (int index){
        patients.remove(index);
    }

    public Patient getPatient (int index){
        return patients.get(index);
    }

    @Override
    public String toString() {
        return "Doctor " +name;
    }
}
