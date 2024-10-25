import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringToChar {
    public static void main(String[] args) {
        String dateiname = "Test1.txt";

        try {
            Scanner in = new Scanner(new File(dateiname));
            
            // Check if there is a line to read
            if (in.hasNextLine()) {
                String satz = in.nextLine();

                for(int i = 0; i < satz.length(); i++) {
                    char zeichen = satz.charAt(i);
                    System.out.print(zeichen + " ");
                }
            } else {
                System.out.println("Die Datei ist leer.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden!");
        }
    }
}
