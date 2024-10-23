import java.util.Scanner;

public class SummenBerechnung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Geben sie den Startwert ein: ");
        int start = in.nextInt();

        System.out.println("Geben sie den Endwert ein: ");
        int ende = in.nextInt();

        int summeS = Berechnung(start, ende);
        System.out.println("Die Summe beträgt: " + summeS);

        in.close();
    }

    public static int Berechnung(int start, int ende){

        int summe = 0;
        for(int i = start; i <= ende; i++){
            summe += i;
        }
        return summe;
    }
}
