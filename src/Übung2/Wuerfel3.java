public class Wuerfel3 {
    public static void main(String[] args) {

        int zufall = 0;
        int zaehler = 0;
        while(zufall != 20){
            zaehler++;
            zufall = (int) (Math.random() *20) + 1;

            System.out.printf("Der %d. Wurf war eine %d. \n", zaehler, zufall);

            if(zufall == 13){
                continue;
            } else if(zufall == 7){
                break;
            }
        }
        System.out.println("Glückwunsch zur 20!");
    }
}
