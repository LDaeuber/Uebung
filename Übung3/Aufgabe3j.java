public class Aufgabe3j {
    public static void main(String[] args) {
        // Konstante zur Überprüfung des Ergebnisses
        double piExact = Math.PI;
        System.out.printf("PI laut Math.PI: %.15f%n", piExact);

        // Schleife für k von 10^1 bis 10^7
        for (int exponent = 1; exponent <= 7; exponent++) {
            int maxK = (int) Math.pow(10, exponent);
            double piApprox = 1.0;

            // Wallis-Produkt
            for (int k = 1; k <= maxK; k++) {
                // Kleinere Berechnungen durchführen, um Overflows zu vermeiden
                double fraction = (4.0 * k * k) / (4.0 * k * k - 1);
                piApprox *= fraction;
                
                // Abbrechen, wenn das Ergebnis zu groß wird (Overflow)
                if (Double.isInfinite(piApprox)) {
                    System.out.println("Overflow detected at k = " + k);
                    break;
                }
            }

            piApprox *= 2; // Ergebnis mit 2 multiplizieren
            System.out.printf("k von 1 bis %d: PI ist %.6f%n", maxK, piApprox);
        }
    }
}
