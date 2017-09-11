import model.Doctor;
import view.ConsoleHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Hospital {


    public static void main(String[] args) {

        DataBase db = new DataBase();
        Doctor doctor =  db.chooseDoctor();


    }
}
