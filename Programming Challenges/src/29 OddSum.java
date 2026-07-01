import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of all odd numbers from 1 to n: ");
        int num = input.nextInt();
        oddSum(num);
    }

    public static void oddSum(int num) {
        int i = 1;
        int sum = 0;
        while(i <= num) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of Odd number between 1 to " + num + " = " + sum);
    }
}