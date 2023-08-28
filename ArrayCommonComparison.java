import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ArrayCommonComparison {
    public static void main(String[] args) {
        // Create and populate the arrays
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(500) + 1;
            array2[i] = random.nextInt(500) + 1;
        }

        System.out.print("Array 1: ");
        printArray(array1);
        System.out.print("Array 2: ");
        printArray(array2);

        // Find common elements
        Set<Integer> commonElements = new HashSet<>();
        for (int num : array1) {
            for (int value : array2) {
                if (num == value) {
                    commonElements.add(num);
                    break;
                }
            }
        }

        System.out.println("Common elements: " + commonElements);
        System.out.println("Number of common elements: " + commonElements.size());

        // Calculate and display the sum of common elements
        int sumCommonElements = 0;
        for (int num : commonElements) {
            sumCommonElements += num;
        }
        System.out.println("Sum of common elements: " + sumCommonElements);

        // Find non-common elements
        Set<Integer> allNonCommonElements = new HashSet<>();
        for (int num : array1) {
            if (!commonElements.contains(num)) {
                allNonCommonElements.add(num);
            }
        }
        for (int num : array2) {
            if (!commonElements.contains(num)) {
                allNonCommonElements.add(num);
            }
        }

        // Calculate and display the average of non-common elements
        int numNonCommonElements = allNonCommonElements.size();
        if (numNonCommonElements > 0) {
            int sumNonCommonElements = 0;
            for (int num : allNonCommonElements) {
                sumNonCommonElements += num;
            }
            double averageNonCommonElements = (double) sumNonCommonElements / numNonCommonElements;
            System.out.println("Average of non-common elements: " + averageNonCommonElements);
        } else {
            System.out.println("No non-common elements found.");
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
