import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Geben sie den zu verschlüsselnden Satz ein: ");
        String text = in.nextLine();

        int shift = 1;

        String resultR = Verschlüsselung(text, shift);
        System.out.println("Originaltext: " + text);
        System.out.println("Verschlüsselter Text: " + resultR);



        in.close();
    }

    public static String Verschlüsselung(String text, int shift){
        String result = "";

        for(int i = 0; i < text.length(); i++){
            char buchstabe = text.charAt(i);

            if(buchstabe >= 65 && buchstabe < 90){
                char alt = buchstabe;
                alt++;
                buchstabe = (char) alt;
            } else if(buchstabe >= 97 && buchstabe < 122){
                char alt = buchstabe;
                alt++;
                buchstabe = (char) alt;
            } else if(buchstabe == 90){
                buchstabe = 'A';
            } else if(buchstabe == 122){
                buchstabe = 'a';
            } 
            result += buchstabe;
        }
        return result;
    }
}
