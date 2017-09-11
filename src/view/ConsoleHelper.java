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
            String res = reader.readLine();
            if (!res.isEmpty()){
                return res;
            }
            else return readString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int readInt () throws IOException {
        return Integer.valueOf(readString());
    }

}
