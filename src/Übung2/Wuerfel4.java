import java.util.Scanner;

public class Wuerfel4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = 0;

        int zufallZahl = Zahl();

        while(guess != zufallZahl){
            System.out.println("Erraten sie die Zahl: ");
            guess = in.nextInt();

            if(guess < zufallZahl){
                System.out.println("Zu niedrig!");
            } else if(guess > zufallZahl){
                System.out.println("Zu hoch!");
            }
        }

        System.out.printf("Richtig geraten, die zahlen %d und %d stimmen überein.\n", guess, zufallZahl);

        in.close();
    }

    public static int Zahl(){
        int zufall = (int) (Math.random() *10) +1;

        return zufall;
    }
}
