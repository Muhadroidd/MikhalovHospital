package controller;

import view.ConsoleHelper;

//Operations enum for chosen doctor
public enum DoctorOperation {
    List, Change, Add, Remove, Details, Exit ;

    public static void printOperations (){
        for (int i = 0; i <values().length ; i++) {
            ConsoleHelper.printString(i + " " + DoctorOperation.values()[i].toString());
        }
    }
}
