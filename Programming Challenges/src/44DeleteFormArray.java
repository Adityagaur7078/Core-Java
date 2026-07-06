import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");

        int[] numArr = ArrayUtility.inputArray();

        System.out.print("Now, enter the number you want to delete: ");
        int numToDelete = input.nextInt();

        int[] newArr = deleteNumber(numArr, numToDelete);

        System.out.println("Here is your new array");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = OccurrencesArray.noOfOccurrences(numArr, numToDelete);

        if (occ == 0) {
            return numArr;
        }

        int[] newArr = new int[numArr.length - occ];

        int j = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] != numToDelete) {
                newArr[j++] = numArr[i];
            }
        }

        return newArr;
    }
}