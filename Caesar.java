import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Geben sie den zu übersetzenden Satz ein: ");
        String text = in.nextLine();
        int shift = 2;

        String resultR = Verschlüsselung(text, shift);
        System.out.println("Originaltext: " + text);
        System.out.println("Verschlüsselter Text: " + resultR);

        in.close();
    }

    public static String Verschlüsselung(String text, int shift){
        String result = "";
        
        for(int i = 0; i < text.length(); i++){
            char buchstabe = text.charAt(i);
            
            if(buchstabe >= 65 && buchstabe <= 90){
                int alterBuchstabe = buchstabe;
                alterBuchstabe += shift;
                buchstabe = (char) alterBuchstabe;
            } else if(buchstabe >= 97 && buchstabe <= 122){
                int alterBuchstabe = buchstabe;
                alterBuchstabe += shift;
                buchstabe = (char) alterBuchstabe;
            } else if(buchstabe == 90){
                buchstabe = 'A';
                System.out.println(buchstabe);
            } else if(buchstabe == 122){
                buchstabe = 'a';
                System.out.println(buchstabe);
            } else{
                System.out.println(buchstabe);
            }
            result += buchstabe;
        }
        return result;
    }
}
