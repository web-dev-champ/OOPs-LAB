import java.util.*;


public class ArrayOperations {

    public static void main(String[] args) {
        // Create an array of integers with a size of 10
        int[] array = new int[10];

        // Fill the array with random integer values between 1 and 100 (inclusive)
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        // Calculate and display the sum of all the elements in the array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The sum of all the elements in the array is " + sum);

        // Find and display the maximum and minimum values in the array
        int max = array[0];
        int min = array[0];
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The maximum value in the array is " + max);
        System.out.println("The minimum value in the array is " + min);

        // Calculate and display the average of the array elements
        float average = (float) sum / array.length;
        System.out.println("The average of the array elements is " + average);

        // Search for a specific integer value entered by the user. Display whether the value is present in the array or not
        System.out.print("Enter an integer value to search for: ");
        int searchValue = sc.nextInt();
        boolean found = false;
        int z=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                z=i;
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The value " + searchValue + " is present in the array at "+(z+1));
        } else {
            System.out.println("The value " + searchValue + " is not present in the array");
        }
    }
}
