package controller;


import view.ConsoleHelper;

import java.io.IOException;

public class OperationController {

    private static DoctorOperation[] operations = DoctorOperation.values();

    public static DoctorOperation chooseOperation (){
        ConsoleHelper.printString("Please chose operation");
        DoctorOperation.printOperations();
        try {
            return operations[ConsoleHelper.readInt()];
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e) {
            ConsoleHelper.printString("Oops wrong input, try again");
            return  chooseOperation();
        }
    }

}
