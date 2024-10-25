//Schreiben Sie ein Programm, das einen 20-seitigen Würfel solange wirft, bis zweimal hintereinander
//die gleiche Zahl kommt. Verwenden Sie dazu eine Endlosschleife (while(true)), aus der Sie
//mittels break aussteigen

public class Aufgabe3f {
    public static void main(String[] args) {
        int count = 0;
        int diceDouble = 0;

        while (true) { 
            count++;
            int dice = (int) (Math.random() *20) + 1;

            System.out.printf("%d. Wurf ist eine %d\n", count, dice);

            if(dice == diceDouble){
                System.out.printf("Es kam zweimal hintereinander eine %d", dice);
                break;
            }

            diceDouble = dice;
        }   
    }
}
