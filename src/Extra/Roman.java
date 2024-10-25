import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to get calculated: ");
        int number = in.nextInt();

        String romanLettersL = Calculation(number);

        if(number < 1 || number > 3999){
            System.out.println("Invalid input!");
        } else {
            System.out.println("Converted Number: " + romanLettersL);
        }
    }

    public static String Calculation(int number){
        int[] digits = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] letters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String romanLetters = "";

        for(int i = 0; i < digits.length; i++){
            while(number >= digits[i]){
                number -= digits[i];
                romanLetters += letters[i];
            }
        }
        return romanLetters;
    }
}
