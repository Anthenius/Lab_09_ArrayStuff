import java.util.Random;

public class Lab9 {
    public static void main(String[] args) {
        // Declare an array of type int with 100 elements
        int[] dataPoints = new int[100];

        // Create a Random object to generate random numbers
        Random rnd = new Random();

        // Use a for loop to initialize each element in the array to a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1; // random number between 1 and 100
        }

        // Second loop to display values separated by " | "
        for (int i = 0; i < dataPoints.length; i++) {
            if (i == dataPoints.length - 1) {
                // For the last element, print without " | "
                System.out.print(dataPoints[i]);
            } else {
                // For all other elements, print with " | " after the value
                System.out.print(dataPoints[i] + " | ");
            }
        }

        // Print a newline after displaying the array for readability
        System.out.println();

        // Now calculate the sum and the average of the dataPoints array
        int sum = 0;

        // Loop through the array to sum the values
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i]; // Add each value to the sum
        }

        // Calculate the average
        double average = sum / (double) dataPoints.length;

        // Output the sum and average with a description
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        // Task 5: Use SafeInput to get user input for a number between 1 and 100
        int userValue = SafeInput.getRangedInt(rnd, "Please enter an integer between 1 and 100", 1, 100);
        System.out.println("You entered: " + userValue);

        // Task 6: Loop through the array and count how many times the user's value is found
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++; // Increment count when a match is found
            }
        }

        // Output the result
        System.out.println("The value " + userValue + " was found " + count + " times in the dataPoints array.");
    }
}
