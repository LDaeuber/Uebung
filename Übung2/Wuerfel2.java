public class Wuerfel2 {
    public static void main(String[] args) {

        int zufall = 0;
        int zaehler = 0;
        while(zufall != 6){
            zaehler++;
            zufall = (int) (Math.random() *6) + 1;
            System.out.printf("Der %d. Wurf war eine %d. \n", zaehler, zufall);
        }
        System.out.println("Glückwunsch zur 6!");
    }
}
