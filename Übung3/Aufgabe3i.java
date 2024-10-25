//Berechnen Sie die Kreiszahl PI mit der Leibnitz-Reihe: https://de.wikipedia.org/wiki/Leibniz-Reihe.
//Dabei können Sie die Formel direkt als for-Schleife formulieren, in der die Summanden mit dem
//Operator += addiert werden. Fügen Sie eine äußere Schleife hinzu, um k mittels Math.pow() von 10
//hoch 1 bis 10 hoch 7 hochzuzählen. Richten Sie sich nach folgendem Beispiel:

public class Aufgabe3i {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.printf("PI laut Math.PI: %.6f%n", pi);

        for(int exponent =  1; exponent <= 7; exponent++){
            int maxK = (int) Math.pow(10, exponent);
            double piApprox = 0.0;

            for(int k = 0; k <= maxK; k++){
                piApprox += Math.pow(-1 , k) / (2 * k + 1);
            }

            piApprox *= 4;
            System.out.printf("k von 0 bis %d: PI ist %.6f%n", maxK, piApprox);
        }
    }
}
