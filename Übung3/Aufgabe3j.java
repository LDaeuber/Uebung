//Wie 3i), aber mit dem Wallis-Produkt: https://de.wikipedia.org/wiki/Wallissches_Produkt. 

public class Aufgabe3j {
    public static void main(String[] args) {
        double pi = Math.PI;

        System.out.printf("PI laut Math.PI: %s\n", pi);

        for(int exponent = 1; exponent <= 7; exponent++){
            int k = (int) Math.pow(10, exponent);
            double piApproximation = 1.0;
            for(int n = 1; n < k; n++){
                piApproximation *= (double) (2 * n) * (2 * n) / ((2*n - 1) * (2 * n + 1));
            }
            piApproximation *= 2;

            System.out.printf("k von 0 bis %d: PI ist %.6f%n", k, piApproximation);
        }
    }
}