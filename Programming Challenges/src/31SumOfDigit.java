import java.util.Scanner;

class SumOfDigit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = input.nextInt();
        sumOfDigit(num);
    }

    public static void sumOfDigit(int num) {
        int sum = 0;
        while(num != 0) {
            sum  += num%10;
            num /= 10;
        }
        System.out.println(sum);
    }

}