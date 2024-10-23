import java.util.*;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl 1 ein: ");
        int zahl1 = in.nextInt();

        System.out.println("Geben sie Zahl 2 ein: ");
        int zahl2 = in.nextInt();

        int rest = zahl1 % zahl2;

        System.out.printf("%d modulo %d ergibt %d", zahl1, zahl2, rest);

        in.close();
    }
}
