import java.util.Scanner;

public class ColoursName {
    public static String getColoursName(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Select colour - type first letter (W-white, B-black, N-navy, Y-yellow, O-orange)");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour){
                case "W":
                    return "White";
                case "B":
                    return "Black";
                case "N":
                    return "Navy";
                case "Y":
                    return "Yellow";
                case "O":
                    return "Orange";
                default:
                    System.out.println("Wring colour. Try again");
            }
        }
    }
}
