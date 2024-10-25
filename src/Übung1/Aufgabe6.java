import java.util.*;

public class Aufgabe6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) { 
            System.out.println("Welche Figur willst du berechnen? Kreis(k) | Quadrat(q) | Rechteck(r) | Trapez(t) | Beenden(x): ");
            String input = in.nextLine();

            switch(input){
                case "k":
                    System.out.println("Gib den Radius des Kreises ein: ");
                    double radius = in.nextDouble();
                    in.nextLine();

                    double flaecheKreisK = RechnungKreis(radius);

                    System.out.printf("Die Fläche des Kreises beträgt %s cm^3\n", flaecheKreisK);
                    System.out.println();
                    break;

                case "q":
                    System.out.println("Gib die Seitenlänge ein: ");
                    double seite = in.nextDouble();
                    in.nextLine();

                    double flaecheQuadratQ = RechnungQuadrat(seite);

                    System.out.printf("Die Fläche des Quadrats beträgt %s cm^3\n", flaecheQuadratQ);
                    System.out.println();
                    break;

                case "r":
                    System.out.println("Geben sie die Länge des Rechtecks ein: ");
                    double laenge = in.nextDouble();
                    System.out.println("Geben sie die Breite des Rechtecks ein: ");
                    double breite = in.nextDouble();
                    in.nextLine();

                    double flaecheRechteckR = RechnungRechteck(laenge, breite);

                    System.out.printf("Die Fläche des Rechtecks beträgt %s cm^3\n", flaecheRechteckR);
                    System.out.println();
                    break;

                case "t":
                    System.out.println("Geben sie die Länge der ersten parallelen Seite ein: ");
                    double para1 = in.nextDouble();
                    System.out.println("Geben sie die Länge der zweiten parallelen Seite ein: ");
                    double para2 = in.nextDouble();
                    System.out.println("Geben sie die Höhe des Trapezes ein: ");
                    double hoehe = in.nextDouble();
                    in.nextLine();

                    double flaecheTrapezT = RechnungTrapez(para1, para2, hoehe);

                    System.out.printf("Die Fläche des Trapez beträgt %s cm^3\n", flaecheTrapezT);
                    System.out.println();
                    break;

                case "x":
                    System.out.println("Programm beendet!");
                    return;

                default:
                    System.out.println("Error: Falsche Eingabe!");
            }
        }
    }

    public static double RechnungKreis(double radius){
        double flaecheKreis = Math.PI * (radius * radius);
        return flaecheKreis;
     }

    public static double RechnungQuadrat(double seite){
        double flaecheQuadrat = seite * seite;
        return flaecheQuadrat;
    }

    public static double RechnungRechteck(double laenge, double breite){
        double flaecheRechteck = laenge * breite;
        return flaecheRechteck;
    }

    public static double RechnungTrapez(double para1, double para2, double hoehe){
        double flaecheTrapez = ((para1 + para2) / 2) * hoehe;
        return flaecheTrapez;
    }
}
