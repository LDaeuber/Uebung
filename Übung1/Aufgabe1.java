import java.util.*;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wie ist ihr Name?");
        String name = in.nextLine();

        System.out.printf("Hallo %s !", name);

        in.close();
    }
}
