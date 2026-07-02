import java.util.Scanner;

class ReverseOfDigits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        Reverse(num);
    }

    public static void Reverse(int num) {
        // Store reversed number

        int reverse = 0;

        // Repeat until number becomes 0

        while(num != 0)
        {
            // Get last digit

            int digit = num % 10;

            // Add digit to reversed number

            reverse = reverse * 10 + digit;

            // Remove last digit

            num = num / 10;
        }

        System.out.println("Reversed Number = " + reverse);
    }
}