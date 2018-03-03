package Start;

import RegMaps.RegMap;
import RegMaps.RegMapStart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * запускающий игру класс
 */
public class Start {
    public static boolean exit = false;
    public static RegMap rm = new RegMapStart("0").set();

    public static void main(String[] args) {
        //class player
        Player p = new Player();

        //while RegMap
        while (!exit) {
            rm.go();
        }

        //end
        System.out.println("The End.");
    }

    public static String in() {
        String ss = "error";
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            ss = is.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            exit = true;
        }
        return ss;
    }
}
