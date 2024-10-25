//Schreiben Sie ein Programm, welches mittels zweier geschachtelter Schleifen das kleine Einmaleins
//ausgibt


public class Aufgabe3e {
    public static void main(String[] args) {
        int[][] einmaleins = new int[10][10];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                einmaleins[i][j] = (i +1) * (j+1);
            }
        }

        System.out.print("   ");
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%2d ", j); // Ausgabe mit Formatierung
        }
        System.out.println();

        // Ausgabe des kleinen Einmaleins
        for (int i = 0; i < 10; i++) {
            // Zeilenkopf (Zahl 1 bis 10) ausgeben
            System.out.printf("%2d ", (i + 1)); // Formatierung für den Zeilenkopf
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d ", einmaleins[i][j]); // Formatierung der Produkte
            }
            System.out.println();
        }
    }
}
