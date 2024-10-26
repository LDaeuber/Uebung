import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomLine {

    public static void main(String[] args) {
        String dateiname = "Texto.txt";
        ArrayList<String> zeilen = new ArrayList<>();
        
        try {
            Scanner in = new Scanner(new File(dateiname));
            
            // Zeilen in ArrayList hinzufügen
            while (in.hasNext()) {
                String zeile = in.nextLine();
                zeilen.add(zeile);
            }
            in.close();
            
            if(!zeilen.isEmpty()){
                int randomIndex = (int) (Math.random() * zeilen.size());
                System.out.println("Zufällige Zeile: " + zeilen.get(randomIndex));
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Datei " + dateiname + " wurde nicht gefunden.");
        }
    }
}
