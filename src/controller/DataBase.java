package controller;

import model.Doctor;
import view.ConsoleHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {
    private List<Doctor> doctors = new ArrayList<>();

    public DataBase() {
        addTestData();
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public Doctor getDoctor (int index){
        return doctors.get(index);
    }

    public Doctor chooseDoctor (){

        for (int i = 0; i < doctors.size(); i++) {
            Doctor doctor = doctors.get(i);
            ConsoleHelper.printString(i +" "+ doctor.toString());
        }
        try {
            return doctors.get(ConsoleHelper.readInt());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        catch (IllegalArgumentException | IndexOutOfBoundsException e){
            ConsoleHelper.printString("wrong input, try again");
            return chooseDoctor();
        }
    }

    private void addTestData() {
        Doctor[] testDocs = {new Doctor("House"), new Doctor("Petrovich"), new Doctor("Vasylivna")};
        doctors.addAll(Arrays.asList(testDocs));
    }
}
