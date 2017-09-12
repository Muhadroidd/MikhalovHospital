package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void printString (String s){
        System.out.println(s);
    }

    public static String readString (){
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int readInt (){
        return Integer.valueOf(readString());
    }

    public static String requestString (String msg){
        printString(msg);
        return readString();
    }

}
