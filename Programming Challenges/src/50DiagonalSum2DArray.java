class DiagonalSum2DArray {

    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum");

        int[][] numArr = ArrayUtility.input2DArray();

        if (numArr.length != numArr[0].length) {
            System.out.println("Diagonal sum can only be calculated for a square matrix.");
            return;
        }

        long sum = sumOfDiagonals(numArr);
        System.out.println("Sum of diagonals is: " + sum);
    }

    public static long sumOfDiagonals(int[][] numArr) {
        long leftSum = sumOfLeftDiagonal(numArr);
        long rightSum = sumOfRightDiagonal(numArr);

        long sum = leftSum + rightSum;

        // Subtract the middle element once if the matrix size is odd
        if (numArr.length % 2 != 0) {
            int mid = numArr.length / 2;
            sum -= numArr[mid][mid];
        }

        return sum;
    }

    public static long sumOfLeftDiagonal(int[][] numArr) {
        long sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i][i];
        }

        return sum;
    }

    public static long sumOfRightDiagonal(int[][] numArr) {
        long sum = 0;
        int n = numArr.length;

        for (int i = 0; i < n; i++) {
            sum += numArr[i][n - 1 - i];
        }

        return sum;
    }
}