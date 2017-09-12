package model;


import controller.DoctorOperation;
import view.ConsoleHelper;
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

    private void removePatient (){
        try {
            patients.remove(ConsoleHelper.readInt());
        }catch (IllegalArgumentException | IndexOutOfBoundsException e){
            ConsoleHelper.printString("wrong patient number try again");
            removePatient();
        }

    }

    private Patient getPatient (){
        try {
            return patients.get(ConsoleHelper.readInt());
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

                String name = ConsoleHelper.requestString("please write name");
                String description = ConsoleHelper.requestString("please write description");
                String time = ConsoleHelper.requestString("please write time of visit");
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
                String newName = ConsoleHelper.requestString("input new name (if not inputted remains unchanged)");
                String newDescr = ConsoleHelper.requestString("input new description (if not inputted remains unchanged)");
                String newTime = ConsoleHelper.requestString("print new time (if not inputted remains unchanged)");
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
