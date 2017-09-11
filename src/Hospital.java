import controller.DataBase;
import controller.DoctorOperation;
import controller.OperationController;
import model.Doctor;
import view.ConsoleHelper;


public class Hospital {


    public static void main(String[] args) {
        start();


    }

    private static void start(){
        DataBase db = new DataBase();
        ConsoleHelper.printString("Choose a Doctor, by input his number");
        Doctor doctor =  db.chooseDoctor();
        ConsoleHelper.printString("You have chosen " + doctor.toString());
        DoctorOperation operation;
        do {
            operation = OperationController.chooseOperation();
            doctor.executeOperation(operation);
        }while (operation != DoctorOperation.Exit);
        ConsoleHelper.printString("Do you want choose another doctor? (Y/N)");
        String answer = ConsoleHelper.readString();
        if (answer.equalsIgnoreCase("Y")){
            start();
        }
    }
}
