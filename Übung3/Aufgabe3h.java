//Wie 3g), aber mit einer do-while-Schleife. 

public class Aufgabe3h {
    public static void main(String[] args) {
        int count = 0;
        int diceDouble = 0;
        boolean resume = true;

        do{ 
            count++;
            int dice = (int) (Math.random() *20) + 1;

            System.out.printf("%d. Wurf ist eine %d\n", count, dice);

            if(dice == diceDouble){
                System.out.printf("Es kam zweimal hintereinander eine %d", dice);
                resume = false;
            }

            diceDouble = dice;
        } while(resume);
    }
}
