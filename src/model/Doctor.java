package model;


import controller.DoctorOperation;
import view.ConsoleHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    public void addPatient (Patient patient){
        patients.add(patient);
    }

    public void removePatient (){
        try {
            patients.remove(ConsoleHelper.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }catch (IllegalArgumentException | IndexOutOfBoundsException e){
            ConsoleHelper.printString("wrong patient number try again");
            removePatient();
        }

    }

    public Patient getPatient (){
        try {
            return patients.get(ConsoleHelper.readInt());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }catch (IndexOutOfBoundsException | IllegalArgumentException e){
            ConsoleHelper.printString("wrong number try again");
            return getPatient();
        }
    }

    @Override
    public String toString() {
        return "Doctor " +name;
    }



    public void executeOperation (DoctorOperation operation){
        switch (operation){
            case Add:

                ConsoleHelper.printString("please write name");
                String name = ConsoleHelper.readString();
                ConsoleHelper.printString("please write description");
                String description = ConsoleHelper.readString();
                ConsoleHelper.printString("please write time of visit");
                String time = ConsoleHelper.readString();
                patients.add(new Patient(name, time, description));
                break;

            case List:

                for (int i = 0; i <patients.size() ; i++) {
                    ConsoleHelper.printString(i+" " + patients.get(i).getName());
                }
                break;

            case Change:

                ConsoleHelper.printString("please input patient number");
                Patient target = getPatient();
                ConsoleHelper.printString("input new name (if not inputted remains unchanged)");
                String newName = ConsoleHelper.readString();
                ConsoleHelper.printString("input new description (if not inputted remains unchanged)");
                String newDescr = ConsoleHelper.readString();
                ConsoleHelper.printString("print new time (if not inputted remains unchanged)");
                String newTime = ConsoleHelper.readString();
                if (!newName.isEmpty()) target.setName(newName);
                if (!newDescr.isEmpty()) target.setDescription(newDescr);
                if (!newTime.isEmpty()) target.setTimeOfVisit(newTime);
                break;

            case Remove:
                ConsoleHelper.printString("please write number of patient for removing");
                removePatient();
                break;

            case Details:

                ConsoleHelper.printString("please input patient number");
                Patient detailsTarget = getPatient();
                ConsoleHelper.printString(detailsTarget.toString());
                break;

        }
    }
}
