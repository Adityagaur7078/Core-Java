import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Please enter element number " + (i + 1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }

        return nums;
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }

        return arr;
    }

    public static void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}