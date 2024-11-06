import java.util.Random;

public class Lab9 {
    public static void main(String[] args) {
        Random rnd = new Random();

        // Declare and initialize the array with random values between 1 and 100
        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;  // Random value between 1 and 100
        }

        // Call getAverage method and display the result
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Static method to calculate and return the average of the array
    public static double getAverage(int values[]) {
        int sum = 0;  // Variable to store the sum of the elements
        for (int value : values) {
            sum += value;  // Add each value in the array to the sum
        }
        return (double) sum / values.length;  // Return the average as a double
    }
}
