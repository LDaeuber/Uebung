import java.util.Scanner;

//Schreiben Sie ein Programm, das eine Zufallszahl ermittelt, die der Benutzer erraten soll. Das
//Programm gibt dabei Hinweise, ob die Eingabe zu hoch oder zu niedrig war.

public class Aufgabe3d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = 0;
        int goal = (int) (Math.random() * 10) + 1;

        try {
            while (guess != goal) {
                System.out.println("Errate eine Zahl zwischen 1 und 10!");
                guess = in.nextInt();

                // Check if the entered number is greater than 10
                if (guess > 10) {
                    throw new Exception("Die Zahl darf nicht größer als 10 sein!"); // Custom exception
                }

                if (guess < goal) {
                    System.out.printf("%d ist zu niedrig\n", guess);
                } else if (guess > goal) {
                    System.out.printf("%d ist zu hoch\n", guess);
                } else {
                    System.out.println("***Glückwunsch***\nDu hast die Zahl erraten!");
                }
            }
        } catch (Exception e) {
            // Handle the exception if the input is greater than 10
            System.out.println(e.getMessage());
        } finally {
            in.close(); // Close the scanner to avoid resource leak
        }
    }
}

