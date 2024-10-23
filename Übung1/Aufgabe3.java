import java.util.*;

public class Aufgabe3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl 1 ein: ");
        double zahl1 = in.nextDouble();

        System.out.println("Geben sie Zahl 2 ein: ");
        double zahl2 = in.nextDouble();

        double rest = zahl1 % zahl2;

        System.out.printf("%s modulo %s ergibt %s", zahl1, zahl2, rest);

        in.close();
    }
}
