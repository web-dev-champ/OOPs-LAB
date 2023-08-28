public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] array = {29, 10, 14, 37, 13};
        System.out.println("Original Array:");
        displayArray(array);

        bubbleSort(array);

        System.out.println("\nSorted Array:");
        displayArray(array);
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    System.out.print("Pass " + (i + 1) + ", Step " + (j + 1) + ": ");
                    displayArray(arr);
                }
            }
        }
    }

    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}