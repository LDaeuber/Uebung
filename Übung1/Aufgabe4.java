import java.util.*;

public class Aufgabe4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String passwort = "sesam";
        String eingabe = "";

        while(!eingabe.equalsIgnoreCase(passwort)){
            System.out.println("Geben sie das Passwort ein: ");
            eingabe = in.nextLine();

            if (!eingabe.equalsIgnoreCase(passwort)) {
                System.out.println("Falsch, rate erneut!");
            }
        }
        System.out.println("Zugang gewährt");

        in.close();
    }
}
