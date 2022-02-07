import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);                 // [1]
        while (true) {                                            // [2]
            System.out.println("Enter your name:");                // [3]
            String name = scanner.nextLine().trim();               // [4]
            if (name.length() >= 2) {                              // [5]
                return name;                                        // [6]
            }
            System.out.println("Name is too short. Try again.");
        }
    }
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();         // [1]
            if (calc.equals("A")) {                                        // [2]
                return "ADD";                                               // [3]
            } else if (calc.equals("S")) {                                 // [4]
                return "SUB";                                               // [5]
            } else if (calc.equals("D")) {                                 // [6]
                return "DIV";                                               // [7]
            } else if (calc.equals("M")) {                                 // [8]
                return "MUL";                                               // [9]
            }                                                              // [10]
            System.out.println("Wrong calculation. Try again.");
        }
    }
    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }
}

