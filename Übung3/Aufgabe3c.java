//Schreiben Sie ein Programm, das zwei Ganzzahlen von der Tastatur einliest und die Summe von der
//ersten bis zur zweiten Zahl ausgibt (Berechnung per for-Schleife).
//Beispiel: Summe von 20 bis 30 wird berechnet als 20+21+22+23+24+25+26+27+28+29+30.
//Die Summe von 20 bis 30 ist 275 

import java.util.Scanner;

public class Aufgabe3c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Geben sie die erste Zahl ein: ");
        int zahl1 = in.nextInt();
        System.out.println("Geben sie die zweite Zahl ein: ");
        int zahl2 = in.nextInt();

        int summe = 0;

        for(int i = zahl1; i <= zahl2 ; i++){
            summe += i;
        }

        System.out.printf("Die Summe von %d bis %d ist %d", zahl1, zahl2, summe);

        in.close();
    }
}
