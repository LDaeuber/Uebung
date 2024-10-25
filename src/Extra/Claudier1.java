public class Claudier1 {
    public static void main(String[] args) {
        String[][] kaiser = {
            {"Gaius Octavius Augustus"},
            {"Tiberius Caesar Augustus"},
            {"Gaius Caesar Augustus Germanicus"},
            {"Tiberius Claudius Nero Germanicus"},
            {"Nero Claudius Caesar Augustus Germanicus"}
        };

        for(int i = 0; i < kaiser.length; i++){
            System.out.println("Kaiser " + (i +1) + ": " + kaiser[i][0]);
            String[] namen = kaiser[i][0].split(" ");
            for(int j = 0; j < namen.length; j++){
                System.out.println((j + 1) + ". Name: " + namen[j]);
            }
            System.out.println();
        }
    }
}   