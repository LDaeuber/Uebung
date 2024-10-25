//Geben Sie einen Countdown von 100 bis 0 in 1er-Schritten mittels einer while-Schleife aus. Lassen Sie
//dabei per continue alle Zahlen aus, die durch 19 teilbar sind (verwenden Sie dazu den ModuloOperator). 
//Achten Sie darauf, dass auch wirklich bis 0 gezählt wird. 

public class Aufgabe3b {
    public static void main(String[] args) {
        int number = 100;

        while (number >= 0) {
            // Wenn die Zahl nicht durch 19 teilbar ist, überspringe sie
            if (number % 19 != 0) {
                number--;
                continue;  // Überspringe den Rest der Schleife
            }

            // Ausgabe der Zahl, wenn sie durch 19 teilbar ist
            System.out.println(number);
            number--;
        }
    }
}
