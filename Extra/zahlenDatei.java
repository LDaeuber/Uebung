import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class zahlenDatei{
    public static void main(String[] args) {
        String dateiname = "Test.txt";
        ArrayList<Integer> zahlen = new ArrayList<>(); 
        int summe = 0;

        try {
            Scanner in = new Scanner(new File(dateiname));
            while(in.hasNext()){
                int zahl = in.nextInt();
                summe += zahl;
                zahlen.add(zahl);
            }


            System.out.println("Summe der Zahlen: " + summe);
            System.out.println("Zahlen: " + zahlen);



        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden!");
        }
        
    }
}