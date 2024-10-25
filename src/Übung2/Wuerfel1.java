
public class Wuerfel1{
     
    public static void main(String[] args) {

        int summe = 0;
        for(int i = 1; i <= 100; i++){
            int zufall = (int) (Math.random() * 6) + 1;
            summe += zufall;
            System.out.printf("Der %s. Wurf ist eine %d.\n", i, zufall);
        }
        System.out.println("Die Summe nach 100 Mal Würfeln beträgt: " + summe);
    }
}