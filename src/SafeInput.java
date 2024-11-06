import java.util.Scanner;

public class SafeInput {

    // Method to get an integer from the user
    public static int getInt(Scanner pipe, String prompt) {
        int value = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                pipe.nextLine(); // Clear the buffer
            }
        }
        return value;
    }

    // Method to get an integer within a specified range (inclusive)
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value = 0; // Initialize value to a default (valid) value
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                if (value >= low && value <= high) {
                    isValid = true;
                } else {
                    System.out.println("Please enter a value between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.nextLine(); // Clear the buffer
            }
        }
        return value;
    }

    // Method to get a double within a specified range (inclusive)
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value = 0; // Initialize value to a default (valid) value
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                if (value >= low && value <= high) {
                    isValid = true;
                } else {
                    System.out.println("Please enter a value between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid decimal number.");
                pipe.nextLine(); // Clear the buffer
            }
        }
        return value;
    }

    // Method to get a Yes/No confirmation (returns true for 'yes', false for 'no')
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String value = ""; // Initialize value to an empty string
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt + " (Y/N): ");
            value = pipe.nextLine().trim().toUpperCase();
            if (value.equals("Y")) {
                return true;
            } else if (value.equals("N")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'Y' for Yes or 'N' for No.");
            }
        }
        return false; // This line will never be reached
    }

    // Method to get a string that is not empty
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String value = ""; // Initialize value to an empty string
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt + ": ");
            value = pipe.nextLine().trim();
            if (value.length() > 0) {
                isValid = true;
            } else {
                System.out.println("Input cannot be empty.");
            }
        }
        return value;
    }

    // Method to get a string that matches a regular expression (regex pattern)
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String value = ""; // Initialize value to an empty string
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt + ": ");
            value = pipe.nextLine().trim();
            if (value.matches(regEx)) {
                isValid = true;
            } else {
                System.out.println("Input does not match the required pattern. Please try again.");
            }
        }
        return value;
    }
}
