//Geben Sie mittels for-Schleife einen Countdown von 100 bis 0 in 5er-Schritten aus

public class Aufgabe3a {
    public static void main(String[] args) {
        int zahl = 100;

        for(int i = zahl; i >= 0; i-=5){
            System.out.println(i);
        }
    }
}