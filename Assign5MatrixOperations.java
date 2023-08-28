import java.util.Random;

public class Assign5MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
            }
        }

        System.out.println("Matrix:");
        displayMatrix(matrix);
        int mainDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        System.out.println("Sum of main diagonal elements: " + mainDiagonalSum);
        int secondaryDiagonalProduct = 1;
        for (int i = 0; i < matrix.length; i++) {
            secondaryDiagonalProduct *= matrix[i][matrix.length - 1 - i];
        }
        System.out.println("Product of secondary diagonal elements: " + secondaryDiagonalProduct);
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
