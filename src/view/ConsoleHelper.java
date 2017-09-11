package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void printString (String s){
        System.out.println(s);
    }

    public static String readString () throws IOException {
        return reader.readLine();
    }

    public static int readInt () throws IOException {
        return Integer.valueOf(readString());
    }

}
