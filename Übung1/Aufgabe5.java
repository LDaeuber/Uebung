import java.util.*;

public class Aufgabe5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Gewicht (in kg):");
        double gewicht = in.nextDouble();

        System.out.println("Größe (in m):");
        double groeße = in.nextDouble();
        in.nextLine(); // Konsumiert den verbleibenden Zeilenumbruch

        System.out.println("Name des Patienten:");
        String name = in.nextLine();

        double bmiB = Rechner(groeße, gewicht);

        if (bmiB < 30) {
            System.out.printf("%s hat Normalgewicht.\n", name);
        } else if (bmiB >= 30 && bmiB < 35) {
            System.out.printf("%s hat Adipositas Typ 1.\n", name);
        } else if (bmiB >= 35 && bmiB < 40) {
            System.out.printf("%s hat Adipositas Typ 2.\n", name);
        } else {
            System.out.printf("%s hat Adipositas Typ 3.\n", name);
        }

        in.close();
    }

    public static double Rechner(double groeße, double gewicht) {
        double bmi = gewicht / (groeße * groeße);
        return bmi;
    }
}
