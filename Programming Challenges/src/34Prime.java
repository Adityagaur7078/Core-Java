import java.util.Scanner;

class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take input from user

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Call method

        checkPrime(num);

        input.close();
    }

    // Method to check prime number

    public static void checkPrime(int num)
    {
        // 0 and 1 are not prime

        if(num <= 1)
        {
            System.out.println(num + " is not a Prime Number.");
            return;
        }

        int i = 2;

        while(i < num)
        {
            // If divisible, number is not prime

            if(num % i == 0)
            {
                System.out.println(num + " is not a Prime Number.");
                return;
            }

            i++;
        }

        System.out.println(num + " is a Prime Number.");
    }
}